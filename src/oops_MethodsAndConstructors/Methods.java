package oops_MethodsAndConstructors;

public class Methods {
	
	//1.no parameters and no return value
	 
	void employee()
	{
		System.out.println("employee is onboarded...");
	}

	//2.Parameters and no return value
	
   void	employeeData(int empid, String empName)
	{
		System.out.println(empid+" " +empName);
	}
   
   //3. No parameters and return value
   
  String employee1()
   {
	   return ("employee 1....");
   }
  
   //4. Parameters and return value
  
   String employee2(String des)
   {
	   return ("enter the disignation:" +des);
   }
}
