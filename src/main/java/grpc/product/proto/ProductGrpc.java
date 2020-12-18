package grpc.product.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: product.proto")
public final class ProductGrpc {

  private ProductGrpc() {}

  public static final String SERVICE_NAME = "product.Product";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.product.proto.RequestLotNo,
      grpc.product.proto.ReplyProductList> getGetProductByLotNoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductByLotNo",
      requestType = grpc.product.proto.RequestLotNo.class,
      responseType = grpc.product.proto.ReplyProductList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.product.proto.RequestLotNo,
      grpc.product.proto.ReplyProductList> getGetProductByLotNoMethod() {
    io.grpc.MethodDescriptor<grpc.product.proto.RequestLotNo, grpc.product.proto.ReplyProductList> getGetProductByLotNoMethod;
    if ((getGetProductByLotNoMethod = ProductGrpc.getGetProductByLotNoMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getGetProductByLotNoMethod = ProductGrpc.getGetProductByLotNoMethod) == null) {
          ProductGrpc.getGetProductByLotNoMethod = getGetProductByLotNoMethod = 
              io.grpc.MethodDescriptor.<grpc.product.proto.RequestLotNo, grpc.product.proto.ReplyProductList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "product.Product", "GetProductByLotNo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.product.proto.RequestLotNo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.product.proto.ReplyProductList.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductMethodDescriptorSupplier("GetProductByLotNo"))
                  .build();
          }
        }
     }
     return getGetProductByLotNoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.product.proto.RequestProduct,
      grpc.product.proto.ReplyProduct> getInsertProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertProduct",
      requestType = grpc.product.proto.RequestProduct.class,
      responseType = grpc.product.proto.ReplyProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.product.proto.RequestProduct,
      grpc.product.proto.ReplyProduct> getInsertProductMethod() {
    io.grpc.MethodDescriptor<grpc.product.proto.RequestProduct, grpc.product.proto.ReplyProduct> getInsertProductMethod;
    if ((getInsertProductMethod = ProductGrpc.getInsertProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getInsertProductMethod = ProductGrpc.getInsertProductMethod) == null) {
          ProductGrpc.getInsertProductMethod = getInsertProductMethod = 
              io.grpc.MethodDescriptor.<grpc.product.proto.RequestProduct, grpc.product.proto.ReplyProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "product.Product", "InsertProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.product.proto.RequestProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.product.proto.ReplyProduct.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductMethodDescriptorSupplier("InsertProduct"))
                  .build();
          }
        }
     }
     return getInsertProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.product.proto.RequestProduct,
      grpc.product.proto.ReplyProduct> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = grpc.product.proto.RequestProduct.class,
      responseType = grpc.product.proto.ReplyProduct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.product.proto.RequestProduct,
      grpc.product.proto.ReplyProduct> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<grpc.product.proto.RequestProduct, grpc.product.proto.ReplyProduct> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getUpdateProductMethod = ProductGrpc.getUpdateProductMethod) == null) {
          ProductGrpc.getUpdateProductMethod = getUpdateProductMethod = 
              io.grpc.MethodDescriptor.<grpc.product.proto.RequestProduct, grpc.product.proto.ReplyProduct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "product.Product", "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.product.proto.RequestProduct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.product.proto.ReplyProduct.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductMethodDescriptorSupplier("UpdateProduct"))
                  .build();
          }
        }
     }
     return getUpdateProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductStub newStub(io.grpc.Channel channel) {
    return new ProductStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProductByLotNo(grpc.product.proto.RequestLotNo request,
        io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProductList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductByLotNoMethod(), responseObserver);
    }

    /**
     */
    public void insertProduct(grpc.product.proto.RequestProduct request,
        io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProduct> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(grpc.product.proto.RequestProduct request,
        io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProduct> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductByLotNoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.product.proto.RequestLotNo,
                grpc.product.proto.ReplyProductList>(
                  this, METHODID_GET_PRODUCT_BY_LOT_NO)))
          .addMethod(
            getInsertProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.product.proto.RequestProduct,
                grpc.product.proto.ReplyProduct>(
                  this, METHODID_INSERT_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.product.proto.RequestProduct,
                grpc.product.proto.ReplyProduct>(
                  this, METHODID_UPDATE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductStub extends io.grpc.stub.AbstractStub<ProductStub> {
    private ProductStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductStub(channel, callOptions);
    }

    /**
     */
    public void getProductByLotNo(grpc.product.proto.RequestLotNo request,
        io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProductList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductByLotNoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertProduct(grpc.product.proto.RequestProduct request,
        io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProduct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(grpc.product.proto.RequestProduct request,
        io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProduct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductBlockingStub extends io.grpc.stub.AbstractStub<ProductBlockingStub> {
    private ProductBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.product.proto.ReplyProductList getProductByLotNo(grpc.product.proto.RequestLotNo request) {
      return blockingUnaryCall(
          getChannel(), getGetProductByLotNoMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.product.proto.ReplyProduct insertProduct(grpc.product.proto.RequestProduct request) {
      return blockingUnaryCall(
          getChannel(), getInsertProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.product.proto.ReplyProduct updateProduct(grpc.product.proto.RequestProduct request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductFutureStub extends io.grpc.stub.AbstractStub<ProductFutureStub> {
    private ProductFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.product.proto.ReplyProductList> getProductByLotNo(
        grpc.product.proto.RequestLotNo request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductByLotNoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.product.proto.ReplyProduct> insertProduct(
        grpc.product.proto.RequestProduct request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.product.proto.ReplyProduct> updateProduct(
        grpc.product.proto.RequestProduct request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCT_BY_LOT_NO = 0;
  private static final int METHODID_INSERT_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCT_BY_LOT_NO:
          serviceImpl.getProductByLotNo((grpc.product.proto.RequestLotNo) request,
              (io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProductList>) responseObserver);
          break;
        case METHODID_INSERT_PRODUCT:
          serviceImpl.insertProduct((grpc.product.proto.RequestProduct) request,
              (io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProduct>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((grpc.product.proto.RequestProduct) request,
              (io.grpc.stub.StreamObserver<grpc.product.proto.ReplyProduct>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.product.proto.ProductProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Product");
    }
  }

  private static final class ProductFileDescriptorSupplier
      extends ProductBaseDescriptorSupplier {
    ProductFileDescriptorSupplier() {}
  }

  private static final class ProductMethodDescriptorSupplier
      extends ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductFileDescriptorSupplier())
              .addMethod(getGetProductByLotNoMethod())
              .addMethod(getInsertProductMethod())
              .addMethod(getUpdateProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
