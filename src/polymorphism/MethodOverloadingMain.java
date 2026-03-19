package polymorphism;

public class MethodOverloadingMain {

	public static void main(String[] args) {

		
		MethodOverloading_Concept mo=new MethodOverloading_Concept();
		mo.multiplication(); //120
		
		mo.multiplication(10, 20); //200
		
		mo.multiplication(10, 12.2); //122.0
		
		mo.multiplication(12.1, 10); //121.0
		
		mo.multiplication(10, 11, 12.3); //1353.0
	}

}
