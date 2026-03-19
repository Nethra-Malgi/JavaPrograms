package inheritance;

//multi level inheritance
class A
{
	int x;
	
	void parent(String name)
	{
		System.out.println("the name of the parent is:" +name);
	}
}

class B extends A
{
	int y;
	
	void child1(char name)
	{
		System.out.println("the first letter is:" +name);
	}
}

class C extends B
{
	int z;
	
	void child2(double d)
	{
		System.out.println("the value is:" +d);
	}
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) {

		
		//creating the object of C Class and aquiring all the properties
		
		C obj = new C();
		obj.x=12;
		obj.parent("Nethra");
		
		obj.y=23;
		obj.child1('N');
		
		obj.z=4;
		obj.child2(23.4);
	}

}
