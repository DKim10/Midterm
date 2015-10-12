package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@Test
	public void testAverageSalary() {
		//Creates arraylist for Staff
		List<Staff> StaffList = new ArrayList <Staff>();
		
		//Creates DOB to test
		Date TestDate = new Date();
		TestDate.setYear(1973);
		TestDate.setMonth(6);
		TestDate.setDate(21);
		
		//Creates date hired to test
		Date employed = new Date();
		employed.setYear(2001);
		employed.setMonth(0);
		employed.setDate(10);
		
		//Creates new instance of staff to create a new record
		Staff staff1 = new Staff();
		
		//Creates first name 
		staff1.setFirstName("Tim");
		
		//creates second name
		staff1.setMiddleName("Drake");
		
		//Creates last name
		staff1.setLastName("Kim");
		
		//handles possible exception for DOB
		try {
			staff1.setDOB(TestDate);
		} catch (PersonException e) {
			System.out.println(" You can't be born in the future " + e.getPerson());
	         e.printStackTrace();
		}
		
		//sets address
		staff1.setAddress("12 Glen Court");
		
		//handles possible exception for Phone Number
		try {
			staff1.setPhone("(410)-569-4119");
		} catch (PersonException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		
		//Sets email address
		staff1.setEmail("nj@gmailcom");
		
		//sets office hours
		staff1.setOffice("Monday 5-7");
		
		//sets Salary
		staff1.setSalary(25000.00);
		
		//sets hired date
		staff1.setHire(employed);
		
		//sets Title
		staff1.setTitle(eTitle.PROFESSOR);
		
		//adds record to StaffList
		StaffList.add(staff1);
		
		//changes DOB
		TestDate.setYear(1983);
		TestDate.setMonth(6);
		TestDate.setDate(21);
		
		//changes date hired
		employed.setYear(2002);
		employed.setMonth(1);
		employed.setDate(10);
		
		//creates new instance of Staff
		Staff staff2 = new Staff();
		
		
		staff2.setFirstName("Ian");
		staff2.setMiddleName("John");
		staff2.setLastName("McDaniel");
		try {
			staff2.setDOB(TestDate);
		} catch (PersonException e) {
			System.out.println(" You can't be born in the future " + e.getPerson());
	         e.printStackTrace();
		}
		staff2.setAddress("10 Glen Court");
		try {
			staff2.setPhone("(410)-568-9926");
		} catch (PersonException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		staff2.setEmail("Ma@gmailcom");
		staff2.setOffice("Monday 3-7");
		staff2.setSalary(15000.00);
		staff2.setHire(employed);
		staff2.setTitle(eTitle.TA);
		
		StaffList.add(staff2);
		
		TestDate.setYear(1982);
		TestDate.setMonth(7);
		TestDate.setDate(23);
		
		
		employed.setYear(2005);
		employed.setMonth(1);
		employed.setDate(10);
		
		Staff staff3 = new Staff();
		staff3.setFirstName("Bill");
		staff3.setMiddleName("Robert");
		staff3.setLastName("James");
		try {
			staff3.setDOB(TestDate);
		} catch (PersonException e) {
			System.out.println(" You can't be born in the future " + e.getPerson());
	         e.printStackTrace();
		}
		staff3.setAddress("110 Glen Court");
		try {
			staff3.setPhone("(410)-568-4923");
		} catch (PersonException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		staff3.setEmail("Mt@gmailcom");
		staff3.setOffice("Tuesday 3-7");
		staff3.setSalary(5000.00);
		staff3.setHire(employed);
		staff3.setTitle(eTitle.GRADUATE);
		
		StaffList.add(staff3);
		
		TestDate.setYear(1963);
		TestDate.setMonth(6);
		TestDate.setDate(21);
		
		
		employed.setYear(2000);
		employed.setMonth(1);
		employed.setDate(10);
		
		Staff staff4 = new Staff();
		staff4.setFirstName("Drake");
		staff4.setMiddleName("Tim");
		staff4.setLastName("Bell");
		try {
			staff4.setDOB(TestDate);
		} catch (PersonException e) {
			System.out.println(" You can't be born in the future " + e.getPerson());
	         e.printStackTrace();
		}
		staff4.setAddress("125 Glen Court");
		try {
			staff4.setPhone("(410)-568-8564");
		} catch (PersonException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		staff4.setEmail("Dc@gmailcom");
		staff4.setOffice("Monday 12-7");
		staff4.setSalary(35000.00);
		staff4.setHire(employed);
		staff4.setTitle(eTitle.PROFESSOR);
		
		StaffList.add(staff4);
		
		TestDate.setYear(1996);
		TestDate.setMonth(8);
		TestDate.setDate(21);
		
		
		employed.setYear(2005);
		employed.setMonth(1);
		employed.setDate(10);
		
		Staff staff5 = new Staff();
		staff5.setFirstName("Rachel");
		staff5.setMiddleName("Megan");
		staff5.setLastName("Ray");
		try {
			staff5.setDOB(TestDate);
		} catch (PersonException e) {
			System.out.println(" You can't be born in the future " + e.getPerson());
	         e.printStackTrace();
		}
		staff5.setAddress("101 Glen Court");
		try {
			staff5.setPhone("(410)-568-3875");
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		staff5.setEmail("Md@gmailcom");
		staff5.setOffice("Thursday 3-7");
		staff5.setSalary(55000.00);
		staff5.setHire(employed);
		staff5.setTitle(eTitle.TA);
		
		StaffList.add(staff5);
		
		double total = 0;
		double average = 0;
		for(int i = 0; i < StaffList.size() ; i++ ){
			total += StaffList.get(i).getSalary(); 
		}
		average = total/5;
		System.out.println(average);
		
		assertEquals("This is wrong", 27000.0, average,0);
		
	}
	
	/**{SimpleDateFormat sdf = new SimpleDateFormat();
	Date DateTest = null;
	String date = "07/20/2345";
	DateTest = sdf.parse("07/20/2345");}*/
	
	@Test
	public void testPersonDOB(){
		
		
		Date TestDate = new Date();
		TestDate.setYear(2345);
		TestDate.setMonth(6);
		TestDate.setDate(21);
		
		try {
			
			Staff staffe = new Staff();
			staffe.setDOB(TestDate);
		
		}catch(PersonException e){
			System.out.println(" You can't be born in the future ");
	         e.printStackTrace();
		}

	}
	
	@Test
	public void TestPersonPhoneNumber(){
		
		try{
			Staff staffEr = new Staff();
			staffEr.setPhone("302 832 5632");
			
		}catch(PersonException e){
			System.out.println("Wrong phone number format");
			e.printStackTrace();
		}
	}

}
