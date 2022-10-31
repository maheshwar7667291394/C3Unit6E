package com.masai;

import antlr.collections.List;

public interface ProductService {
  
	public boolean addProduct(Product product);

	
	public java.util.List<Product> getAllProduct();
	
	

	public Product getProductById(int ProductId) throws Exception;
	 

	
	public java.util.List<Product> getProductsBetweenPrice(int fromPrice, int toPrice)throws Exception;
	
}
