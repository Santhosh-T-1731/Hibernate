package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveUser {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	User u=new User();
//	u.setId(1);
//	u.setFirstName("RockStar");
//	u.setLastName("Raghul");
//	u.setEmail("Raghul@gmail.com");
//	u.setPassword("2345");
//	u.setPhone(943956432);
	u.setId(1);
	u.setFirstName("RockStar");
	u.setLastName("Raghul");
	u.setEmail("Raghul@gmail");
	u.setPassword("3456");
	u.setPhone(843888883);
	
	
	u.setId(2);
	u.setFirstName("Santhosh");
	u.setLastName("T");
	u.setEmail("santhosh@gmail");
	u.setPassword("94426");
	u.setPhone(8300157233L);
	
	u.setId(3);
	u.setFirstName("Saravanan");
	u.setLastName("C");
	u.setEmail("saravanan@gmail.com");
	u.setPassword("5434");
	u.setPhone(8483848282L);
	
	et.begin();//start the transcation
	em.persist(u);//save
	et.commit();
	
	System.out.println("Data Saved");
}
}
