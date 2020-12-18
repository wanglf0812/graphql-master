package com.graphql.demo.graphqldemo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.graphql.demo.graphqldemo.dto.ProductDto;
import com.graphql.demo.graphqldemo.model.ProductInput;
import com.graphql.demo.graphqldemo.utils.CopyPropertiesUtils;

import grpc.product.proto.ProductGrpc;
import grpc.product.proto.ReplyProduct;
import grpc.product.proto.ReplyProductList;
import grpc.product.proto.RequestLotNo;
import grpc.product.proto.RequestProduct;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;

@Component
public class ProductClient {
	private static final Logger logger = Logger.getLogger(ProductClient.class.getName());

	@GrpcClient("graphql-product-server") // spring.application.name=graphql-server
	private ProductGrpc.ProductBlockingStub productBlockingStub;

	public List<ProductDto> getProductByLotNo(List<Long> LotNoList) {
		logger.info("Will try to getProductByLotNo " + Arrays.toString(LotNoList.toArray()) + " ...");
		RequestLotNo requestLotNo = RequestLotNo.newBuilder().addAllLotNo(LotNoList).build();
		ReplyProductList replyProductList = null;
		try {
			replyProductList = productBlockingStub.getProductByLotNo(requestLotNo);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}

		List<ProductDto> productList = new ArrayList<ProductDto>();
		for (ReplyProduct replyProduct : replyProductList.getReplyProductListList()) {
			ProductDto productDto = new ProductDto();
			CopyPropertiesUtils.copyPropertiesIgnoreNull(replyProduct, productDto);
			productList.add(productDto);
		}

		return productList;
	}

	public ProductDto insertProcduct(ProductInput productInput) {
		logger.info("Will try to insertProcduct " + productInput.toString() + " ...");

		RequestProduct.Builder builder = RequestProduct.newBuilder();
		CopyPropertiesUtils.copyPropertiesIgnoreNull(productInput, builder);
		RequestProduct requestProduct = builder.build();
		ReplyProduct replyProduct = null;
		try {
			replyProduct = productBlockingStub.insertProduct(requestProduct);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		ProductDto productDto = new ProductDto();
		CopyPropertiesUtils.copyPropertiesIgnoreNull(replyProduct, productDto);
		return productDto;
	}

	public ProductDto updateProcduct(Long id,ProductInput productInput) {
		logger.info("Will try to updateProcduct " + String.valueOf(id) + " ...");

		RequestProduct.Builder builder = RequestProduct.newBuilder();
		CopyPropertiesUtils.copyPropertiesIgnoreNull(productInput, builder);
		// key column
		builder.setId(id);
		RequestProduct requestProduct = builder.build();
		ReplyProduct replyProduct = null;
		try {
			replyProduct = productBlockingStub.updateProduct(requestProduct);
		} catch (StatusRuntimeException e) {
			logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		}
		ProductDto productDto = new ProductDto();
		CopyPropertiesUtils.copyPropertiesIgnoreNull(replyProduct, productDto);
		return productDto;
	}
}
