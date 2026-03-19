package dataAbstraction;

public class C1 extends C2 implements I1,I2 {
	//exmple of hybrid inheritance
	//hybrid inheritance is possible in interface
	public void m1()
	{
		System.out.println("I am nethra");
	}
	
	public void m2()
	{
		System.out.println("I am automation engineer");
	}

	public static void main(String[] args) {
		
		C1 obj=new C1();
		obj.m1();
		obj.m2();
		C2.m3();
		obj.m4();
		

	}

}
