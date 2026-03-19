package javaKeywords;

public class StaticMain {

	public static void main(String[] args) {
		
  //static variables and methods not directly accessible in different class
		//explicitly mention the class name
		System.out.println(StaticKeywordsDemo.a);
		StaticKeywordsDemo.method1(1);  //these are static directly access
		
		//non-static will be accessible in any class
		StaticKeywordsDemo sd=new StaticKeywordsDemo();
		System.out.println(sd.x); //non static create the object to access
		//sd.method2();
		
		sd.method3();
	}

}
