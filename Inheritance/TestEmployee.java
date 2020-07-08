import PerEmp.Employee;
public class TestEmployee
{

  public static void main(String[] args)
  {
     Employee e=new Employee();
     e.setName("Gourav");
     e.setSalary(2536.6);
     e.setYear(1998);
     e.setInsNo("654613");
     System.out.println(e.getName()+"   "+e.getSalary()+"    "+e.getYear()+"     "+e.getInsNo());  
  }
}