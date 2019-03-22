package com.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Agent_Login_Credentials")
public class Agent_Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Agent_Login_Id")
	private int id;
	
	@Column(name = "Agent_Login_Unique_Id", unique = true, nullable = false)
	private int uid;
	
	@Column(name = "Agent_Password", nullable = false)
	private String password;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "agent_login", fetch = FetchType.LAZY)
	private Agent agent;
}
