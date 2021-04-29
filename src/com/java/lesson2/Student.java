package com.java.lesson2;

public class Student {
	int id;
	String firstName;
	String lastName;
	
	public Student() {
		
	}
	public Student(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public int getId() {return id;}
	public void setId(int id) {	this.id = id;}
	public String getFirstName() {	return firstName;}
	public void setFirstName(String firstName) {this.firstName = firstName;}
	public String getLastName() {return lastName;}
	public void setLastName(String lastName) {this.lastName = lastName;}
	

	
}
