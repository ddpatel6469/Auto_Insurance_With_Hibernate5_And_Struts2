package com.demo.struts;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.hbm.HibernateUtil;
import com.demo.model.Agent_Login;
import com.demo.model.Agents;

public class RegisterAgentService {
	
	Agents age = new Agents();
	
	public Agents getAge() {
		return age;
	}
	public void setAge(Agents age) {
		this.age = age;
	}
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
	public boolean delete1() {
		try {
			session2 = HibernateUtil.getSessionFactory().openSession();
			Transaction t3 = session2.beginTransaction();
			String hql = "delete from Agents where id= 1";
			Query q1 = session2.createQuery(hql);
//			System.out.println(age.getId());
//			System.out.println("bhai bhai");
//			q1.setInteger("id", age.getId());
			System.out.println(q1.executeUpdate());
			t3.commit();
			session2.close();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public int delete(String id1) {
		try {
			session2 = HibernateUtil.getSessionFactory().openSession();
			Transaction t4 = session2.beginTransaction();
			int v = Integer.parseInt(id1);
			Query q1 = session2.createQuery("delete from Agents where id= :id");
//			PreparedStatement ps = con.prepareStatement("delete from products where id=?");
			q1.setInteger("id", v);
			q1.executeUpdate();
			t4.commit();
			session2.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
}
