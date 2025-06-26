package com.spring.blogspot.User;

import com.spring.blogspot.Admin.admin;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class user extends admin{
	private String name;
	private String password;
	private int age;
	private String gender;
	private String specialization;
	@Id
	private String u_id;
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
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public user(String name, String password, int age, String gender, String specialization, String u_id) {
		super(null, 0, null, null);
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.specialization = specialization;
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", specialization=" + specialization + ", u_id=" + u_id + "]";
	}
}
