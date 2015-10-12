package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
private UUID CourseID;
	
	private String CourseName;
	
	private int GradePoints;
	
	private eMajor Major;
	
	//No arg constructor
	public Course(){
		
	}
	
	//two arg construuctor
	public Course(String CourseName, int GradePoints, eMajor Major){
		
		this.CourseName = CourseName;
		
		this.GradePoints = GradePoints;
		
		this.Major = Major;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	
	public int getGradePoints(){
		return GradePoints;
	}
	
	public void setGradePoints(int GradePoints){
		this.GradePoints = GradePoints;
	}
	
	public eMajor getMajor(){
		return Major;
	}
	
	public void setMajor(eMajor Major){
		this.Major = Major;
	}
	
	
}

