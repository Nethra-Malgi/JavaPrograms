package accessModifiers;

public class Test1 {
	//1.private:-it is accessible only within the class
//	private int x=300;
//	private void m1()
//	{
//		System.out.println("this is method1");
//	}
	
	//2.default:-accessible only within the package
	
//     int x=300;
//	 void m1()
//	{
//		System.out.println("this is method1");
//	}
	 
	 //3.protected:-it can accessible only through inheritance if it is in another package
	//in the same package it is accessible
//	protected int x=300;
//	protected void m1()
//	{
//		System.out.println("this is method1");
//	}
	
	//4.public:-accessible from anywhere from the project
	int x=400;
	 public void m1()
	{
		System.out.println("this is method1");
	}

}
