package com.mile1.bean;

public class Student {

	 String name;
	    int marks[];
	    String grade;
	    public Student()
	    {
	        
	    }
	    public Student(String name,int[] marks)
	    {
	        this.name=name;
	        this.marks=marks;
	    }

	    public String getName() {
	        return name;
	    }

	    public int[] getMarks() {
	        return marks;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setMarks(int[] marks) {
	        this.marks = marks;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }
	    
}
