package com.graphql.demo.graphqldemo.dataLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import org.dataloader.BatchLoader;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.demo.graphqldemo.client.ProductClient;
import com.graphql.demo.graphqldemo.client.ShopClient;
import com.graphql.demo.graphqldemo.client.TradeDtlsClient;
import com.graphql.demo.graphqldemo.dao.AuthorDao;
import com.graphql.demo.graphqldemo.dao.BookDao;
import com.graphql.demo.graphqldemo.dto.Author;
import com.graphql.demo.graphqldemo.dto.Book;
import com.graphql.demo.graphqldemo.dto.ProductDto;
import com.graphql.demo.graphqldemo.dto.ShopDto;
import com.graphql.demo.graphqldemo.dto.TradeDtls;

@Component
public class DataLoaderInit {

	// Author Dao
	@Autowired
	private AuthorDao authorDao;

	// Book DAO
	@Autowired
	private BookDao bookDao;

	// TradeDtls Grpc Client
	@Autowired
	private TradeDtlsClient tradeDtlsClient;

	// Product Grpc Client
	@Autowired
	private ProductClient productClient;

	// Shop Grpc Client
	@Autowired
	private ShopClient shopClient;

	// Data Loader Registry

	private DataLoaderRegistry dataLoaderRegistry = new DataLoaderRegistry();

	public DataLoaderRegistry initDataLoaderRegistry() {

		DataLoader<String, Author> authorDataLoader = this.initAuthorLoader();
		dataLoaderRegistry.register("authorLoader", authorDataLoader);

		DataLoader<String, List<Book>> bookDataLoader = this.initBookLoader();
		dataLoaderRegistry.register("bookLoader", bookDataLoader);

		DataLoader<Long, List<TradeDtls>> tradeDtlsDataLoader = this.initTradeDtlsDataLoader();
		dataLoaderRegistry.register("tradeDtlsLoader", tradeDtlsDataLoader);

		DataLoader<Long, ProductDto> productDataLoader = this.initProductDataLoader();
		dataLoaderRegistry.register("productLoader", productDataLoader);

		DataLoader<Long, ShopDto> shopDataLoader = this.initShopDataLoader();
		dataLoaderRegistry.register("shopLoader", shopDataLoader);

		return this.dataLoaderRegistry;
	}

	/**
	 * Init Author Data Loader
	 * 
	 * @return Author Data Loader
	 */
	private DataLoader<String, Author> initAuthorLoader() {

		BatchLoader<String, Author> authorBatchLoader = new BatchLoader<String, Author>() {

			@Override
			public CompletionStage<List<Author>> load(List<String> keys) {

				return CompletableFuture.supplyAsync(() -> {
					List<Author> reAuthors = new ArrayList<>();
					List<Author> authors = authorDao.getAuthorsByIds(keys);
					for (String key : keys) {
						Author tmpAuthors = authors.stream()
								.filter(author -> key.equals(String.valueOf(author.getId()))).findFirst().orElse(null);
						reAuthors.add(tmpAuthors);
					}

					return reAuthors;
				});
			}
		};

		DataLoader<String, Author> authorLoader = DataLoader.newDataLoader(authorBatchLoader);

		return authorLoader;
	}

	/**
	 * Init Book Data Loader
	 * 
	 * @return Book Data Loader
	 */
	private DataLoader<String, List<Book>> initBookLoader() {

		BatchLoader<String, List<Book>> bookBatchLoader = new BatchLoader<String, List<Book>>() {

			@Override
			public CompletableFuture<List<List<Book>>> load(List<String> keys) {

				return CompletableFuture.supplyAsync(() -> {
					List<List<Book>> reBooks = new ArrayList<>();
					List<Book> books = bookDao.getAllBooksOfAuthorByIds(keys);
					for (String key : keys) {
						List<Book> tmpBooks = books.stream()
								.filter(book -> key.equals(String.valueOf(book.getAuthorId())))
								.collect(Collectors.toList());
						reBooks.add(tmpBooks);
					}

					return reBooks;
				});
			}
		};

		DataLoader<String, List<Book>> bookLoader = DataLoader.newDataLoader(bookBatchLoader);

		return bookLoader;
	}

	/**
	 * Init TradeDtls Data Loader
	 * 
	 * @return TradeDtls Data Loader
	 */
	private DataLoader<Long, List<TradeDtls>> initTradeDtlsDataLoader() {
		BatchLoader<Long, List<TradeDtls>> tradeDtlsBatchLoader = new BatchLoader<Long, List<TradeDtls>>() {

			@Override
			public CompletableFuture<List<List<TradeDtls>>> load(List<Long> keys) {

				return CompletableFuture.supplyAsync(() -> {
					List<List<TradeDtls>> reTradeDtls = new ArrayList<>();
					List<TradeDtls> tradeDtls = tradeDtlsClient.getTradeDetailList(keys);//todo
					for (Long key : keys) {
						List<TradeDtls> tmptradeDtls = tradeDtls.stream()
								.filter(dtls -> key.equals(dtls.getTradeId()))
								.collect(Collectors.toList());
						reTradeDtls.add(tmptradeDtls);
					}

					return reTradeDtls;
				});
			}

		};

		DataLoader<Long, List<TradeDtls>> tradeDtlsLoader = DataLoader.newDataLoader(tradeDtlsBatchLoader);

		return tradeDtlsLoader;
	}

	/**
	 * Init Product Data Loader
	 * 
	 * @return Product Data Loader
	 */
	private DataLoader<Long, ProductDto> initProductDataLoader() {

		BatchLoader<Long, ProductDto> productBatchLoader = new BatchLoader<Long, ProductDto>() {

			@Override
			public CompletionStage<List<ProductDto>> load(List<Long> keys) {

				return CompletableFuture.supplyAsync(() -> {
					List<ProductDto> reProducts = new ArrayList<>();
					List<ProductDto> reProductsList = productClient.getProductByLotNo(keys);
					for (Long key : keys) {
						ProductDto tmpProduct = reProductsList.stream()
								.filter(product -> key.equals(product.getLotNo())).findFirst().orElse(null);
						reProducts.add(tmpProduct);
					}

					return reProducts;
				});
			}
		};

		DataLoader<Long, ProductDto> productLoader = DataLoader.newDataLoader(productBatchLoader);

		return productLoader;
	}

	/**
	 * Init Shop Data Loader
	 * 
	 * @return Shop Data Loader
	 */
	private DataLoader<Long, ShopDto> initShopDataLoader() {

		BatchLoader<Long, ShopDto> shopBatchLoader = new BatchLoader<Long, ShopDto>() {

			@Override
			public CompletionStage<List<ShopDto>> load(List<Long> keys) {

				return CompletableFuture.supplyAsync(() -> {
					List<ShopDto> reShops = new ArrayList<>();
					List<ShopDto> reShopsList = shopClient.getShopById(keys);
					for (Long key : keys) {
						ShopDto tmpShop = reShopsList.stream().filter(shop -> key.equals(shop.getId())).findFirst()
								.orElse(null);
						reShops.add(tmpShop);
					}

					return reShops;
				});
			}
		};

		DataLoader<Long, ShopDto> shopLoader = DataLoader.newDataLoader(shopBatchLoader);

		return shopLoader;
	}
}
