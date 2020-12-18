package com.graphql.demo.graphqldemo.customerror;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class CustomRuntimeException extends RuntimeException implements GraphQLError {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String message;


	@Override
    public Map<String, Object> getExtensions() {
        return null;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    public CustomRuntimeException() {
    	this.message = "";
    }

    public CustomRuntimeException(String message) {
        this.message = message;
    }

    public CustomRuntimeException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public CustomRuntimeException(Throwable cause) {
        super(cause);
        this.message = cause.getMessage();
    }
}
