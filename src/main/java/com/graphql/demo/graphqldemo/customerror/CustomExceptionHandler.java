package com.graphql.demo.graphqldemo.customerror;

import org.springframework.stereotype.Component;

import graphql.ExceptionWhileDataFetching;
import graphql.execution.DataFetcherExceptionHandler;
import graphql.execution.DataFetcherExceptionHandlerParameters;
import graphql.execution.DataFetcherExceptionHandlerResult;
import graphql.execution.DataFetcherExceptionHandlerResult.Builder;
import graphql.execution.ExecutionPath;
import graphql.language.SourceLocation;

@Component
public class CustomExceptionHandler implements DataFetcherExceptionHandler{
   
      
		@Override
		public DataFetcherExceptionHandlerResult onException(DataFetcherExceptionHandlerParameters handlerParameters) {
			Throwable exception = handlerParameters.getException();
            SourceLocation sourceLocation = handlerParameters.getSourceLocation();
            ExecutionPath path = handlerParameters.getPath();

            ExceptionWhileDataFetching error = new ExceptionWhileDataFetching(path, exception, sourceLocation);
            
            Builder builder = new Builder().error(error);
            DataFetcherExceptionHandlerResult result = builder.build();
            return result;
		}
    
   
}
