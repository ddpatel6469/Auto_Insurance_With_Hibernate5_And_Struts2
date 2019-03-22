package com.demo.struts;

import com.demo.model.insurance_admin;
import com.opensymphony.xwork2.ActionSupport;

public class loginAdminAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	   }
	
	public String signupAdmin() {
		boolean flag1 = false;
		try {
			
			loginAdminService log1 = new loginAdminService();
			flag1 = log1.signupAd(ia.getAdmin_name(),ia.getAdmin_password());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(flag1)
			return SUCCESS;
		else
			return ERROR;
	}
	
	
	public String loginAdmin() {
		
		boolean flag = false;
		try {
			
			loginAdminService log = new loginAdminService();
			flag = log.loginAd(ia.getAdmin_name(),ia.getAdmin_password());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(flag)
			return SUCCESS;
		else
			return ERROR;
	}
}
