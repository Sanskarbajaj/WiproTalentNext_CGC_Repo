package com.mile1.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.mile1.Service.*;
import com.mile1.bean.Student;
import com.mile1.Exception.*;

public class TestAllMethods {

	

	@Test
	public void test1() {
		//TC1,TC2,TC3
		
		int marks[]={80,90,40};
		Student s=new Student("Gourav",marks);
		StudentReport sr=new StudentReport();
		
		 assertEquals("A",sr.findGrades(s));
		
		  int marks2[]= {40,40,40};
		   s=new Student("Rahul",marks2);
		   assertEquals("D",sr.findGrades(s));
		   
		   marks2[2]=10;
		   s=new Student("gourav",marks2);
		   assertEquals("F",sr.findGrades(s));
		
	}
	//TC4
	@Test
	public void test2() {
		 boolean b=false;
		
		Student s=null;
		StudentReport sr=new StudentReport();
		try {
		sr.validate(s);
		}
		catch(NullStudentObjectException | NullMarksArrayException | NullNameException e)
		{
			b=true;
		}
		assertTrue(b);
	}
       
	//TC5
		@Test
		public void test3() {
			 boolean b=false;
			int marks[]= {20,36,52};
			Student s=new Student(null,marks);
			StudentReport sr=new StudentReport();
			try {
			sr.validate(s);
			}
			catch(NullStudentObjectException | NullMarksArrayException | NullNameException e)
			{
				b=true;
			}
			assertTrue(b);
		}
		
		//TC6
		@Test
		public void test4() {
			 boolean b=false;
			
			Student s=new Student("gourav",null);
			StudentReport sr=new StudentReport();
			try {
			sr.validate(s);
			}
			catch(NullStudentObjectException | NullMarksArrayException | NullNameException e)
			{
				b=true;
			}
			assertTrue(b);
		}
		
		@Test
		public void test5() {
            int marks[]= {40,75,86};
            Student []s=new Student[4];
			s[0]=new Student("Gourav",null);
			s[1]=new Student(null,marks);
			s[2]=new Student();
			s[3]=new Student();
			StudentService ss=new StudentService();
			
			int x= ss.findNumberOfNullObjects(s);
			assertEquals(x,0);
		    int y=ss.findNumberOfNullMarksArray(s);
		    assertEquals(y,3);
			int z=ss.findNumberOfNullName(s);
			assertEquals(z,3);
			
		}
}





