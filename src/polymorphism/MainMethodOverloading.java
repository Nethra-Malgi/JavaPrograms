package polymorphism;

public class MainMethodOverloading {
	
	void main(int x)
	{
		System.out.println(x);
	}
	
	void main()
	{
		System.out.println("hello");
	}
	
	void main(String s)
	{
		System.out.println(s);
	}
	
	void main(String s1,String s2)
	{
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {

		
		//overloading of the main method is also possible
		
		MainMethodOverloading mo=new MainMethodOverloading();
		mo.main();
		mo.main(12);
		mo.main("nethra");
		mo.main("nethra", "hagari");
		
	}

}
