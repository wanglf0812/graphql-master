package com.graphql.demo.graphqldemo.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import grpc.type.proto.ReplyType;
import grpc.type.proto.ReplyTypeWrapper;
import grpc.type.proto.RequestId;
import grpc.type.proto.TypeGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class TypeClient {
	private static final Logger logger = Logger.getLogger(TypeClient.class.getName());

	@GrpcClient("graphql-type-server") // spring.application.name=graphql-server
	private TypeGrpc.TypeBlockingStub typeBlockingStub;

	public ReplyType getTypeById(Long id) {
		logger.info("Will try to getTypeById " + id + " ...");
		RequestId requestId = RequestId.newBuilder().setId(id).build();
		ReplyType replyType = null;
		try {
			replyType = typeBlockingStub.getTypeById(requestId);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		return replyType;
	}

	public ReplyTypeWrapper getTypeWrapperById(Long id) {
		logger.info("Will try to getTypeWrapperById " + id + " ...");
		RequestId requestId = RequestId.newBuilder().setId(id).build();
		ReplyTypeWrapper replyTypeWrapper = null;
		try {
			replyTypeWrapper = typeBlockingStub.getTypeWrapperById(requestId);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		return replyTypeWrapper;
	}
}
