package com.TestFor132.TheKiranAcadmy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.TestFor132.TheKiranAcadmy.dao.Staffdao;
import com.TestFor132.TheKiranAcadmy.entity.staff;

@Service
public class Staffservice {
	@Autowired
	Staffdao sd;

	public List<staff>  getAllstaffinfo() {
		 List<staff> sf=	sd.getAllstaffinfo();
		return sf;
	}

	public List<staff> getstaff3info() {
		List<staff> sf=	sd.getstaff3info();
		
			return sf;
		}


	public List<staff> getstaffsalarygreterthan20000info() {
		List<staff> sf=	sd.getstaffsalarygreterthan20000info();
		return sf;
	}
	public boolean insertplayer(staff stf) {
		// TODO Auto-generated method stub
	return 	sd.insertplayer(stf);
	}

	public List<staff> getexperiencebetween10to20() {
		List<staff> sf=	sd.getgetexperiencebetween10to20();
		return sf;
	}

	public List<staff> getexperienceNetoTrainer() {
		 List<staff> sf= sd.getexperienceNetoTrainer();
		return sf;
	}

	public List<staff> getProfileeqtoTrainer() {
		List<staff> sf=	sd.getProfileeqtoTrainer();
	 return sf;
	}
	
  public void updatesalarywhoidfour() {
	  sd.updatesalarywhoidfour();
  }

public List<staff> getmaxSalary() {
	List<staff> sf  =sd.getmaxSalary();	
	return sf;
}
public List<staff> getminSalary() {
	List<staff> sf  =sd.getminSalary();	
	return sf;
}

	}


