package strings;

import java.util.Arrays;

public class MutableVSImmutable {

	public static void main(String[] args) {
		
		//string is immutable:-once objject is created we cannot change the originl string
		//string bffer and string builder are mutable:---we can change the original string 
		//mutable--we can change
		
		int a[]= {10,30,40,20};
		
       //to print array elements convert array to string
		System.out.println("before sorting:" +Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting:" +Arrays.toString(a));
		
		//immutable---we cannot change the original value of the string
		
		String s = new String("selenium");
		s.concat("java");
		System.out.println(s); 
		
		//mutable
		StringBuilder sb=new StringBuilder("welcome");
		sb.append("girls");
		System.out.println(sb);
		
		//mutable
		StringBuffer sf = new StringBuffer("hello");
		sf.append("all");
		System.out.println(sf);
		
		
	}

}
