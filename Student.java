package com.aadarsh;

public class Student {
	
	 int roll;
	 String name;
	 int marks;

	 void displayStudentDetails(int r, String n ,int mar) {
		 
		 System.out.println("Roll no: "+r);
		 System.out.println("name: "+n);
		 System.out.println("Marks: "+mar);
		
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Aakash = new Student();
		Aakash.roll =123456;
		Aakash.name = "Aakash";
		Aakash.marks = 90;
		
		
		Student zenna = new Student();
		zenna.roll = 987456;
		zenna.name = "zenna";
		zenna.marks = 75;
		
		zenna.displayStudentDetails(zenna.roll, zenna.name, zenna.marks);
		Aakash.displayStudentDetails(Aakash.roll, Aakash.name, Aakash.marks);
		
		zenna = null;
		Aakash = null;
		
		
	}

}
