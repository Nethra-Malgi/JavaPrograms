package day_Jan_28;

import java.util.Arrays;

public class AnagramCheckInStrings {

	public static void main(String[] args) {

		
		String s1="listen";
		String s2="silent";
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		System.out.println(a1.equals(a2));
			}

}
