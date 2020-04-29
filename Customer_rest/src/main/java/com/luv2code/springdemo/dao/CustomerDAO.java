package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {


	public List<Customer> getCustomers();
	public Customer getCustomer(int theId);

	public List<Customer> getCustomers(int classroomid);
	public List<Customer> findAll();
}
