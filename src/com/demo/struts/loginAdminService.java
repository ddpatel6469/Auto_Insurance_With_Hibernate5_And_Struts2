package com.demo.struts;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.hbm.HibernateUtil;
import com.demo.model.insurance_admin;

public class loginAdminService {
	
	public boolean signupAd(String a,String b) {

		try {
			
			Session session1 = HibernateUtil.getSessionFactory().openSession();
			Transaction t1 = session1.beginTransaction();
			insurance_admin a1 = new insurance_admin();
			a1.setAdmin_name(a);
			a1.setAdmin_password(b);
			session1.save(a1);
			t1.commit();
			session1.close();
			System.out.println("saved");			
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
}

	public boolean loginAd(String c,String d) {

		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Query query = session.createQuery("from insurance_admin where admin_name=:aname and admin_password=:apassword");
			query.setParameter("aname", c);
			query.setParameter("apassword", d);
			List<loginAdminAction> list = query.list(); 
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