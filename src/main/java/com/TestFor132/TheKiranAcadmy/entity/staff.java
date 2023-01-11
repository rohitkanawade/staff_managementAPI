package com.TestFor132.TheKiranAcadmy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class staff {
	
	private int staffid;
	private String name;
	private String profile;
	private int  salary;
	private int experience;
	@Id
	@Column
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	@Column
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Column
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "staff [staffid=" + staffid + ", name=" + name + ", profile=" + profile + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}
	
	

}
