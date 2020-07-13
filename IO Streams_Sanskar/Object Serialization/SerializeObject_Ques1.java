import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializeObject_Ques1
{
   FileOutputStream fos=null;
   FileInputStream fis=null;
   public static void main(String[] args)
   {
       Employee s1=new Employee("Gourav","CSE","Assistant Professor",30000);
       SerializeObject_Ques1 sobj=new SerializeObject_Ques1();
       sobj.writeTheObject(s1);
       sobj.readTheObject();
        
   }

    public void writeTheObject(Employee s)
    {
          try
          {
               fos=new FileOutputStream("data.txt");
               ObjectOutputStream oos =new ObjectOutputStream(fos);
               oos.writeObject(s);
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

    public void readTheObject()
    {
         try
          {
               fis=new FileInputStream("data.txt");
               ObjectInputStream ois =new ObjectInputStream(fis);
               Employee s1=(Employee)ois.readObject();
               System.out.println(s1);
              
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
    }
    
}

class Employee implements Serializable
{
    String name;
    String dept,desg;
    int sal;
    public Employee(String name,String dept,String desg,int sal)
    {
         this.name=name;
         this.dept=dept;
         this.desg=desg;
         this.sal=sal;
    }
    @Override
    public String toString()
    {
       return "Name : "+name+"\nDepartment : "+dept+"\nDesignation : "+desg+"\nSalary : "+sal;
    }

}