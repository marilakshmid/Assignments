package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName(String stud_name)
	{
		System.out.println("Student name is "+stud_name);
	}
	public void studentDept(String stud_dept)
	{
		System.out.println("Student department is "+stud_dept);
	}
	public void studentId(String stud_id)
	{
		System.out.println("Student ID is "+stud_id);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeCode(100);
		s.collegeName("TestLeaf");
		s.collegeRank(1);
		s.deptName("Automation");
		s.studentDept("Selenium");
		s.studentName("Marilakshmi");
		s.studentId("12345");
	}
}
