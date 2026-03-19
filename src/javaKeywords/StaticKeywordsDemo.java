package javaKeywords;

public class StaticKeywordsDemo {
	
	static int a;
	
	int x=8;
	
	static void method1(int x)
	{
		a=x;
		System.out.println(a);
		System.out.println("this is static method");
	}
	
	private void method2()
	{
		System.out.println("this is non-static method");
	}  
	
	 void method2(int s)
	{
		System.out.println("this is non-static method");
	}  
	
	
	void method3() //non static method
	{
		System.out.println(a);
		System.out.println(x);
		//method1();
		method2();
	}
 
	public static void main(String[] args) {
		
		//System.out.println(a);
		method1(12);  //these are static directly access
		
		/*StaticKeywordsDemo sd=new StaticKeywordsDemo();
		System.out.println(sd.x); //non static create the object to access
		sd.method2();
		
		sd.method3(); //non static method can access everything(static and non static)
		
*/
	}

}
