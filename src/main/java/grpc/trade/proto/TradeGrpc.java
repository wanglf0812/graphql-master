package grpc.trade.proto;

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
    comments = "Source: trade.proto")
public final class TradeGrpc {

  private TradeGrpc() {}

  public static final String SERVICE_NAME = "trade.Trade";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.trade.proto.RequestId,
      grpc.trade.proto.ReplyTrade> getGetTradeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrade",
      requestType = grpc.trade.proto.RequestId.class,
      responseType = grpc.trade.proto.ReplyTrade.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.trade.proto.RequestId,
      grpc.trade.proto.ReplyTrade> getGetTradeMethod() {
    io.grpc.MethodDescriptor<grpc.trade.proto.RequestId, grpc.trade.proto.ReplyTrade> getGetTradeMethod;
    if ((getGetTradeMethod = TradeGrpc.getGetTradeMethod) == null) {
      synchronized (TradeGrpc.class) {
        if ((getGetTradeMethod = TradeGrpc.getGetTradeMethod) == null) {
          TradeGrpc.getGetTradeMethod = getGetTradeMethod = 
              io.grpc.MethodDescriptor.<grpc.trade.proto.RequestId, grpc.trade.proto.ReplyTrade>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "trade.Trade", "GetTrade"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.trade.proto.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.trade.proto.ReplyTrade.getDefaultInstance()))
                  .setSchemaDescriptor(new TradeMethodDescriptorSupplier("GetTrade"))
                  .build();
          }
        }
     }
     return getGetTradeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TradeStub newStub(io.grpc.Channel channel) {
    return new TradeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TradeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TradeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TradeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TradeFutureStub(channel);
  }

  /**
   */
  public static abstract class TradeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTrade(grpc.trade.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTrade> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTradeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTradeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.trade.proto.RequestId,
                grpc.trade.proto.ReplyTrade>(
                  this, METHODID_GET_TRADE)))
          .build();
    }
  }

  /**
   */
  public static final class TradeStub extends io.grpc.stub.AbstractStub<TradeStub> {
    private TradeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeStub(channel, callOptions);
    }

    /**
     */
    public void getTrade(grpc.trade.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTrade> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTradeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TradeBlockingStub extends io.grpc.stub.AbstractStub<TradeBlockingStub> {
    private TradeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.trade.proto.ReplyTrade getTrade(grpc.trade.proto.RequestId request) {
      return blockingUnaryCall(
          getChannel(), getGetTradeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TradeFutureStub extends io.grpc.stub.AbstractStub<TradeFutureStub> {
    private TradeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.trade.proto.ReplyTrade> getTrade(
        grpc.trade.proto.RequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTradeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRADE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TradeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TradeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRADE:
          serviceImpl.getTrade((grpc.trade.proto.RequestId) request,
              (io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTrade>) responseObserver);
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

  private static abstract class TradeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TradeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.trade.proto.TradeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Trade");
    }
  }

  private static final class TradeFileDescriptorSupplier
      extends TradeBaseDescriptorSupplier {
    TradeFileDescriptorSupplier() {}
  }

  private static final class TradeMethodDescriptorSupplier
      extends TradeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TradeMethodDescriptorSupplier(String methodName) {
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
      synchronized (TradeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TradeFileDescriptorSupplier())
              .addMethod(getGetTradeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
