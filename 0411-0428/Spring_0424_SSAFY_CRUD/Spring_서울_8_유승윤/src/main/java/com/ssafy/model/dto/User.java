package com.ssafy.model.dto;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String id;
	private String password;
	private String name;
	private String email;
	private int age;
	private String img;
	private int department_code;
	public User(String id, String password, String name, String email, int age, String img, int department_code) {

		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.age = age;
		this.img = img;
		this.department_code = department_code;
	}
	
	public User() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getDepartment_code() {
		return department_code;
	}

	public void setDepartment_code(int department_code) {
		this.department_code = department_code;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", img=" + img + ", department_code=" + department_code + "]";
	}
	
	
}
