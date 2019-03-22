package com.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "Insurance_Agent")
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Agent_Id")
	private int id;
	
	@Column(name = "A_FName",nullable = false)
	private String fname;
	
	@Column(name = "A_MInitial",nullable = false)
	private String mname;
	
	@Column(name = "A_LName",nullable = false)
	private String lname;
	
	@Email
	@Column(name = "A_Email",nullable = false, unique = true)
	private String email;
	
	@Column(name = "A_DOB",nullable = false)
	private Date date;
	
	private List<String> a_gender;
	
	@Column(name = "A_Gender",nullable = false)
	private String gender;
	
	@Column(name = "A_CNumber",nullable = false)
	private String contact;
	
	@Column(name = "Agent_Address",nullable = false)
	private String address;
	
	@Column(name = "Agent_City",nullable = false)
	private String city;
	
	@Column(name = "Agent_State",nullable = false)
	private String state;
	
	@Column(name = "Agent_Zipcode",nullable = false)
	private String zipcode;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "Agent_Login_Id")
	private Agent_Login agent_login;
	
	public Agent() {
		a_gender = new ArrayList<String>();
		a_gender.add("male");
		a_gender.add("female");
	}
}
