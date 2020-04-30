package com.example.service;

import java.util.List;

import com.example.model.Product;


public interface PServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}