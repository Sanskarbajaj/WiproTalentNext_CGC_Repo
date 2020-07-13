package com.mile1.Service;
import com.mile1.bean.Student;
import com.mile1.Exception.*;


public class StudentReport {

	  public String findGrades(Student studentObject)
	    {
	        int marks[]=studentObject.getMarks();
	        
	        int sum=0;
	        for(int i=0;i<marks.length;i++)
	        {
	            if(marks[i]<35)
	                return "F";
	        }
	        for(int i=0;i<marks.length;i++)
	        {
	           sum+=marks[i];
	        }
	        if(sum<130)
	        	return "D";
	        else if(sum<150)
	             return "C";
	        else if(sum<200)
	             return "B";
	        else if(sum<250)
	             return "A";
	        else
	             return "A+";
	            
	        

	    }
	    
	    public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException
	    {
	        if(s==null)
	            throw new NullStudentObjectException();
	        else if(s.getName()==null)
	            throw new NullNameException();
	        else if(s.getMarks()==null)
	            throw new NullMarksArrayException();
	        else 
	            return "Valid";
	                    
	    }
	    
	    
	
}
