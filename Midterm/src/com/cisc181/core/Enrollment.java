package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	private UUID SectionID;
	
	private UUID StudentID;
	
	private UUID EnrollmentID;
	
	private double Grade;
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID StudentID , UUID SectionID){
		
		this.SectionID = SectionID;
		
		this.StudentID = StudentID;
		
		this.EnrollmentID = UUID.randomUUID();
		
	}
	
	public void SetGrade(double Grade){
		this.Grade = Grade;
	}
	
	
}

