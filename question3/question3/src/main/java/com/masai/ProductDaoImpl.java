package com.masai;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao{

	@Override
	public boolean Addproduct(Product product) {
		 EntityManager em=new GEtEntity().GetEm();
		 em.getTransaction().begin();
		 em.persist(product);
		 em.getTransaction().commit();
		 em.close();
		 
		 
		 
		return true;
	}

}
