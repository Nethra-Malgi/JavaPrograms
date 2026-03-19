package oops_MethodsAndConstructors;

public class ConstructorDemo {
	
	int a,b;
	
	ConstructorDemo()  //default constructor
	{
		a=90;
	    b=80;
	}
	
	ConstructorDemo(int x,int y)  //parameterized con
	{
		a=x;
		b=y;
	}
	
    void multiplication()
	{
		System.out.println(a*b);
	}
	

	public static void main(String[] args) {

		
		//calling the default cons
		
		//ConstructorDemo cd=new ConstructorDemo();  //calling default
		
		ConstructorDemo cd=new ConstructorDemo(10,20); //calling parameterized
		cd.multiplication();
	}

}
