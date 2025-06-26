package com.spring.blogspot.Misc;

import com.spring.blogspot.Admin.admin;

public class viewers extends admin {
	String name;
	String password;
	int age;
	String gender;
	String specialization;
	String v_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getV_id() {
		return v_id;
	}
	public void setV_id(String v_id) {
		this.v_id = v_id;
	}
	public viewers(String name, String password, int age, String gender, String specialization, String v_id) {
		super(null, 0, null, null);
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.specialization = specialization;
		this.v_id = v_id;
	}
	@Override
	public String toString() {
		return "viewers [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", specialization=" + specialization + ", v_id=" + v_id + "]";
	}
}
