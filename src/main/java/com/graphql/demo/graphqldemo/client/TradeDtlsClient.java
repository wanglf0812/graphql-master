package com.graphql.demo.graphqldemo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.graphql.demo.graphqldemo.dto.TradeDtls;
import com.graphql.demo.graphqldemo.utils.CopyPropertiesUtils;

import grpc.trade.proto.ReplyTradeDetail;
import grpc.trade.proto.ReplyTradeDetailList;
import grpc.trade.proto.RequestId;
import grpc.trade.proto.RequestTradeId;
import grpc.trade.proto.TradeDetailGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class TradeDtlsClient {
	private static final Logger logger = Logger.getLogger(TradeDtlsClient.class.getName());

	@GrpcClient("graphql-trade-server") // spring.application.name=graphql-server
	private TradeDetailGrpc.TradeDetailBlockingStub tradeDetailBlockingStub;

	public ReplyTradeDetail getTradeDetail(Long id) {
		logger.info("Will try to getTradeDetail " + id + " ...");
		RequestId requestId = RequestId.newBuilder().setId(id).build();
		ReplyTradeDetail replyTradeDetail = null;
		try {
			replyTradeDetail = tradeDetailBlockingStub.getTradeDetail(requestId);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		return replyTradeDetail;
	}

	public List<TradeDtls> getTradeDetailList(List<Long> tradeIdList) {
		logger.info("Will try to getTradeDetailList " + Arrays.toString(tradeIdList.toArray()) + " ...");
		RequestTradeId requestTradeId = RequestTradeId.newBuilder().addAllTradeId(tradeIdList).build();
		ReplyTradeDetailList replyTradeDetailList = null;
		try {
			replyTradeDetailList = tradeDetailBlockingStub.getTradeDetailByTradeIds(requestTradeId);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		
		List<TradeDtls> tradeDetailList = new ArrayList<TradeDtls>();
		for (ReplyTradeDetail replyTradeDetail : replyTradeDetailList.getTradeDetailListList()) {
			TradeDtls tradeDtls = new TradeDtls();
			CopyPropertiesUtils.copyPropertiesIgnoreNull(replyTradeDetail, tradeDtls);
			tradeDetailList.add(tradeDtls);
		}

		return tradeDetailList;
	}
}
