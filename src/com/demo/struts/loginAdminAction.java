package com.demo.struts;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import com.demo.model.insurance_admin;
import com.opensymphony.xwork2.ActionSupport;

public class loginAdminAction extends ActionSupport implements SessionAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static Session session = null;
	
	private SessionMap<String, Object> adminsession;
	
	public void setSession(Map<String, Object> map) {
		adminsession = (SessionMap<String, Object>) map;
	}
	
	insurance_admin ia = new insurance_admin();
	
	public insurance_admin getIa() {
		return ia;
	}

	public void setIa(insurance_admin ia) {
		this.ia = ia;
	}


	public void validate() {
	      if (ia.getAdmin_name().length() == 0) {
	         addFieldError("ia.admin_name", "Admin Name is required");
	      };
	      if (ia.getAdmin_password().length() == 0) {
	         addFieldError("ia.admin_password", "Admin Password is required");
	      };
//	      if("admin".equals(ia.getAdmin_name()) && "admin".equals(ia.getAdmin_password())) {
//	    	  addActionMessage("You are valid user!");
//	      }else {
//	    	  addActionError("I don't know you, dont try to hack me!");
//	      }
	}
	
	public String signupAdmin() {
		boolean flag1 = false;
		try {
			loginAdminService log1 = new loginAdminService();
			flag1 = log1.signupAd(ia);
		}catch(Exception e) {
			e.printStackTrace();
		}
		if(flag1)
			return SUCCESS;
		else
			return ERROR;
	}
	
	public String loginAdmin() {
		
		adminsession.put("adminuname", ia.getAdmin_name());
		System.out.println(ia.getAdmin_name() + "   " + ia.getAdmin_password());
		boolean flag = loginAdminService.loginAd(ia.getAdmin_name(),ia.getAdmin_password());
		ia.setAdmin_name(loginAdminService.name);
		adminsession.put("adminuname", loginAdminService.name);
		if(flag) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
}
