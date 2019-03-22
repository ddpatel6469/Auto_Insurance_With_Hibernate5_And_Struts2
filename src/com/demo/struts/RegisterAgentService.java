package com.demo.struts;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.hbm.HibernateUtil;
import com.demo.model.Agents;

public class RegisterAgentService {

	public boolean registerAgent(Agents a) {

		try {
			Session session2 = HibernateUtil.getSessionFactory().openSession();
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
}
