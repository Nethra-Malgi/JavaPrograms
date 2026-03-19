package programs;

import java.util.Arrays;

public class StringsMethods {

	public static void main(String[] args) {
		
		
		String x="Automation";
		
		String y ="abccabca";
		
		//replace():-->replacing single or multiple characters in a given string
		String out=y.replace('a', 'x').replace('c', 'y');
		System.out.println(out);
		
		x="$15,20,55"; //152055
		String a=x.replace("$","");
		System.out.println(a);
		String c=a.replace(",","");
		System.out.println(c);
		
		y="xyz@gmail.com $12,34,234";  //xyzgmailcom1234234
		String g=y.replace("@","").replace(".","").replace(" ", "").replace("$", "").replace(",","");
		System.out.println(g);  //xyzgmailcom1234234
		
		//split()-->separate the string based on the delimeter
		y="nethra123@gmail.com";
		String[] mail=y.split("@");
		System.out.println(mail[1]);
		//String[] t=y.split("."); //gmail.com
		//System.out.println(t[2]);
		String[] mail1=Arrays.toString(mail).split(".");
		System.out.println(Arrays.toString(mail1));
		
		String s="Nethra malgi";
		
		//check Nethra is the part of the string or not
		boolean check=s.contains("nethra");
		System.out.println(check);
		//without using equalIngonrecase
		System.out.println(s.replace('N', 'n').contains("nethra")); //true
		boolean check1=s.toLowerCase().contains("nethra");
		System.out.println(check1);
		
		
	
		
		
		
				

	}

}
