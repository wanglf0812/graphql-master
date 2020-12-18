package com.graphql.demo.graphqldemo.provider;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.SchemaParser;
import com.graphql.demo.graphqldemo.customerror.MyCustomExceptionHandler;
import com.graphql.demo.graphqldemo.resolver.AuthorResolver;
import com.graphql.demo.graphqldemo.resolver.BookResolver;
import com.graphql.demo.graphqldemo.resolver.MutationResolver;
import com.graphql.demo.graphqldemo.resolver.QueryResolver;
import com.graphql.demo.graphqldemo.resolver.SubscriptionResolver;
import com.graphql.demo.graphqldemo.resolver.TradeDtlsResolver;
import com.graphql.demo.graphqldemo.resolver.TradeResolver;

import graphql.GraphQL;
import graphql.execution.AsyncExecutionStrategy;
import graphql.execution.ExecutionStrategy;
import graphql.execution.instrumentation.dataloader.DataLoaderDispatcherInstrumentation;
import graphql.execution.instrumentation.dataloader.DataLoaderDispatcherInstrumentationOptions;
import graphql.schema.GraphQLSchema;

@Component
public class GraphQLProvider {

	private GraphQL graphQL;

	@Autowired
	private AuthorResolver authorResolver;

	@Autowired
	private QueryResolver queryResolver;

	@Autowired
	private BookResolver bookResolver;

	@Autowired
	private MutationResolver mutationResolver;

	@Autowired
	private SubscriptionResolver subscriptionResolver;

	@Autowired
	private MyCustomExceptionHandler myCustomExceptionHandler;

	@Autowired
	private TradeResolver tradeResolver;

	@Autowired
	private TradeDtlsResolver tradeDtlsResolver;

	@Bean
	public GraphQL graphQL() {
		return graphQL;
	}

	@PostConstruct
	public void init() throws IOException {

		GraphQLSchema schema = SchemaParser.newParser()
				.files("schema/schema.graphqls", "schema/schema1.graphqls", "schema/wowma.graphqls")
				.resolvers(queryResolver, bookResolver, authorResolver, mutationResolver, subscriptionResolver,
						tradeResolver, tradeDtlsResolver)
				.build().makeExecutableSchema();

		DataLoaderDispatcherInstrumentationOptions options = DataLoaderDispatcherInstrumentationOptions.newOptions()
				.includeStatistics(true);

		DataLoaderDispatcherInstrumentation dispatcherInstrumentation = new DataLoaderDispatcherInstrumentation(
				options);

		ExecutionStrategy executionStrategy = new AsyncExecutionStrategy(myCustomExceptionHandler);

		this.graphQL = GraphQL.newGraphQL(schema).instrumentation(dispatcherInstrumentation)
				.queryExecutionStrategy(executionStrategy).mutationExecutionStrategy(executionStrategy).build();

//		this.graphQL = GraphQL.newGraphQL(schema).instrumentation(dispatcherInstrumentation)
//				.subscriptionExecutionStrategy(new SubscriptionExecutionStrategy()).build();

	}

}