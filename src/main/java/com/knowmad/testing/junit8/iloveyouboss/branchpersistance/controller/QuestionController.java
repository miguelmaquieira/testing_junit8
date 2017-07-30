package com.knowmad.testing.junit8.iloveyouboss.branchpersistance.controller;

import java.time.Clock;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class QuestionController {
	
	private Clock clock = Clock.systemUTC();
	
	private static EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("postgres-ds");
	}

	
	public void deleteAll() {
		executeInTransaction(em -> em.createNativeQuery("DELETE FROM Question"));
	}
	
	
	private void executeInTransaction(Consumer<EntityManager> func) {
		EntityManager em = em();

		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			func.accept(em);
			transaction.commit();
		} catch (Throwable t) {
			t.printStackTrace();
			transaction.rollback();
		}
		finally {
			em.close();
		}
	}
	
	private EntityManager em() {
		return getEntityManagerFactory().createEntityManager();
	}
}
