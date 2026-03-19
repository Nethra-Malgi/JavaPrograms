package oops_MethodsAndConstructors;

public class MethodsMain {

	public static void main(String[] args) {
		
		Methods md  = new Methods();
		md.employee(); //1
		
		md.employeeData(10, "Veera"); //2
		
		String name=md.employee1(); //3
		System.out.println(name);
		
		String desname=md.employee2("manager");  //4
		System.out.println(desname);
	}

}
