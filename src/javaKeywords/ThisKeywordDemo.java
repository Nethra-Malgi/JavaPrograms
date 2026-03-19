package javaKeywords;

  

public class ThisKeywordDemo {
	
	//class variables
	int a,b;
	
	//creating the constructor for assigning data
	
/*	ThisKeywordDemo(int x,int y) //normal cons bec took diff variables
	{
		a=x;
		b=y;
	}*/
	
	//taking same class variables inside the constructor
	
/*	ThisKeywordDemo(int a,int b)
	{
		this.a=a; //this keyword is used to diff between class and local variable
		this.b=b;
	}
	*/
	
/*	void setData(int x, int y)
	{
		a=x;
		b=y;
	}
	*/
	void setData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		System.out.println(a+ " "  +b);
	}
	

	public static void main(String[] args) {
		
		
		//ThisKeywordDemo td=new ThisKeywordDemo(12,11);
		
		ThisKeywordDemo td=new ThisKeywordDemo();
		td.setData(11,12);
		td.display();
		
		

	}

}
