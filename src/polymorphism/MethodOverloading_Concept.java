package polymorphism;

public class MethodOverloading_Concept {

	
	//rules of method overloading
	//1. methods names should be same.
	//2.number of parameters should be different
	//3.data type of the parameters should be different
	//4.order of the parameters should be different
	
	int a=12,b=10;
	void multiplication()  //no parameters
	{
		System.out.println(a*b);
	}
	
	void multiplication(int x,int y) //taking 2 int para
	{
		System.out.println(x*y);
	}
	
	void multiplication(int x,double y) //taking one int and one double
	{
		System.out.println(x*y);
	}
	
	void multiplication(double x, int y) //order of para
	{
		System.out.println(x*y);
	}
	
	void multiplication(int x, int y, double z) //datatype and order of para
	{
		System.out.println((x*y)*z);
	}
}
