package com.demo.struts;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import com.demo.model.Agent_Login;
import com.demo.model.Agents;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAgentAction extends ActionSupport implements Action,SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String condition= "DATA_CHHE";
	
	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	static Session session = null;

	List<Agents> agentlist;
	
	public List<Agents> getAgentlist() {
		return agentlist;
	}

	public void setAgentlist(List<Agents> agentlist) {
		this.agentlist = agentlist;
	}

	private SessionMap<String, Object> adminsession;
	
	public void setSession(Map<String, Object> map) {
		adminsession = (SessionMap<String, Object>) map;
	}
	
	Agents a = new Agents();
	
	public Agents getA() {
		return a;
	}

	public void setA(Agents a) {
		this.a = a;
	}
	
	Agent_Login al = new Agent_Login();
	
	public Agent_Login getAl() {
		return al;
	}

	public void setAl(Agent_Login al) {
		this.al = al;
	}
	

//	public void validate() {
//	      if (a.getFname().length() == 0) {
//	         addFieldError("a.fname", "Agent First Name is not Valid");
//	      }else if(a.getUid().length() == 0) {
//	    	  addFieldError("a.uid","Agent id is not Valid");
//	      }else if (a.getMname().length() == 0) {
//	    	  addFieldError("a.mname", "Agent Middle Initial is not Valid");
//	      }else if (a.getLname().length() == 0) {
//	    	  addFieldError("a.lname", "Agent Last Name is not Valid");
//	      }else if (a.getEmail().length() == 0) {
//	    	  addFieldError("a.email", "Agent Email is not Valid");
//	      }else if (a.getContact().length() != 10) {
//	    	  addFieldError("a.contact", "Agent Contact Number is not Valid");
//	      }else if (a.getAddress().length() == 0) {
//	    	  addFieldError("a.address", "Agent Address is not Valid");
//	      }else if (a.getCity().length() == 0) {
//	    	  addFieldError("a.city", "Agent City is not Valid");
//	      }else if (a.getState().length() == 0) {
//	    	  addFieldError("a.state", "Agent State is not Valid");}
////	      }else if (String.valueOf(a.getZipcode()).length() == 0) {
////	    	  addFieldError("a.zipcode", "Agent Zip code is not Valid");
////	      }
//	   }

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
	
	public String viewAgents() {
//		String adminid = (String) adminsession.get("adminuname");
//		System.out.println("Number of admins for" + adminid);
		agentlist = RegisterAgentService.getAgents();
		System.out.println(agentlist.size());
		if(agentlist.size()>0) {
			condition = "DATA_CHHE";
			return SUCCESS;
		}else {
		
			condition = "DATA_NATHI";
			return SUCCESS;
		}
	}
		
	public String logout(){  
       
		adminsession.remove("adminuname");
		adminsession.invalidate();
           return "success";
         }
	
	public String viewAgentsLogin() {
		
		boolean register1 = false;
		try {
			RegisterAgentService ras1 = new RegisterAgentService();
			register1 = ras1.registerAgentLogin(al);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(register1)
			return SUCCESS;
		else
			return ERROR;
	}
	
	public String delete() {
		
		System.out.println("Starting of delete");
		boolean del = false;
		try {
			RegisterAgentService ras2 = new RegisterAgentService();
			del = ras2.delete1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(del) {
		return SUCCESS;
		}else {
			return ERROR;
		}
	}
}
