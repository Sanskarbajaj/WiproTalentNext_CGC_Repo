package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.Exception.*;
import com.mile1.Service.*;
public class StudentMain {
  

static Student data[]=new Student[4];
  
     StudentMain()
     {
         for(int i=0;i<data.length;i++)
             data[i]=new Student();
         
         data[0]=new Student(null,new int[]{85,75,95});
         data[1]=new Student("Arun",null);
         data[2]=new Student("Aakash",null);
         data[3]=new Student(null,new int[]{97,80,75});
     }
    
     public static void main(String[] args) {
    //    try
    //    {
           StudentMain st=new StudentMain();
           StudentService s=new StudentService();
           System.out.println(s.findNumberOfNullMarksArray(data));
           System.out.println(s.findNumberOfNullName(data));
           System.out.println(s.findNumberOfNullObjects(data));
           /*
           StudentReport s=new StudentReport();
           
           for(int i=0;i<data.length;i++)
           {
            s.validate(StudentMain.data[i]);
            System.out.println(s.findGrades(StudentMain.data[i]));
           }
        }
        catch(NullNameException | NullMarksArrayException | NullStudentObjectException e)
        {
        
            e.printStackTrace();
        }
        */
    }
	
}
