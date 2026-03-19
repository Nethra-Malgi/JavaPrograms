package stringsPrograms;

import java.util.Scanner;

public class CountCharactersInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string:");
		String s1=sc.next();
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			count++;

	}
		System.out.println("the number of characters in the given string is:" +count);

	}

}
