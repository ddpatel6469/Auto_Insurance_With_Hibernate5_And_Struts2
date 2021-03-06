package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Insurance_Agent")
public class Agents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Agent_Id")
	private int id;
	
	@Column(name = "A_UID", nullable = false, unique = true)
	private String uid;
	
	@Column(name = "A_FName",nullable = false)
	private String fname;
	
	@Column(name = "A_MInitial",nullable = false)
	private String mname;
	
	@Column(name = "A_LName",nullable = false)
	private String lname;
	
	@Column(name = "A_Gender",nullable = false)
	private String gender;
	
	@Column(name = "A_Email",nullable = false, unique = true)
	private String email;
	
	@Column(name = "A_DOB",nullable = false)
	private Date date;
	
	@Column(name = "A_CNumber",nullable = false)
	private String contact;
	
	@Column(name = "A_Address",nullable = false)
	private String address;
	
	@Column(name = "A_City",nullable = false)
	private String city;
	
	@Column(name = "A_State",nullable = false)
	private String state;
	
	@Column(name = "A_Zipcode",nullable = false)
	private int zipcode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Agent_Login_Connect")
	private Agent_Login agentlogin;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	public Agent_Login getAgentlogin() {
		return agentlogin;
	}

	public void setAgentlogin(Agent_Login agentlogin) {
		this.agentlogin = agentlogin;
	}

	public Agents() {
	}
}
