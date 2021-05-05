package com.java.lesson2;

import java.util.Scanner;

public class Students {


	MyCourses myCourses;
	Student[] student;
	 
	public Students() {
		
	}
	
	public Students(MyCourses myCourses,Student[] students) {
		this.myCourses=myCourses;
		this.student=students;
	}
	public void listMyCourses() {
		myCourses.listMyCourse();
		System.out.println("--------------------------------------");
		System.out.println(" Kursa Kay�tl� Olan ��renci Listesi");
		System.out.println("--------------------------------------");
		for(int i=0;i<student.length;i++) {
			System.out.println((i+1)+"-"+student[i].firstName+
					" "+student[i].lastName);
		}
		
	}
	Scanner scanner = new Scanner(System.in);
	public void studentAdd() {
		System.out.println("��renci Bilgilerini giriniz:"+student.length);
		System.out.println("--------------------------------------");
		for(int i=0;i<student.length;i++) {
			student[i] = new Student();
			System.out.print((i+1)+". ��rencinin ad�n� giriniz: ");
			student[i].setFirstName(scanner.nextLine());
			System.out.print((i+1)+". ��rencinin soyad�n� giriniz: ");
			student[i].setLastName(scanner.nextLine());
		}
		System.out.println("��renci Say�s�:"+student.length);
	}
}
