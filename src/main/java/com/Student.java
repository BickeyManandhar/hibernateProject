package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //table will be created in the database as mentioned in hibernate.cfg.xml
public class Student {

	// we will change these attributes into columns of database using hibernate
	private int collegeId;
	private String name;
	private String major;
	private String country;

	public Student() {
		super();
	}

	public Student(int collegeId, String name, String major, String country) {
		super();
		this.collegeId = collegeId;
		this.name = name;
		this.major = major;
		this.country = country;
	}

	@Id //CollegeId as primary key 
	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [collegeId=" + collegeId + ", name=" + name + ", major=" + major + ", country=" + country + "]";
	}

}
