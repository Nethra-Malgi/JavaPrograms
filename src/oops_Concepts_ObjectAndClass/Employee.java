package oops_Concepts_ObjectAndClass;

public class Employee {
	
	int empid;
	String empName;
	double sal;
	String designation;
	
	void employeeDetails()
	{
		System.out.println(empid+" "+empName+" "+sal+" "+designation);
	}

	public static void main(String[] args) {

		
		Employee emp1 = new Employee();
		emp1.empid=100;
		emp1.empName="Gate";
		emp1.sal=12399.987;
		emp1.designation="Manager";
		
		emp1.employeeDetails();
	}

}
