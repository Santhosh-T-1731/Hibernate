package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	User u=em.find(User.class,2);
	
	if(u!=null) {
		
		u.setPassword("8300");
		
		et.begin();
		em.merge(u);
		et.commit();
	}else {
		System.out.println("Id not found");
	}
}
}
