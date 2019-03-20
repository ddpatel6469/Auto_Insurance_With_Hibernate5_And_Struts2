package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Insurance_Admin")
public class insurance_admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private int id;
	
	@Column(nullable = false, unique = true)
	private String admin_name;
	
	@Column(nullable = false)
	private String admin_password;
	
	public insurance_admin() {
		
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	/**
	 * @param id
	 * @param admin_name
	 * @param admin_password
	 */
	public insurance_admin(int id, String admin_name, String admin_password) {
		this.id = id;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}

	@Override
	public String toString() {
		return "insurance_admin [id=" + id + ", admin_name=" + admin_name + ", admin_password=" + admin_password + "]";
	}
	
	
}
