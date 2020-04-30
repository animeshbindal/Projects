package com.example.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProdDaoInterface;
import com.example.model.Product;

@Service
public class PService implements PServiceInterface {
	@Autowired
	ProdDaoInterface prodDao;

	@Override
	public Product save(Product product) {
		boolean result = prodDao.create(product);

		if (result) {
			return product;
		} else
			return null;
	}

	@Override
	public List<Product> reterive() {
		// TODO Auto-generated method stub
		return prodDao.reterive();
	}
}

