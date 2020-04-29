package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
			
	public List<Customer> getCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
			
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer",
											Customer.class);
		List<Customer> customers = theQuery.getResultList();
	return customers;
	}
	public Customer getCustomer(int id) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Customer theCustomer = currentSession.get(Customer.class, id);
		
		return theCustomer;
	}
	public List<Customer> getCustomers(int classroomid) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}





