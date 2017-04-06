package com.demo.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

public class SpringJPAMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		EntityManagerFactory emf = (EntityManagerFactory) ctx.getBean("entityManagerFactory");
		//EntityManagerFactory emf =lc.getObject();
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Dept dept = (Dept) em.find(Dept.class, 201);
			Emp e1 = new Emp(2, "Ankit", "Hyderabad", 50000); 
			Emp e2 = new Emp(3, "Shekhar", "bangalore", 52000);
			e1.setDept(dept);
			e2.setDept(dept);
			em.persist(e1);
			em.persist(e2);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}
	}

}
