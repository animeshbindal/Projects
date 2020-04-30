package com.example.model;

public class OldProd {
	
	private int productId;
	private String productName;
	private int productPrice;

	public int getProductId() {
		return productId;
	}

	public void setProuctdId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProdPrice() {
		return productPrice;
	}

	public void setProdPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public OldProd(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public OldProd() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OldProd [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}

}



