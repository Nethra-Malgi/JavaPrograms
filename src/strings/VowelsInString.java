package strings;

import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
				
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String s=sc.next();
		int count=0;
		String s1="aeiou";
		char[] vowels=s1.toCharArray();
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++)
		{
			char let=s.charAt(i);
			for(int j=0;j<vowels.length;j++)
			{
				if(let==vowels[j])
				{
					count++;
				}
			}
			
		}
		System.out.println("total vowels in the string is:" +count);
		

	}

}
