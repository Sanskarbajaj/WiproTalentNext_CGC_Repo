package MiniProjectJavaFundamentals;
public class Employee {
	
	private int empNo;
	private String empName;
	private String Department;
	private String Designation;
	private long salary;
	private long basic;
	private long hra;
	private long it;
	public Employee(int empNo, String empName, String department, String designation, long basic, long hra, long it) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		Department = department;
		Designation = designation;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getBasic() {
		return basic;
	}
	public void setBasic(long basic) {
		this.basic = basic;
	}
	public long getHra() {
		return hra;
	}
	public void setHra(long hra) {
		this.hra = hra;
	}
	public long getIt() {
		return it;
	}
	public void setIt(long it) {
		this.it = it;
	}
	
	
}
