package dataAbstraction;


interface Shape
{
	void circle();
	
	default void rectangle()
	{
		System.out.println("this is the rectangle shape");
	}
	
	static void square()
	{
		System.out.println("this is square shape");
		
	}
}

public  class InterfaceDemo implements Shape{
	
	public void circle()
	{
		System.out.println("this is circle");
	}
	
	public void triangle()
	{
		System.out.println("this is tringle shape...");
	}

	public static void main(String[] args) {
		//scenario 1
		InterfaceDemo id=new InterfaceDemo();
		id.rectangle();
		id.circle();
		id.triangle(); //this is created directly inside the class so it is accessible
		
		Shape.square(); //static method(can directly access from the interface)
		
		//scenario 2
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.rectangle();
		Shape.square();
		//sh.triangle(); //this is not possible bec this method is not created in the interface

	}

}
