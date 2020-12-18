package grpc.shop.proto;

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
    comments = "Source: shop.proto")
public final class ShopGrpc {

  private ShopGrpc() {}

  public static final String SERVICE_NAME = "shop.Shop";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.shop.proto.RequestId,
      grpc.shop.proto.ReplyShopList> getGetShopByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetShopById",
      requestType = grpc.shop.proto.RequestId.class,
      responseType = grpc.shop.proto.ReplyShopList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.shop.proto.RequestId,
      grpc.shop.proto.ReplyShopList> getGetShopByIdMethod() {
    io.grpc.MethodDescriptor<grpc.shop.proto.RequestId, grpc.shop.proto.ReplyShopList> getGetShopByIdMethod;
    if ((getGetShopByIdMethod = ShopGrpc.getGetShopByIdMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getGetShopByIdMethod = ShopGrpc.getGetShopByIdMethod) == null) {
          ShopGrpc.getGetShopByIdMethod = getGetShopByIdMethod = 
              io.grpc.MethodDescriptor.<grpc.shop.proto.RequestId, grpc.shop.proto.ReplyShopList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "shop.Shop", "GetShopById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.shop.proto.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.shop.proto.ReplyShopList.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("GetShopById"))
                  .build();
          }
        }
     }
     return getGetShopByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShopStub newStub(io.grpc.Channel channel) {
    return new ShopStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShopBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShopBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShopFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShopFutureStub(channel);
  }

  /**
   */
  public static abstract class ShopImplBase implements io.grpc.BindableService {

    /**
     */
    public void getShopById(grpc.shop.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.shop.proto.ReplyShopList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetShopByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetShopByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.shop.proto.RequestId,
                grpc.shop.proto.ReplyShopList>(
                  this, METHODID_GET_SHOP_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class ShopStub extends io.grpc.stub.AbstractStub<ShopStub> {
    private ShopStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopStub(channel, callOptions);
    }

    /**
     */
    public void getShopById(grpc.shop.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.shop.proto.ReplyShopList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetShopByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShopBlockingStub extends io.grpc.stub.AbstractStub<ShopBlockingStub> {
    private ShopBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.shop.proto.ReplyShopList getShopById(grpc.shop.proto.RequestId request) {
      return blockingUnaryCall(
          getChannel(), getGetShopByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShopFutureStub extends io.grpc.stub.AbstractStub<ShopFutureStub> {
    private ShopFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.shop.proto.ReplyShopList> getShopById(
        grpc.shop.proto.RequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetShopByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHOP_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShopImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShopImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHOP_BY_ID:
          serviceImpl.getShopById((grpc.shop.proto.RequestId) request,
              (io.grpc.stub.StreamObserver<grpc.shop.proto.ReplyShopList>) responseObserver);
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

  private static abstract class ShopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShopBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.shop.proto.ShopProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Shop");
    }
  }

  private static final class ShopFileDescriptorSupplier
      extends ShopBaseDescriptorSupplier {
    ShopFileDescriptorSupplier() {}
  }

  private static final class ShopMethodDescriptorSupplier
      extends ShopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShopMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShopGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShopFileDescriptorSupplier())
              .addMethod(getGetShopByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
