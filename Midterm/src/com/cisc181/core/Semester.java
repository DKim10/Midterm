package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID SemesterID;
	
	private Date StartDate;
	
	private Date EndDate;
	
	private ArrayList<Course> course = new ArrayList<Course>();
	
	//no arg constructor
	public Semester(){
		
	}
	
	//3 arg constructor
	public Semester(UUID SemesterID, Date StartDate, Date EndDate){
		
		this.SemesterID = SemesterID;
		
		this.StartDate = StartDate;
		
		this.EndDate = EndDate;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	
	public Date getStartDate(){
		return StartDate;
		
	}
	
	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;
	}
	
	public Date getEndDate(){
		return StartDate;
	}
	
	public void setEndDate(Date EndDate){
		this.EndDate = EndDate;
	}
}

	