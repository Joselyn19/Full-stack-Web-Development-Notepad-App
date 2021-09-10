package com.myweb.learning.jpa.jpain10steps.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.myweb.learning.jpa.jpain10steps.entity.User;

@Repository
@Transactional
public class UserDAOService {
	
//	User jack = new User("Jack", "Admin");
//	User jill = new User("Jill", "Admin");
//	
//	entityManager.persist(jack);
//	
//	//Persistence Context
//	
//	jack.setRole("User");
//	jill.setRole("User");
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}
}
