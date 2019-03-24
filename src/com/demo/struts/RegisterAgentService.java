package com.demo.struts;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.hbm.HibernateUtil;
import com.demo.model.Agent_Login;
import com.demo.model.Agents;

public class RegisterAgentService {
	
	static Session session2 = null;

	public boolean registerAgent(Agents a) {

		try {
			
			session2 = HibernateUtil.getSessionFactory().openSession();
			Transaction t2 = session2.beginTransaction();
			session2.save(a);
			t2.commit();
			session2.close();
			System.out.println("saved");			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
}
	public static List<Agents> getAgents() {
		try {
			String a= "12";
			session2 = HibernateUtil.getSessionFactory().openSession();
			Query q = session2.createQuery("From Agents");
//			q.setParameter("uid", a);
			List<Agents> l1 = q.list();
			System.out.println(l1.size()+ "for" + a);
			return l1;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean registerAgentLogin(Agent_Login al) {
		
		try {	
			session2 = HibernateUtil.getSessionFactory().openSession();
			Transaction t2 = session2.beginTransaction();
			session2.save(al);
			t2.commit();
			session2.close();
			System.out.println("saved");			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
}
