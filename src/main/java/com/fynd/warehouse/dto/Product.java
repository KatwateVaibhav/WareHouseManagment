package com.fynd.warehouse.dto;

public class Product {
private String productId;
private String productColor;
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductColor() {
	return productColor;
}
public void setProductColor(String productColor) {
	this.productColor = productColor;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productColor=" + productColor + "]";
}


}
