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
		System.out.println(" Kursa Kayıtlı Olan Öğrenci Listesi");
		System.out.println("--------------------------------------");
		for(int i=0;i<student.length;i++) {
			System.out.println((i+1)+"-"+student[i].firstName+
					" "+student[i].lastName);
		}
		
	}
	Scanner scanner = new Scanner(System.in);
	public void studentAdd() {
		System.out.println("Öğrenci Bilgilerini giriniz:"+student.length);
		System.out.println("--------------------------------------");
		for(int i=0;i<student.length;i++) {
			student[i] = new Student();
			System.out.print((i+1)+". öğrencinin adını giriniz: ");
			student[i].setFirstName(scanner.nextLine());
			System.out.print((i+1)+". öğrencinin soyadını giriniz: ");
			student[i].setLastName(scanner.nextLine());
		}
		System.out.println("Öğrenci Sayısı:"+student.length);
	}
}
