package com.lti.AirlineBackend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.lti.AirlineBackend.entity.User;


@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public User addUser(User u) {
		em.persist(u);
		return u ;

	}
	
	
	
	public List<User> getAllUsers() {
     
        Query qry = em.createQuery("Select u from User u");
        List<User> userList=qry.getResultList();
       return userList;
    }

	@Override
	public User findUser(String userEmail) {
		User user = em.find(User.class, userEmail);
		return user;
	}
	

	
	

}

