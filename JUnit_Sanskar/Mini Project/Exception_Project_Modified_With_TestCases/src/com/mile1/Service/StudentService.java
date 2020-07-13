package com.mile1.Service;
import com.mile1.bean.*;

public class StudentService {

	public int findNumberOfNullMarksArray(Student s[])
	{   int count=0;
	    for(int i=0;i<s.length;i++)
	    {
	       if(s[i].getMarks()==null)
	       {
	           count++;
	       }
	    }
	    return count;
	}

	public int findNumberOfNullName(Student[] s)
	{
	    int count=0;
	    for(int i=0;i<s.length;i++)
	    {
	       if(s[i].getName()==null)
	       {
	           count++;
	       }
	    }
	    return count;
	}

	public int findNumberOfNullObjects(Student[] s)
	{
	    int count=0;
	    for(int i=0;i<s.length;i++)
	    {
	       if(s[i]==null)
	       {
	           count++;
	       }
	    }
	    return count;
	}

	
}
