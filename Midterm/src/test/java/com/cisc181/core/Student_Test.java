package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//Ceates new courses adds to array
		List<Course> CourseList = new ArrayList <Course>();
		Course course1 = new Course();
		course1.setCourseName("Calculus I");
		course1.setGradePoints(60);
		course1.setMajor(eMajor.PHYSICS);
		CourseList.add(course1);
		
		Course course2 = new Course();
		course2.setCourseName("Intro. to Java");
		course2.setGradePoints(80);
		course2.setMajor(eMajor.COMPSI);
		CourseList.add(course2);
		
		Course course3 = new Course();
		course3.setCourseName("Intro. to Chem. I");
		course3.setGradePoints(30);
		course3.setMajor(eMajor.CHEM);
		CourseList.add(course3);
		
		//creates two semesters
		List<Semester> SemesterList = new ArrayList <Semester>();
		Semester Fall = new Semester();
		Semester Spring = new Semester();
		SemesterList.add(Fall);
		SemesterList.add(Spring);
		
		//Creates 6 sections
		List<Section> SectionList = new ArrayList<Section>();
		Section section1 = new Section();
		Section section2 = new Section();
		Section section3 = new Section();
		Section section4 = new Section();
		Section section5 = new Section();
		Section section6 = new Section();
		
		section1.setSectionID(UUID.randomUUID());
		section2.setSectionID(UUID.randomUUID());
		section3.setSectionID(UUID.randomUUID());
		section4.setSectionID(UUID.randomUUID());
		section5.setSectionID(UUID.randomUUID());
		section6.setSectionID(UUID.randomUUID());

		SectionList.add(section1);
		SectionList.add(section2);
		SectionList.add(section3);
		SectionList.add(section4);
		SectionList.add(section5);
		SectionList.add(section6);
		
		//Create 10 students
		List<Student> StudentList = new ArrayList<Student>();
		
		
	}
	
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
