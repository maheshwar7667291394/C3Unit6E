package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao pdao;

	@Override
	public boolean addProduct(Product product) {
		boolean t=pdao.Addproduct(product);
		return t;
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
