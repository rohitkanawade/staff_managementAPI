
package com.TestFor132.TheKiranAcadmy.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.MAX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.TestFor132.TheKiranAcadmy.entity.staff;

@Repository
public class Staffdao {
	
	@Autowired
	SessionFactory sf;

	public List<staff> getAllstaffinfo() {
	Session session=sf.openSession();
	Criteria criteria=session.createCriteria(staff.class);
	List<staff> sf= criteria.list();
	
	session.close();
	return sf;
	
	
	
	
		
	}

	public List<staff> getstaff3info() {
	Session session= sf.openSession();
	Criteria criteria=session.createCriteria(staff.class);
	criteria.add(Restrictions.eq("staffid",3));
	List<staff> sf= criteria.list();
	session.close();
	return sf;
		
	}
	public List<staff> getstaffsalarygreterthan20000info() {
		Session session= sf.openSession();
		Criteria criteria=session.createCriteria(staff.class);
		criteria.add(Restrictions.gt("salary",20000));
		List<staff> sf= criteria.list();
		session.close();
		return sf;
			
		}
public boolean insertplayer(staff stf) {
		
		Session session=sf.openSession();
		Transaction tr= session.beginTransaction();
		System.out.println(stf);
		
		session.save(stf);
		
		session.close();
		tr.commit();
		return true;
		
	}
public List<staff> getgetexperiencebetween10to20() {
	Session session= sf.openSession();
	Criteria criteria=session.createCriteria(staff.class);
	criteria.add(Restrictions.between("experience", 10, 20));
	List<staff> sf= criteria.list();
	session.close();
	return sf;
		
	}

public List<staff> getexperienceNetoTrainer() {
	// TODO Auto-generated method stub
	Session session= sf.openSession();
	Criteria criteria=session.createCriteria(staff.class);
	criteria.add(Restrictions.ne("profile","Trainer"));
	
	List<staff> sf= criteria.list();
	session.close();
	return sf;
}

public List<staff> getProfileeqtoTrainer() {
  Session session=sf.openSession();
	Criteria criteria=session.createCriteria(staff.class);
	criteria.add(Restrictions.eqOrIsNull("profile", "Trainer"));
	List<staff> sf=criteria.list();
	session.close();
	return sf;
}
public void updatesalarywhoidfour() {
	Session session=sf.openSession(); 
	Transaction tr=session.beginTransaction();
	
	staff s=new staff();
s.setStaffid(4);
s.setSalary(75000);
s.setExperience(22);
s.setName("pankaj");
s.setProfile("admin");

session.update(s);
tr.commit();
	session.close(); 
}
public List<staff> getmaxSalary() {
	Session session=sf.openSession();
	Criteria criteria=session.createCriteria(staff.class);
	criteria.setProjection(Projections.max("salary"));
	List<staff>sf=criteria.list();
	session.close();
	return sf;
	
   
	
}
public List<staff> getminSalary() {
	Session session=sf.openSession();
	Criteria criteria=session.createCriteria(staff.class);
	criteria.setProjection(Projections.min("salary"));
	List<staff>sf=criteria.list();
	session.close();
	return sf;

}
}

