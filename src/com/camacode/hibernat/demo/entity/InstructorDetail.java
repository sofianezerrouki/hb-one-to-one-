package com.camacode.hibernat.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	
	//annotate class as an Entity
	
	//define the fields
	
	//annotate the file 
	
	//create constructors

	//generate getter and setter methods  
	 
	//generate toString() method
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="youtube_channel")
	private String youtubechannel;
	@Column(name="hobby")
	private String hobby;
	
	@OneToOne(mappedBy = "instructorDetail",cascade = {CascadeType.DETACH,
													   CascadeType.PERSIST,
													   CascadeType.MERGE,
													   CascadeType.REFRESH													   
														})
	private Instructor instructor ; 
	
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public InstructorDetail( String youtubechannel, String hobby) {
		super();
		this.youtubechannel = youtubechannel;
		this.hobby = hobby;
	}
	public InstructorDetail() {
		//code
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYoutubechannel() {
		return youtubechannel;
	}
	public void setYoutubechannel(String youtubechannel) {
		this.youtubechannel = youtubechannel;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubechannel=" + youtubechannel + ", hobby=" + hobby + "]";
	}

}
