package com.camacode.hibernat.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
	//annotate class as an Entity
	//define the fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="instructor_detail_id")
	private String instructorDetailId;
	//annotate the file 
	
	//create constructors

	//generate getter and setter methods  
	 
	//generate toString() method
}
