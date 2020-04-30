package Anu44.cg.gla.spring.dao;

import java.util.List;

import Anu44.cg.gla.spring.entity.Product;
import Anu44.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}
