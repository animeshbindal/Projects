package com.example.dao;

import java.util.List;

import com.example.model.Product;


public interface ProdDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}