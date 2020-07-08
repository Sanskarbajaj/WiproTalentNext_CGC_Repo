package MiniProjectJavaFundamentals;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StarterClass extends EmployeeStaticDatabase {

	public static void main(String[] args) {
	HashMap<Integer,Employee> hm=new HashMap<Integer, Employee>();
	hm.put(1001, e1);
	hm.put(1002, e2);
	hm.put(1003, e3);
	hm.put(1004, e4);
	hm.put(1005, e5);
	hm.put(1006, e6);
	hm.put(1007, e7);
	System.out.println("Enter Employee id");
	Scanner s=new Scanner(System.in);
	int id=s.nextInt();
	s.close();
	if(hm.containsKey(id))
	{
		for(Map.Entry<Integer,Employee>e:hm.entrySet())
		{
			if(e.getValue().getEmpNo()==id)
			{
				long basic,hra,it;
				hra=e.getValue().getHra();
				it=e.getValue().getIt();
				basic=e.getValue().getBasic();
				long da=calcsalary(e.getValue().getDesignation());
				long fnlSalary=basic+hra+da-it;
				System.out.println("EmpNo "+id+" EmpName "+e.getValue().getEmpName()+" Dept "+e.getValue().getDepartment()+" Designation "+calcDesg(e.getValue().getDesignation())+" Salary "+ fnlSalary);
			}
		}
	}
	else
	{
		System.out.println("There's No Employee with this id"+ id);
	}
	}
	public static long calcsalary(String str)
	{
		if(str.charAt(0)=='e')
			return 20000;
		if(str.charAt(0)=='c')
			return 32000;
		if(str.charAt(0)=='k')
			return 12000;
		if(str.charAt(0)=='r')
			return 15000;
		
			return 40000;
	}
	public static String calcDesg(String str)
	{
		if(str.charAt(0)=='e')
			return "Engineer";
		if(str.charAt(0)=='c')
			return "Cpnsultant";
		if(str.charAt(0)=='k')
			return "Clerk";
		if(str.charAt(0)=='r')
			return "Receptionist";
		
			return "Manager";
	}
}
