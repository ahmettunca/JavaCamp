package com.java.lesson3;

public class User {

	private int id;
	private String name;
	private String email;
	private String tel;
	
	public User() {
		
	}
	
	public User(int id, String name, String email, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
