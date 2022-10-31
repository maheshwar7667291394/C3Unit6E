package com.masai;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class ProductRepo implements ProductService{

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(int ProductId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
