package strings;

import java.util.Scanner;

public class CountNumberOfCharacters {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String s=sc.next();
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		
		System.out.println("total number of charactes in a given string is: " +count);
	}

}
