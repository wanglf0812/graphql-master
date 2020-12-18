package com.graphql.demo.graphqldemo.dto;

import java.util.List;

public class Trade {
	private Long id;
	private Long clid;
	private Long tradeNo;
	private String destinationName;
	private String destinationNameKana;
	private String destinationZip;
	private String destinationAddress;
	private String destinationTel;
	private String destinationDaytimeConadr;
	private String destinationStoreCd;
	private String destinationNameEdit;
	private String destinationAddressEdit;
	private String destinationTelEdit;
	private String destinationZipEdit;
	private String destinationDaytimeConadrEdit;
	private String destinationNameKanaEdit;
	private String destinationStoreCdEdit;
	private String userCmt;
	private String buyDate;
	private Integer delFlg;
	private String createDate;
	private String updateDate;
	private Long createId;
	private Long updateId;
	private String createPgmId;
	private String updatePgmId;
	private Long version;
	private ShopDto shopDto;
	private List<TradeDtls> tradeDtls;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getClid() {
		return clid;
	}
	public void setClid(Long clid) {
		this.clid = clid;
	}
	public Long getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(Long tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	public String getDestinationNameKana() {
		return destinationNameKana;
	}
	public void setDestinationNameKana(String destinationNameKana) {
		this.destinationNameKana = destinationNameKana;
	}
	public String getDestinationZip() {
		return destinationZip;
	}
	public void setDestinationZip(String destinationZip) {
		this.destinationZip = destinationZip;
	}
	public String getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
	public String getDestinationTel() {
		return destinationTel;
	}
	public void setDestinationTel(String destinationTel) {
		this.destinationTel = destinationTel;
	}
	public String getDestinationDaytimeConadr() {
		return destinationDaytimeConadr;
	}
	public void setDestinationDaytimeConadr(String destinationDaytimeConadr) {
		this.destinationDaytimeConadr = destinationDaytimeConadr;
	}
	public String getDestinationStoreCd() {
		return destinationStoreCd;
	}
	public void setDestinationStoreCd(String destinationStoreCd) {
		this.destinationStoreCd = destinationStoreCd;
	}
	public String getDestinationNameEdit() {
		return destinationNameEdit;
	}
	public void setDestinationNameEdit(String destinationNameEdit) {
		this.destinationNameEdit = destinationNameEdit;
	}
	public String getDestinationAddressEdit() {
		return destinationAddressEdit;
	}
	public void setDestinationAddressEdit(String destinationAddressEdit) {
		this.destinationAddressEdit = destinationAddressEdit;
	}
	public String getDestinationTelEdit() {
		return destinationTelEdit;
	}
	public void setDestinationTelEdit(String destinationTelEdit) {
		this.destinationTelEdit = destinationTelEdit;
	}
	public String getDestinationZipEdit() {
		return destinationZipEdit;
	}
	public void setDestinationZipEdit(String destinationZipEdit) {
		this.destinationZipEdit = destinationZipEdit;
	}
	public String getDestinationDaytimeConadrEdit() {
		return destinationDaytimeConadrEdit;
	}
	public void setDestinationDaytimeConadrEdit(String destinationDaytimeConadrEdit) {
		this.destinationDaytimeConadrEdit = destinationDaytimeConadrEdit;
	}
	public String getDestinationNameKanaEdit() {
		return destinationNameKanaEdit;
	}
	public void setDestinationNameKanaEdit(String destinationNameKanaEdit) {
		this.destinationNameKanaEdit = destinationNameKanaEdit;
	}
	public String getDestinationStoreCdEdit() {
		return destinationStoreCdEdit;
	}
	public void setDestinationStoreCdEdit(String destinationStoreCdEdit) {
		this.destinationStoreCdEdit = destinationStoreCdEdit;
	}
	public String getUserCmt() {
		return userCmt;
	}
	public void setUserCmt(String userCmt) {
		this.userCmt = userCmt;
	}
	public String getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}
	public Integer getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(Integer delFlg) {
		this.delFlg = delFlg;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public Long getCreateId() {
		return createId;
	}
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	public Long getUpdateId() {
		return updateId;
	}
	public void setUpdateId(Long updateId) {
		this.updateId = updateId;
	}
	public String getCreatePgmId() {
		return createPgmId;
	}
	public void setCreatePgmId(String createPgmId) {
		this.createPgmId = createPgmId;
	}
	public String getUpdatePgmId() {
		return updatePgmId;
	}
	public void setUpdatePgmId(String updatePgmId) {
		this.updatePgmId = updatePgmId;
	}
	public Long getVersion() {
		return version;
	}
	public void setVersion(Long version) {
		this.version = version;
	}

	public List<TradeDtls> getTradeDtls() {
		return tradeDtls;
	}

	public void setTradeDtls(List<TradeDtls> tradeDtls) {
		this.tradeDtls = tradeDtls;
	}
	public ShopDto getShopDto() {
		return shopDto;
	}
	public void setShopDto(ShopDto shopDto) {
		this.shopDto = shopDto;
	}
}
