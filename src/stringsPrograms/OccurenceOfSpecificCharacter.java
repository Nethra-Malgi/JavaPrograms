package stringsPrograms;

import java.util.Scanner;

public class OccurenceOfSpecificCharacter {

	public static void main(String[] args) {

		
		//String s="automation";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.next();
		System.out.println("enter a target character:");
		char target=sc.next().charAt(0);
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==target)
			{
				count++;
			}
		}
		System.out.println("occurence of target characters are:" +count);
	}

}
