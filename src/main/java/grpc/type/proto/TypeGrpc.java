package grpc.type.proto;

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
    comments = "Source: type.proto")
public final class TypeGrpc {

  private TypeGrpc() {}

  public static final String SERVICE_NAME = "type.Type";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.type.proto.RequestId,
      grpc.type.proto.ReplyType> getGetTypeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTypeById",
      requestType = grpc.type.proto.RequestId.class,
      responseType = grpc.type.proto.ReplyType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.type.proto.RequestId,
      grpc.type.proto.ReplyType> getGetTypeByIdMethod() {
    io.grpc.MethodDescriptor<grpc.type.proto.RequestId, grpc.type.proto.ReplyType> getGetTypeByIdMethod;
    if ((getGetTypeByIdMethod = TypeGrpc.getGetTypeByIdMethod) == null) {
      synchronized (TypeGrpc.class) {
        if ((getGetTypeByIdMethod = TypeGrpc.getGetTypeByIdMethod) == null) {
          TypeGrpc.getGetTypeByIdMethod = getGetTypeByIdMethod = 
              io.grpc.MethodDescriptor.<grpc.type.proto.RequestId, grpc.type.proto.ReplyType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "type.Type", "GetTypeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.type.proto.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.type.proto.ReplyType.getDefaultInstance()))
                  .setSchemaDescriptor(new TypeMethodDescriptorSupplier("GetTypeById"))
                  .build();
          }
        }
     }
     return getGetTypeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.type.proto.RequestId,
      grpc.type.proto.ReplyTypeWrapper> getGetTypeWrapperByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTypeWrapperById",
      requestType = grpc.type.proto.RequestId.class,
      responseType = grpc.type.proto.ReplyTypeWrapper.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.type.proto.RequestId,
      grpc.type.proto.ReplyTypeWrapper> getGetTypeWrapperByIdMethod() {
    io.grpc.MethodDescriptor<grpc.type.proto.RequestId, grpc.type.proto.ReplyTypeWrapper> getGetTypeWrapperByIdMethod;
    if ((getGetTypeWrapperByIdMethod = TypeGrpc.getGetTypeWrapperByIdMethod) == null) {
      synchronized (TypeGrpc.class) {
        if ((getGetTypeWrapperByIdMethod = TypeGrpc.getGetTypeWrapperByIdMethod) == null) {
          TypeGrpc.getGetTypeWrapperByIdMethod = getGetTypeWrapperByIdMethod = 
              io.grpc.MethodDescriptor.<grpc.type.proto.RequestId, grpc.type.proto.ReplyTypeWrapper>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "type.Type", "GetTypeWrapperById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.type.proto.RequestId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.type.proto.ReplyTypeWrapper.getDefaultInstance()))
                  .setSchemaDescriptor(new TypeMethodDescriptorSupplier("GetTypeWrapperById"))
                  .build();
          }
        }
     }
     return getGetTypeWrapperByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TypeStub newStub(io.grpc.Channel channel) {
    return new TypeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TypeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TypeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TypeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TypeFutureStub(channel);
  }

  /**
   */
  public static abstract class TypeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTypeById(grpc.type.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.type.proto.ReplyType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTypeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTypeWrapperById(grpc.type.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.type.proto.ReplyTypeWrapper> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTypeWrapperByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTypeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.type.proto.RequestId,
                grpc.type.proto.ReplyType>(
                  this, METHODID_GET_TYPE_BY_ID)))
          .addMethod(
            getGetTypeWrapperByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.type.proto.RequestId,
                grpc.type.proto.ReplyTypeWrapper>(
                  this, METHODID_GET_TYPE_WRAPPER_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class TypeStub extends io.grpc.stub.AbstractStub<TypeStub> {
    private TypeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypeStub(channel, callOptions);
    }

    /**
     */
    public void getTypeById(grpc.type.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.type.proto.ReplyType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTypeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTypeWrapperById(grpc.type.proto.RequestId request,
        io.grpc.stub.StreamObserver<grpc.type.proto.ReplyTypeWrapper> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTypeWrapperByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TypeBlockingStub extends io.grpc.stub.AbstractStub<TypeBlockingStub> {
    private TypeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypeBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.type.proto.ReplyType getTypeById(grpc.type.proto.RequestId request) {
      return blockingUnaryCall(
          getChannel(), getGetTypeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.type.proto.ReplyTypeWrapper getTypeWrapperById(grpc.type.proto.RequestId request) {
      return blockingUnaryCall(
          getChannel(), getGetTypeWrapperByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TypeFutureStub extends io.grpc.stub.AbstractStub<TypeFutureStub> {
    private TypeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.type.proto.ReplyType> getTypeById(
        grpc.type.proto.RequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTypeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.type.proto.ReplyTypeWrapper> getTypeWrapperById(
        grpc.type.proto.RequestId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTypeWrapperByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TYPE_BY_ID = 0;
  private static final int METHODID_GET_TYPE_WRAPPER_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TypeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TypeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TYPE_BY_ID:
          serviceImpl.getTypeById((grpc.type.proto.RequestId) request,
              (io.grpc.stub.StreamObserver<grpc.type.proto.ReplyType>) responseObserver);
          break;
        case METHODID_GET_TYPE_WRAPPER_BY_ID:
          serviceImpl.getTypeWrapperById((grpc.type.proto.RequestId) request,
              (io.grpc.stub.StreamObserver<grpc.type.proto.ReplyTypeWrapper>) responseObserver);
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

  private static abstract class TypeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TypeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.type.proto.TypeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Type");
    }
  }

  private static final class TypeFileDescriptorSupplier
      extends TypeBaseDescriptorSupplier {
    TypeFileDescriptorSupplier() {}
  }

  private static final class TypeMethodDescriptorSupplier
      extends TypeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TypeMethodDescriptorSupplier(String methodName) {
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
      synchronized (TypeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TypeFileDescriptorSupplier())
              .addMethod(getGetTypeByIdMethod())
              .addMethod(getGetTypeWrapperByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
