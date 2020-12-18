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
    comments = "Source: tradedtls.proto")
public final class TradeDetailGrpc {

  private TradeDetailGrpc() {}

  public static final String SERVICE_NAME = "trade.TradeDetail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.trade.proto.RequestId,
      grpc.trade.proto.ReplyTradeDetail> getGetTradeDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTradeDetail",
      requestType = grpc.trade.proto.RequestId.class,
      responseType = grpc.trade.proto.ReplyTradeDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.trade.proto.RequestId,
      grpc.trade.proto.ReplyTradeDetail> getGetTradeDetailMethod() {
    io.grpc.MethodDescriptor<grpc.trade.proto.RequestId, grpc.trade.proto.ReplyTradeDetail> getGetTradeDetailMethod;
    if ((getGetTradeDetailMethod = TradeDetailGrpc.getGetTradeDetailMethod) == null) {
      synchronized (TradeDetailGrpc.class) {
        if ((getGetTradeDetailMethod = TradeDetailGrpc.getGetTradeDetailMethod) == null) {
          TradeDetailGrpc.getGetTradeDetailMethod = getGetTradeDetailMethod = 
              io.grpc.MethodDescriptor.<grpc.trade.proto.RequestId, grpc.trade.proto.ReplyTradeDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "trade.TradeDetail", "GetTradeDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.trade.proto.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.trade.proto.ReplyTradeDetail.getDefaultInstance()))
                  .setSchemaDescriptor(new TradeDetailMethodDescriptorSupplier("GetTradeDetail"))
                  .build();
          }
        }
     }
     return getGetTradeDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.trade.proto.RequestTradeId,
      grpc.trade.proto.ReplyTradeDetailList> getGetTradeDetailByTradeIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTradeDetailByTradeIds",
      requestType = grpc.trade.proto.RequestTradeId.class,
      responseType = grpc.trade.proto.ReplyTradeDetailList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.trade.proto.RequestTradeId,
      grpc.trade.proto.ReplyTradeDetailList> getGetTradeDetailByTradeIdsMethod() {
    io.grpc.MethodDescriptor<grpc.trade.proto.RequestTradeId, grpc.trade.proto.ReplyTradeDetailList> getGetTradeDetailByTradeIdsMethod;
    if ((getGetTradeDetailByTradeIdsMethod = TradeDetailGrpc.getGetTradeDetailByTradeIdsMethod) == null) {
      synchronized (TradeDetailGrpc.class) {
        if ((getGetTradeDetailByTradeIdsMethod = TradeDetailGrpc.getGetTradeDetailByTradeIdsMethod) == null) {
          TradeDetailGrpc.getGetTradeDetailByTradeIdsMethod = getGetTradeDetailByTradeIdsMethod = 
              io.grpc.MethodDescriptor.<grpc.trade.proto.RequestTradeId, grpc.trade.proto.ReplyTradeDetailList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "trade.TradeDetail", "GetTradeDetailByTradeIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.trade.proto.RequestTradeId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.trade.proto.ReplyTradeDetailList.getDefaultInstance()))
                  .setSchemaDescriptor(new TradeDetailMethodDescriptorSupplier("GetTradeDetailByTradeIds"))
                  .build();
          }
        }
     }
     return getGetTradeDetailByTradeIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TradeDetailStub newStub(io.grpc.Channel channel) {
    return new TradeDetailStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TradeDetailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TradeDetailBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TradeDetailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TradeDetailFutureStub(channel);
  }

  /**
   */
  public static abstract class TradeDetailImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTradeDetail(grpc.trade.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTradeDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTradeDetailMethod(), responseObserver);
    }

    /**
     */
    public void getTradeDetailByTradeIds(grpc.trade.proto.RequestTradeId request,
        io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTradeDetailList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTradeDetailByTradeIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTradeDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.trade.proto.RequestId,
                grpc.trade.proto.ReplyTradeDetail>(
                  this, METHODID_GET_TRADE_DETAIL)))
          .addMethod(
            getGetTradeDetailByTradeIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.trade.proto.RequestTradeId,
                grpc.trade.proto.ReplyTradeDetailList>(
                  this, METHODID_GET_TRADE_DETAIL_BY_TRADE_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class TradeDetailStub extends io.grpc.stub.AbstractStub<TradeDetailStub> {
    private TradeDetailStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeDetailStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeDetailStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeDetailStub(channel, callOptions);
    }

    /**
     */
    public void getTradeDetail(grpc.trade.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTradeDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTradeDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTradeDetailByTradeIds(grpc.trade.proto.RequestTradeId request,
        io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTradeDetailList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTradeDetailByTradeIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TradeDetailBlockingStub extends io.grpc.stub.AbstractStub<TradeDetailBlockingStub> {
    private TradeDetailBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeDetailBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeDetailBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeDetailBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.trade.proto.ReplyTradeDetail getTradeDetail(grpc.trade.proto.RequestId request) {
      return blockingUnaryCall(
          getChannel(), getGetTradeDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.trade.proto.ReplyTradeDetailList getTradeDetailByTradeIds(grpc.trade.proto.RequestTradeId request) {
      return blockingUnaryCall(
          getChannel(), getGetTradeDetailByTradeIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TradeDetailFutureStub extends io.grpc.stub.AbstractStub<TradeDetailFutureStub> {
    private TradeDetailFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeDetailFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeDetailFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeDetailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.trade.proto.ReplyTradeDetail> getTradeDetail(
        grpc.trade.proto.RequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTradeDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.trade.proto.ReplyTradeDetailList> getTradeDetailByTradeIds(
        grpc.trade.proto.RequestTradeId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTradeDetailByTradeIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRADE_DETAIL = 0;
  private static final int METHODID_GET_TRADE_DETAIL_BY_TRADE_IDS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TradeDetailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TradeDetailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TRADE_DETAIL:
          serviceImpl.getTradeDetail((grpc.trade.proto.RequestId) request,
              (io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTradeDetail>) responseObserver);
          break;
        case METHODID_GET_TRADE_DETAIL_BY_TRADE_IDS:
          serviceImpl.getTradeDetailByTradeIds((grpc.trade.proto.RequestTradeId) request,
              (io.grpc.stub.StreamObserver<grpc.trade.proto.ReplyTradeDetailList>) responseObserver);
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

  private static abstract class TradeDetailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TradeDetailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.trade.proto.TradeDetailProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TradeDetail");
    }
  }

  private static final class TradeDetailFileDescriptorSupplier
      extends TradeDetailBaseDescriptorSupplier {
    TradeDetailFileDescriptorSupplier() {}
  }

  private static final class TradeDetailMethodDescriptorSupplier
      extends TradeDetailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TradeDetailMethodDescriptorSupplier(String methodName) {
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
      synchronized (TradeDetailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TradeDetailFileDescriptorSupplier())
              .addMethod(getGetTradeDetailMethod())
              .addMethod(getGetTradeDetailByTradeIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
