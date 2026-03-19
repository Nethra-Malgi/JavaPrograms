package programs;

import java.util.Scanner;

public class Exceptions {
	
	static int divideByZero(int a,int b) {
		
		int num1 = 0;
		try {
			
		num1=a/b;
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			String msg=e.getMessage();
			System.out.println(msg);
		}
		finally
		{
			System.out.println("ending");
		}
		return num1;
		
	}

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		divideByZero(a, b);

	}

}
