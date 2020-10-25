package org.student;

import org.department.Department;

public class Student extends Department{
	
	
	public void studentName() {
		System.out.println("Gautham");

	}
	
	public void studentDept() {
		System.out.println("Electical Enginering");
	}
	
	public void studentId() {
		System.out.println("9536001");

	}

	public static void main(String[] args) {
		Student var = new Student();
		var.collegeCode();
		var.collegeName();
		var.collegeRank();
		var.deptName();
		var.studentName();
		var.studentId();
		var.studentDept();
	}

}
