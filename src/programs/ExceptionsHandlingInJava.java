package programs;

import java.util.Scanner;

public class ExceptionsHandlingInJava {

	public static void main(String[] args) {

		
		//unchecked excpetions:-these are not identified by the java compiler
		//these are occured after execution of the code
		//ArithmeticException, NullpPointerException, ArrayIndexOutOfBoundException
		
		//int num=10;
		//arithmatic exception
	/*	Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("enter a number:" +num);
		try {
		System.out.println(num/0);
		}
		catch(Exception e)
		{
			String msg=e.getMessage();
		    e.printStackTrace();
			System.out.println(msg);
		}
		finally
		{
			System.out.println("ending...");
		}
		*/
		
		//ArrayIndexOutOfBoundsException
		
	/*	int a[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter the position of number:");
		int pos=sc.nextInt();
		System.out.println("enter the value of that position:");
		int val=sc.nextInt();
		a[pos]=val;
		System.out.println(a[pos]);
		}
		catch(Exception e)
		{
			String msg=e.getMessage();
			System.out.println(msg);
			e.printStackTrace();
		}
		System.out.println("program is ended...");
		*/
		
		//NumberFormatException
		
		String s="welcome";
		try {
		int val=Integer.parseInt(s);
		System.out.println(val);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally will always be executed...");
		}
		System.out.println("program is ended");
		
		//NullPointerException
		//when we perform actions on the null variable then we get this exception
		String f=null;
		
		System.out.println(f.length()); //we cannot perform the actions using string methods
		//for the null variable
		
	}

}
