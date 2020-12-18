package com.graphql.demo.graphqldemo.resolver;

import java.util.concurrent.CompletableFuture;

import org.dataloader.DataLoader;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.demo.graphqldemo.dto.ProductDto;
import com.graphql.demo.graphqldemo.dto.TradeDtls;

import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TradeDtlsResolver implements GraphQLResolver<TradeDtls> {

	public CompletableFuture<ProductDto> product(TradeDtls tradeDtls,
			DataFetchingEnvironment dataFetchingEnvironment) {

		DataLoader<Long, ProductDto> productDataLoader = dataFetchingEnvironment.getDataLoaderRegistry()
				.getDataLoader("productLoader");
		return productDataLoader.load(tradeDtls.getLotNo());
	}
}
