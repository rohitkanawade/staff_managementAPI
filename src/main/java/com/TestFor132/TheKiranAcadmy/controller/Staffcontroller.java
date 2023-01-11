package com.TestFor132.TheKiranAcadmy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.TestFor132.TheKiranAcadmy.entity.staff;
import com.TestFor132.TheKiranAcadmy.service.Staffservice;

@RestController
public class Staffcontroller {
	@Autowired
	Staffservice ss;
	
	@GetMapping("/all")
	// http://localhost:8084/all
  public	List<staff>  getAllstaffinfo() {
		List<staff> sf=	ss.getAllstaffinfo();
		return sf;
	} 
  @GetMapping("/eq")
 // http://localhost:8084/eq
public  List<staff> getstaff3info() {
	  List<staff> sf=  ss.getstaff3info();
	  return sf;
  }
@GetMapping("/gt")
//http://localhost:8084/gt
 public  List<staff> getstaffsalarygreterthan20000info() {
	 List<staff> sf= ss.getstaffsalarygreterthan20000info();
	 return sf;
 }
 @GetMapping("/add")
 //post
// http://localhost:8084/add
 public boolean insertplayer(staff stf) {
		// TODO Auto-generated method stub
	return 	ss.insertplayer(stf);
	}
 @GetMapping("/between")
 //http://localhost:8084/between
 public  List<staff> getgetexperiencebetween10to20() {
	 List<staff> sf= ss.getexperiencebetween10to20();
	 return sf;
 }
 @GetMapping("/ne")
 //http://localhost:8084/ne
 public  List<staff> getexperienceNetoTrainer() {
	 List<staff> sf= ss.getexperienceNetoTrainer();
	 return sf;
 }
 
 @GetMapping("/eqOrIsNull")
 //http://localhost:8084/eqOrIsNull
 public List<staff> getProfileeqtoTrainer() {
	 List<staff> sf	= ss.getProfileeqtoTrainer();
	 return sf;
 }
 @GetMapping("/update")
 //http://localhost:8084/update
 public void updatesalarywhoidfour() {
	 ss.updatesalarywhoidfour();
 }
   @GetMapping("/max")
   //http://localhost:8084/max
 public List<staff> getmaxSalary() {
	 List<staff> sf=  ss.getmaxSalary();
	 return sf;
 }
 @GetMapping("/min")
 //http://localhost:8084/min
public List<staff> getminSalary() {
	 List<staff> sf=  ss.getminSalary();
	 return sf;
}
}
 
 
 
 
 