package com.fynd.warehouse.dto;

public class Rack {
	private int slotNo;
	private long productCode;
	private String productName;
	private String productColor;
	public Rack(int slotNo, long productCode, String productName, String productColor) {
		super();
		this.slotNo = slotNo;
		this.productCode = productCode;
		this.productName = productName;
		this.productColor = productColor;
	}
	public int getSlotNo() {
		return slotNo;
	}
	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}
	public long getProductCode() {
		return productCode;
	}
	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	@Override
	public String toString() {
		return "Rack [slotNo=" + slotNo + ", productCode=" + productCode + ", productName=" + productName
				+ ", productColor=" + productColor + "]";
	}
		
}
