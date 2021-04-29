package com.java.lesson2;

public class Categories {

	int id;
	String categoryName;
	
	public Categories() {
		
	}
	public Categories(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getId() {return id;}

	public void setId(int id) {this.id = id;}

	public String getCategoryName() {return categoryName;}

	public void setCategoryName(String categoryName) {this.categoryName = categoryName;}

	public void listCategory() {
		System.out.println("----------------------------");
		System.out.println("Kodlama.io Sitesi Bilgileri");
		System.out.println("----------------------------");
		System.out.println("Kategori adý: "+ this.categoryName);
	}
}