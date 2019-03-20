package com.demo.struts;

import com.demo.model.insurance_admin;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	
	insurance_admin ia = new insurance_admin();
	
	



	public insurance_admin getIa() {
		return ia;
	}


	public void setIa(insurance_admin ia) {
		this.ia = ia;
	}


	public String signupAdmin() {
		boolean flag1 = false;
		try {
			
			loginAdmin log1 = new loginAdmin();
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
			
			loginAdmin log = new loginAdmin();
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
