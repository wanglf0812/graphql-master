// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tradedtls.proto

package grpc.trade.proto;

public final class TradeDetailProto {
  private TradeDetailProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_RequestTradeId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_RequestTradeId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_ReplyTradeDetailList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_ReplyTradeDetailList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_trade_ReplyTradeDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_trade_ReplyTradeDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017tradedtls.proto\022\005trade\032\013trade.proto\"!\n" +
      "\016RequestTradeId\022\017\n\007tradeId\030\001 \003(\003\"H\n\024Repl" +
      "yTradeDetailList\0220\n\017tradeDetailList\030\001 \003(" +
      "\0132\027.trade.ReplyTradeDetail\"\214\014\n\020ReplyTrad" +
      "eDetail\022\n\n\002id\030\001 \001(\003\022\025\n\rtrade_dtls_no\030\002 \001" +
      "(\003\022\020\n\010trade_id\030\003 \001(\003\022\022\n\nproduct_id\030\004 \001(\003" +
      "\022\016\n\006lot_no\030\005 \001(\003\022\022\n\nproduct_cd\030\006 \001(\t\022\024\n\014" +
      "product_name\030\007 \001(\t\022\030\n\020mgt_product_name\030\010" +
      " \001(\t\022\017\n\007tax_kbn\030\t \001(\t\022%\n\035choices_alt_sto" +
      "ck_item_row_cd\030\n \001(\t\022%\n\035choices_alt_stoc" +
      "k_item_col_cd\030\013 \001(\t\022\034\n\024trade_product_mgt" +
      "_id\030\014 \001(\t\022\026\n\016trade_dtls_opt\030\r \001(\t\022\036\n\026buy" +
      "_opt_commission_txt\030\016 \001(\t\022#\n\033buy_opt_com" +
      "mission_txt_hist\030\017 \001(\t\022\032\n\022buy_opt_commis" +
      "sion\030\020 \001(\003\022\037\n\027buy_opt_commission_edit\030\021 " +
      "\001(\003\022\031\n\021gift_packing_type\030\022 \001(\t\022\036\n\026gift_p" +
      "acking_type_edit\030\023 \001(\t\022\027\n\017gift_commissio" +
      "n\030\024 \001(\003\022\034\n\024gift_commission_edit\030\025 \001(\003\022\020\n" +
      "\010gift_msg\030\026 \001(\t\022\025\n\rgift_msg_edit\030\027 \001(\t\022\022" +
      "\n\nnoshi_type\030\030 \001(\t\022\027\n\017noshi_type_edit\030\031 " +
      "\001(\t\022\035\n\025noshi_presenter_name1\030\032 \001(\t\022\"\n\032no" +
      "shi_presenter_name1_edit\030\033 \001(\t\022\035\n\025noshi_" +
      "presenter_name2\030\034 \001(\t\022\"\n\032noshi_presenter" +
      "_name2_edit\030\035 \001(\t\022\035\n\025noshi_presenter_nam" +
      "e3\030\036 \001(\t\022\"\n\032noshi_presenter_name3_edit\030\037" +
      " \001(\t\022\034\n\024tarde_dtls_dscnt_bfr\030  \001(\003\022\034\n\024ta" +
      "rde_dtls_dscnt_amt\030! \001(\003\022\031\n\021tarde_dtls_u" +
      "ntprc\030\" \001(\003\022\036\n\026tarde_dtls_untprc_edit\030# " +
      "\001(\003\022\033\n\023tarde_dtls_quantity\030$ \001(\003\022 \n\030tard" +
      "e_dtls_quantity_edit\030% \001(\003\022\032\n\022tarde_dtls" +
      "_pt_rate\030& \001(\003\022\025\n\rtarde_dtls_pt\030\' \001(\003\022\037\n" +
      "\027tarde_dtls_amt_subtotal\030( \001(\003\022\033\n\023commis" +
      "sion_subtotal\030) \001(\003\022\032\n\022tmsale_product_fl" +
      "g\030* \001(\005\022!\n\031trade_dtls_cancle_fin_flg\030+ \001" +
      "(\005\022\036\n\026trade_dtls_cancle_date\030, \001(\t\022\035\n\025sh" +
      "opping_day_disp_txt\030- \001(\t\022\033\n\023shopping_ti" +
      "mlmt_day\030. \001(\t\022\026\n\016div_timlmt_day\030/ \001(\t\022\023" +
      "\n\013digicon_ktn\0300 \001(\t\022\021\n\tadult_flg\0301 \001(\005\022\021" +
      "\n\tage_limit\0302 \001(\005\022\017\n\007del_flg\0303 \001(\005\022\023\n\013cr" +
      "eate_date\0304 \001(\t\022\023\n\013update_date\0305 \001(\t\022\021\n\t" +
      "create_id\0306 \001(\003\022\021\n\tupdate_id\0307 \001(\003\022\025\n\rcr" +
      "eate_pgm_id\0308 \001(\t\022\025\n\rupdate_pgm_id\0309 \001(\t" +
      "\022\017\n\007version\030: \001(\0032\236\001\n\013TradeDetail\022=\n\016Get" +
      "TradeDetail\022\020.trade.RequestId\032\027.trade.Re" +
      "plyTradeDetail\"\000\022P\n\030GetTradeDetailByTrad" +
      "eIds\022\025.trade.RequestTradeId\032\033.trade.Repl" +
      "yTradeDetailList\"\000B&\n\020grpc.trade.protoB\020" +
      "TradeDetailProtoP\001b\006proto3"
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
          grpc.trade.proto.TradeProto.getDescriptor(),
        }, assigner);
    internal_static_trade_RequestTradeId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_trade_RequestTradeId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_RequestTradeId_descriptor,
        new java.lang.String[] { "TradeId", });
    internal_static_trade_ReplyTradeDetailList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_trade_ReplyTradeDetailList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_ReplyTradeDetailList_descriptor,
        new java.lang.String[] { "TradeDetailList", });
    internal_static_trade_ReplyTradeDetail_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_trade_ReplyTradeDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_trade_ReplyTradeDetail_descriptor,
        new java.lang.String[] { "Id", "TradeDtlsNo", "TradeId", "ProductId", "LotNo", "ProductCd", "ProductName", "MgtProductName", "TaxKbn", "ChoicesAltStockItemRowCd", "ChoicesAltStockItemColCd", "TradeProductMgtId", "TradeDtlsOpt", "BuyOptCommissionTxt", "BuyOptCommissionTxtHist", "BuyOptCommission", "BuyOptCommissionEdit", "GiftPackingType", "GiftPackingTypeEdit", "GiftCommission", "GiftCommissionEdit", "GiftMsg", "GiftMsgEdit", "NoshiType", "NoshiTypeEdit", "NoshiPresenterName1", "NoshiPresenterName1Edit", "NoshiPresenterName2", "NoshiPresenterName2Edit", "NoshiPresenterName3", "NoshiPresenterName3Edit", "TardeDtlsDscntBfr", "TardeDtlsDscntAmt", "TardeDtlsUntprc", "TardeDtlsUntprcEdit", "TardeDtlsQuantity", "TardeDtlsQuantityEdit", "TardeDtlsPtRate", "TardeDtlsPt", "TardeDtlsAmtSubtotal", "CommissionSubtotal", "TmsaleProductFlg", "TradeDtlsCancleFinFlg", "TradeDtlsCancleDate", "ShoppingDayDispTxt", "ShoppingTimlmtDay", "DivTimlmtDay", "DigiconKtn", "AdultFlg", "AgeLimit", "DelFlg", "CreateDate", "UpdateDate", "CreateId", "UpdateId", "CreatePgmId", "UpdatePgmId", "Version", });
    grpc.trade.proto.TradeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
