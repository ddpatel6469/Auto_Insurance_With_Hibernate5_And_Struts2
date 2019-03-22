package com.demo.struts;


import com.demo.model.Agents;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAgentAction extends ActionSupport implements Action {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Agents a = new Agents();
	
	public Agents getA() {
		return a;
	}

	public void setA(Agents a) {
		this.a = a;
	}

	public String registerAgents() {
		boolean register = false;
		try {
			RegisterAgentService ras = new RegisterAgentService();
			register = ras.registerAgent(a);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(register)
			return SUCCESS;
		else
			return ERROR;
	}
	
}
