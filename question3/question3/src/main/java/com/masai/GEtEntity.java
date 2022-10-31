package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GEtEntity {
	
	private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("empUnit");
	}
	
	public EntityManager GetEm() {
		EntityManager em=emf.createEntityManager();
		return em;
	}

	
}
