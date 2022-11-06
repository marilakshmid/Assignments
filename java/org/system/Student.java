package org.system;

public class Student {
	public void getStudentInfo() {
		System.out.println("Student information");
	}

	public void getStudentInfo(int id) {
		System.out.println("Student Id is : " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student Name is " + name + "and Id is :" + id);
	}

	public void getStudentInfo(String email, String contactno) {
		System.out.println("Student email is :" + email + " and Mobile number is :" + contactno);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.getStudentInfo();
		s.getStudentInfo(5);
		s.getStudentInfo(5, "Lithika");
		s.getStudentInfo("lithika@gmail.com", "9876543210");
	}
}
