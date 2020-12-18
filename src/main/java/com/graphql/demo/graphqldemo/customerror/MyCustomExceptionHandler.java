package com.graphql.demo.graphqldemo.customerror;

import org.springframework.stereotype.Component;

import graphql.execution.DataFetcherExceptionHandler;
import graphql.execution.DataFetcherExceptionHandlerParameters;
import graphql.execution.DataFetcherExceptionHandlerResult;
import graphql.execution.DataFetcherExceptionHandlerResult.Builder;
import graphql.execution.ExecutionPath;
import graphql.language.SourceLocation;

@Component
public class MyCustomExceptionHandler implements DataFetcherExceptionHandler{
	   
    
			@Override
			public DataFetcherExceptionHandlerResult onException(DataFetcherExceptionHandlerParameters handlerParameters) {
				Throwable exception = handlerParameters.getException();
	            CustomExceptionWhileDataFetching error = new CustomExceptionWhileDataFetching(exception);
	            Builder builder = new Builder().error(error);
	            DataFetcherExceptionHandlerResult result = builder.build();
	            return result;
			}
	    
	   
	}
