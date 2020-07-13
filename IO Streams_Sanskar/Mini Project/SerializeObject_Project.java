
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SerializeObject_Project
{
   FileOutputStream fos=null;
   FileInputStream fis=null;
   ArrayList<Employee> list=null;
   public SerializeObject_Project()
   {
       list=new ArrayList<>();
   }
   

   public static void main(String[] args) throws Exception
   {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n=0;
     SerializeObject_Project sobj=new SerializeObject_Project();
     do
     {
       System.out.println("MAIN MENU\n1. Add an Employee\n2. Display All\n3.Exit");
       n=Integer.parseInt(br.readLine());
       if(n==1)
       {
           System.out.print("Enter Employee ID : ");      int id=Integer.parseInt(br.readLine());
           System.out.print("Enter Employee Name : ");    String name=br.readLine();
           System.out.print("Enter Employee Age : ");     int age=Integer.parseInt(br.readLine());
           System.out.print("Enter Employee Salary : ");  Double sal=Double.parseDouble(br.readLine());
           
           sobj.list.add(new Employee(id,name,age,sal));
           sobj.writeTheObject();
       }
       else if(n==2)
       {
            System.out.println("-------------------------Report--------------------------------");
            sobj.displayAll();
            System.out.println("----------------------End Of Report----------------------------");
       }
     }while(n!=3);





   }

    public void writeTheObject()
    {
          try
          {
               fos=new FileOutputStream("StateOfObject.txt");
               ObjectOutputStream oos =new ObjectOutputStream(fos);
               oos.writeObject(this.list);
               fos.close();
               oos.close();
	  }
          catch(FileNotFoundException e)
          {
              System.out.println(e);
          }
          catch(IOException e)
          {
              System.out.println(e);
          }
    }//end of method

    public void displayAll()
    {
         try
          {
               fis=new FileInputStream("StateOfObject.txt");
               ObjectInputStream ois =new ObjectInputStream(fis);
               ArrayList<Employee>  l=(ArrayList<Employee>)ois.readObject();
               Iterator itr=l.iterator();
               while(itr.hasNext())
               {
                    Employee temp=(Employee)itr.next();
                    System.out.println(temp);
               }
              
               fis.close();
               ois.close();
	  }
          catch(FileNotFoundException e)
          {
              System.out.println(e);
          }
           catch(ClassNotFoundException e)
          {
              System.out.println(e);
          }
          catch(IOException e)
          {
              System.out.println(e);
          }
    }//end of the method
    
}

class Employee implements Serializable
{
    int empId,age;
    String name;
    Double salary;
    public Employee(int id,String name,int age,Double sal)
    {
         empId=id;
         this.name=name;
         this.age=age;
         salary=sal;
    }
    @Override
    public String toString()
    {
       return empId+"\t\t"+name+"\t\t"+age+"\t\t"+salary;
    }

}
