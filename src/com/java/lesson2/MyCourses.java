package com.java.lesson2;

import java.util.Date;

public class MyCourses {
	int id;
	String name;
	String author;
	String content;
	Date creationDate;
	Categories categories;
	
	public MyCourses() {
		
	}
	public MyCourses(String name, String author,  String content, Date creationDate,Categories categories) {
		this.name = name;
		this.author = author;
		this.content = content;
		this.creationDate = creationDate;
		this.categories=categories;
	}
 
	public int getId() {return id;}
	public void setId(int id) {this.id=id;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public Date getCreationDate() {return creationDate;}
	public void setCreationDate(Date creationDate) {this.creationDate = creationDate;}
	public void listMyCourse() {
		categories.listCategory();
		System.out.println("Kurs adý: "+this.name+
				   "\nKurs sahibi: "+this.author+
				   "\nKurs içeriði: "+this.content+
				   "\nKurs oluþturulma tarihi: "+this.creationDate);
	}
		
}
