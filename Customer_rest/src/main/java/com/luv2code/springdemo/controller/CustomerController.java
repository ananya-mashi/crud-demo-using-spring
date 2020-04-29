package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerDAO dao;
	@Autowired
	public CustomerController(CustomerDAO Cdao){
		dao=Cdao;
		
	}
	
	
	@GetMapping("/list")
	public List<Customer>findAll(){
	return dao.findAll();
}
	
	/*
	@Autowired
	private CustomerService cs;
	
	@GetMapping("/list")
	public List<Customer> getCustomer(){
	return cs.getCustomers();
}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id){
	Customer theCustomer = cs.getCustomer(id);

	if (theCustomer == null) {
		throw new CustomerNotFoundException("Customer id not found - " + id);
	}
	
	return theCustomer;
}

	@GetMapping("/customer/{classroomid}")
	public List<Customer> getCustomers(@PathVariable int classroomid){
		List<Customer> theCustomer = cs.getCustomers(classroomid);

	if (theCustomer == null) {
		throw new CustomerNotFoundException("classroomid id not found - " + classroomid);
	}
	return theCustomer;}
	*/}