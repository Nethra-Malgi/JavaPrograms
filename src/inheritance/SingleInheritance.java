package inheritance;

//single level inheritance
//one parent and one child

class X
{
	void display(int a)
	{
		System.out.println("the value of a is:" +a);
	}
}

class Y extends X
{
	void print(int b)
	{
		System.out.println("the value of b is:" +b);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {

		
		Y obj=new Y();
		obj.display(23);
		obj.print(12);
	}

}
