package PerEmp;

public class Employee extends Person
{
     Double sal;
     int startyr;
     String insNo;
      
     public void setSalary(Double d)
     {
         sal=d;
     } 
     public Double getSalary()
     {
        return sal;
     }
     public void setYear(int y)
     {
         startyr=y;
     } 
     public int getYear()
     {
        return startyr;
     }
     public void setInsNo(String s)
     {
         insNo=s;
     } 
     public String getInsNo()
     {
        return insNo;
     }
}