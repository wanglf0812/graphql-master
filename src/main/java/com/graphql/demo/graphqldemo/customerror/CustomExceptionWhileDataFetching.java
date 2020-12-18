package com.graphql.demo.graphqldemo.customerror;

import static graphql.Assert.assertNotNull;
import static java.lang.String.format;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.GraphqlErrorHelper;
import graphql.PublicApi;
import graphql.execution.ExecutionPath;
import graphql.language.SourceLocation;
@PublicApi
public class CustomExceptionWhileDataFetching implements GraphQLError {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;
    private final Throwable exception;

    public CustomExceptionWhileDataFetching(Throwable exception) {
        this.exception = assertNotNull(exception);
        this.message = exception.getMessage();
    }

 



    public Throwable getException() {
        return exception;
    }


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public List<Object> getPath() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return null;
    }

    @Override
    public String toString() {
        return "ExceptionWhileDataFetching{" +
                ", exception=" + exception +
                '}';
    }

    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    @Override
    public boolean equals(Object o) {
        return GraphqlErrorHelper.equals(this, o);
    }

    @Override
    public int hashCode() {
        return GraphqlErrorHelper.hashCode(this);
    }
}

