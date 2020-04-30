package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "place")
public class Product {
	@Id
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

	public Product(int productId, String productName, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}

}
