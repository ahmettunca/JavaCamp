package com.java.lesson2;

import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Categories category1=new Categories("Yazýlýmcý Geliþtirme");
		MyCourses myCourses1 = new MyCourses("Java", "Engin Demiroð","Eðitim", new Date(), category1);
		
		System.out.print("Kaç öðrenci oluþturmak istiyorsunuz :");
		int sayi=scanner.nextInt();
		Student[] student = new Student[sayi];
		Students students = new Students(myCourses1, student);
		students.studentAdd();
		students.listMyCourses();
		}	
}
