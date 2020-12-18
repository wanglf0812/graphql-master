package com.graphql.demo.graphqldemo.resolver;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.dataloader.DataLoader;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.demo.graphqldemo.dto.ShopDto;
import com.graphql.demo.graphqldemo.dto.Trade;
import com.graphql.demo.graphqldemo.dto.TradeDtls;

import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TradeResolver implements GraphQLResolver<Trade> {

	public CompletableFuture<List<TradeDtls>> tradeDtls(Trade trade,
			DataFetchingEnvironment dataFetchingEnvironment) {

		DataLoader<Long, List<TradeDtls>> tradeDtlsDataLoader = dataFetchingEnvironment.getDataLoaderRegistry()
				.getDataLoader("tradeDtlsLoader");
		return tradeDtlsDataLoader.load(trade.getId());
	}

	public CompletableFuture<ShopDto> shop(Trade trade,
			DataFetchingEnvironment dataFetchingEnvironment) {

		DataLoader<Long, ShopDto> tradeDtlsDataLoader = dataFetchingEnvironment.getDataLoaderRegistry()
				.getDataLoader("shopLoader");
		return tradeDtlsDataLoader.load(trade.getClid());
	}
}
