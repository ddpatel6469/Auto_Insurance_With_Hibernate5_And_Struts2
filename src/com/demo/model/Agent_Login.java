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
	@Column(name = "Agent_L_Id")
	private int id;
	
	@Column(name = "Agent_Login_Unique_Id", unique = true, nullable = false)
	private int uid;
	
	@Column(name = "Agent_Password", nullable = false)
	private String password;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "agentlogin", fetch = FetchType.LAZY)
	private Agents agent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Agents getAgent() {
		return agent;
	}

	public void setAgent(Agents agent) {
		this.agent = agent;
	}
	
}
