public class ObjectClone_Ques4
{

  public static void main(String[] args)
  {
     Employee e1=new Employee("Shahin",20);
     System.out.println(e1);
     try
     {
     Employee e2=(Employee)e1.clone();
     e2.name="Sachin";
     System.out.println(e2);

     }
     catch(CloneNotSupportedException e)
     {
           System.out.println(e);
     }
  }
}

class Employee implements Cloneable
{
   String name;
   int age;
   public Employee(String name,int age)
   {
       this.name=name;
       this.age=age;
   }

   public Object clone() throws CloneNotSupportedException
   {
      return super.clone();
   }

   @Override
   public String toString()
   {
         return "Name : "+name+"\nAge : "+age;
   }
}