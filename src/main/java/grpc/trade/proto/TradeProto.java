// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trade.proto

package grpc.trade.proto;

public final class TradeProto {
  private TradeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_RequestId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_RequestId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_ReplyTrade_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_ReplyTrade_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013trade.proto\022\005trade\"\027\n\tRequestId\022\n\n\002id\030" +
      "\001 \001(\003\"\263\005\n\nReplyTrade\022\n\n\002id\030\001 \001(\003\022\014\n\004clid" +
      "\030\002 \001(\003\022\020\n\010trade_no\030\003 \001(\003\022\030\n\020destination_" +
      "name\030\004 \001(\t\022\035\n\025destination_name_kana\030\005 \001(" +
      "\t\022\027\n\017destination_zip\030\006 \001(\t\022\033\n\023destinatio" +
      "n_address\030\007 \001(\t\022\027\n\017destination_tel\030\010 \001(\t" +
      "\022\"\n\032destination_daytime_conadr\030\t \001(\t\022\034\n\024" +
      "destination_store_cd\030\n \001(\t\022\035\n\025destinatio" +
      "n_name_edit\030\013 \001(\t\022 \n\030destination_address" +
      "_edit\030\014 \001(\t\022\034\n\024destination_tel_edit\030\r \001(" +
      "\t\022\034\n\024destination_zip_edit\030\016 \001(\t\022\'\n\037desti" +
      "nation_daytime_conadr_edit\030\017 \001(\t\022\"\n\032dest" +
      "ination_name_kana_edit\030\020 \001(\t\022!\n\031destinat" +
      "ion_store_cd_edit\030\021 \001(\t\022\020\n\010user_cmt\030\022 \001(" +
      "\t\022\020\n\010buy_date\030\023 \001(\t\022\017\n\007del_flg\030\024 \001(\005\022\023\n\013" +
      "create_date\030\025 \001(\t\022\023\n\013update_date\030\026 \001(\t\022\021" +
      "\n\tcreate_id\030\027 \001(\005\022\021\n\tupdate_id\030\030 \001(\005\022\025\n\r" +
      "create_pgm_id\030\031 \001(\t\022\025\n\rupdate_pgm_id\030\032 \001" +
      "(\t\022\017\n\007version\030\033 \001(\0032:\n\005Trade\0221\n\010GetTrade" +
      "\022\020.trade.RequestId\032\021.trade.ReplyTrade\"\000B" +
      " \n\020grpc.trade.protoB\nTradeProtoP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_trade_RequestId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trade_RequestId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_RequestId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_trade_ReplyTrade_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_trade_ReplyTrade_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_ReplyTrade_descriptor,
        new java.lang.String[] { "Id", "Clid", "TradeNo", "DestinationName", "DestinationNameKana", "DestinationZip", "DestinationAddress", "DestinationTel", "DestinationDaytimeConadr", "DestinationStoreCd", "DestinationNameEdit", "DestinationAddressEdit", "DestinationTelEdit", "DestinationZipEdit", "DestinationDaytimeConadrEdit", "DestinationNameKanaEdit", "DestinationStoreCdEdit", "UserCmt", "BuyDate", "DelFlg", "CreateDate", "UpdateDate", "CreateId", "UpdateId", "CreatePgmId", "UpdatePgmId", "Version", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
