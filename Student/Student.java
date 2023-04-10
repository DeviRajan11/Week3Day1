package org.Student;

import org.Department.Department;

public class Student extends Department
{

	public void studentName()
	{
		System.out.println("Student Name");
	}
	public void studentDepartment()
	{
		System.out.println("StudentDepartment");
	}
	public void studentID()
	
	{
		System.out.println("Student ID");
	}
	public static void main(String[] args) {

		Student s = new Student();
		s.CollegeName();
		s.CollegeCode();
		s.CollegeRank();
		s.deptName();
		s.studentDepartment();
		s.studentName();
		s.studentID();
		
	}

}
