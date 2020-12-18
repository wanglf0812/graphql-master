package com.graphql.demo.graphqldemo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.graphql.demo.graphqldemo.dto.ShopDto;
import com.graphql.demo.graphqldemo.utils.CopyPropertiesUtils;

import grpc.shop.proto.ReplyShop;
import grpc.shop.proto.ReplyShopList;
import grpc.shop.proto.RequestId;
import grpc.shop.proto.ShopGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class ShopClient {
	private static final Logger logger = Logger.getLogger(ShopClient.class.getName());

	@GrpcClient("graphql-shop-server") // spring.application.name=graphql-server
	private ShopGrpc.ShopBlockingStub shopBlockingStub;

	public List<ShopDto> getShopById(List<Long> idList) {
		logger.info("Will try to getShopById " + Arrays.toString(idList.toArray()) + " ...");
		RequestId requestId = RequestId.newBuilder().addAllId(idList).build();
		ReplyShopList replyShopList = null;
		try {
			replyShopList = shopBlockingStub.getShopById(requestId);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		
		List<ShopDto> shopList = new ArrayList<ShopDto>();
		for (ReplyShop replyShop : replyShopList.getReplyShopListList()) {
			ShopDto shopDto = new ShopDto();
			CopyPropertiesUtils.copyPropertiesIgnoreNull(replyShop, shopDto);
			shopList.add(shopDto);
		}

		return shopList;
	}
}
