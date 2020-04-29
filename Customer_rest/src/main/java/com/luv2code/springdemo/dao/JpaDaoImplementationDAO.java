package com.luv2code.springdemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;
@Repository
public class JpaDaoImplementationDAO implements CustomerDAO {
private EntityManager entityManager;
	
	@Autowired
	public void CustomerDAoHibImpl(EntityManager tentityManager){
		entityManager=tentityManager;
	}
	
	@Transactional
	public List<Customer> findAll() {
		
Session currentSession = entityManager.unwrap(Session.class);

Query<Customer> theQuery = 
		currentSession.createQuery("from Customer",
									Customer.class);
List<Customer> customers = theQuery.getResultList();
return customers;
		
	}
	public List<Customer> getCustomers(int classroomid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

}
