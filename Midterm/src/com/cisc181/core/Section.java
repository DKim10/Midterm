package com.cisc181.core;

import java.util.UUID;

public class Section {

	private UUID CourseID;
	
	private UUID SemesterID;
	
	private UUID SectionID;
	
	private int RoomID;
	
	//no arg constructor
	public Section(){
		
	}
	
	//Two arg Constructor
	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID){
		
		this.CourseID = CourseID;
		
		this.SemesterID = SemesterID;
		
		this.SectionID = SectionID;
		
		this.RoomID = RoomID;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public int getRoomID(){
		return RoomID;
	}
	
	public void setRoomID(int RoomID){
		this.RoomID = RoomID;
	}
}
