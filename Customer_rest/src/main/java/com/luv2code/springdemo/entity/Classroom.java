package com.luv2code.springdemo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="classroom")
public class Classroom {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="classroomid")
	private int classroomid;

	public int getClassroomid() {
		return classroomid;
	}

	public void setClassroomid(int classroomid) {
		this.classroomid = classroomid;
	}

	@Override
	public String toString() {
		return "Class [classroomid=" + classroomid + "]";
	}
	
	
	@OneToMany(mappedBy="classroom")
	private List<Customer> customer;
	
	
	public Classroom(){
		
	}

	public Classroom(int classroomid) {
		super();
		this.classroomid = classroomid;
	
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
	
}
