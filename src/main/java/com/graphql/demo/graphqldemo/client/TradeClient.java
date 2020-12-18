package com.graphql.demo.graphqldemo.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import grpc.trade.proto.ReplyTrade;
import grpc.trade.proto.RequestId;
import grpc.trade.proto.TradeGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class TradeClient {
	private static final Logger logger = Logger.getLogger(TradeClient.class.getName());

	@GrpcClient("graphql-trade-server") // spring.application.name=graphql-server
	private TradeGrpc.TradeBlockingStub tradeBlockingStub;

	public ReplyTrade getTrade(Long id) {
		logger.info("Will try to getTrade " + id + " ...");
		RequestId requestId = RequestId.newBuilder().setId(id).build();
		ReplyTrade replyTrade = null;
		try {
			replyTrade = tradeBlockingStub.getTrade(requestId);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		return replyTrade;
	}
}
