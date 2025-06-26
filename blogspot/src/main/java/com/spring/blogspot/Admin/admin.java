package com.spring.blogspot.Admin;

public class admin {
	String a_name;
	int age;
	String gender;
	String a_id;
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
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
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public admin(String a_name, int age, String gender, String a_id) {
		super();
		this.a_name = a_name;
		this.age = age;
		this.gender = gender;
		this.a_id = a_id;
	}
	@Override
	public String toString() {
		return "admin [a_name=" + a_name + ", age=" + age + ", gender=" + gender + ", a_id=" + a_id + "]";
	}
}
