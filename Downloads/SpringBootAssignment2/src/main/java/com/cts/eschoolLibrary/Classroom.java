package com.cts.eschoolLibrary;

import org.springframework.beans.factory.annotation.Autowired;


public class Classroom {
	
	private Student student;

	@Autowired
	public Classroom(Student student) {
		super();
		this.student = student;
	}
	
	public void displayStudentDetails() {
		System.out.println("\n\n>>The name of the student is: "+student.getName()+"  "
				+ "and the Age is :"+student.getAge());
	}
	
	

}
