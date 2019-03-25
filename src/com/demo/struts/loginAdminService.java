package com.demo.struts;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.hbm.HibernateUtil;
import com.demo.model.insurance_admin;

public class loginAdminService {
	
	static Session session1 = null;
	public static String name;
	
	
	public boolean signupAd(insurance_admin ia) {

		try {
			
			session1 = HibernateUtil.getSessionFactory().openSession();
			Transaction t1 = session1.beginTransaction();
			session1.save(ia);
			t1.commit();
			session1.close();
			System.out.println("saved");			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
}

	public static boolean loginAd(String c,String d) {

		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from insurance_admin where admin_name=:aname and admin_password=:apassword");
			query.setParameter("aname", c);
			query.setParameter("apassword", d);
			List<insurance_admin> list = query.list();
			for(insurance_admin i : list) {
				name = i.getAdmin_name();
			}
			System.out.println(list);
			
			if(list != null && list.size()==1)
			return true;
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}