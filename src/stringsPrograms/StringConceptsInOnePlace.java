package stringsPrograms;

public class StringConceptsInOnePlace {

	public static void main(String[] args) {
		
		//1,use of trim() method:-->this method will remove the spaces from front and back
		//not remove the space in between
		
//		String s1="  hello";
//		String s2="hello ";
//		String s3=" hello ";
//		String s4="he llo";
//		System.out.println(s1.trim());
//		System.out.println(s2.trim());
//		System.out.println(s3.trim());
//		System.out.println(s4.trim());

		//2. equals() and ==
		//equals()--->will compare the values of the string
		//== --> will compare the address(variables) of the strings
//		String s1="hello";
//		String s2="hello";
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));//both values of s1 and s2 are stored on the string constant pool
		//and both of then pointing towards the same value
		
//		String s3=new String("welcome");
//		String s4=new String("welcome");
//		System.out.println(s3==s4); //false
//		System.out.println(s3.equals(s4));//true
//		//here both objects strored in the heap memory and both are pointing to the same value in the scp.
//		//here new keyword is used and values are stored in the heap memory also
//		
//		String s5="scott";
//		String s6=new String("scott");
//		System.out.println(s5==s6); //false
//		System.out.println(s5.equals(s6));  //true
//			

//		String s1="welcome";
//		s1.concat("hello"); //immutable
//		
//		StringBuilder sb=new StringBuilder("welcome");
//		sb.append("hello"); //mutable
//		
//		StringBuffer sf=new StringBuffer("welcome");
//		sf.append("hello"); //mutable
//		
//		System.out.println(s1);
//		System.out.println(sb);
//		System.out.println(sf);

//		String s1="heelo";
//		s1=s1.concat("world");
//		System.out.println(s1);
		
//		String a=new String("dav");
//		a=null;
//		System.out.println(a);//null
//		
//		//null pointer exception
//		String b="good";
//		b=null;
//		b.concat("things");
//		System.out.println(b);

		String s1=new String("nethra");
		String s2=new String("nethra");
		System.out.println(s1.equals(s2)); //true
		
		StringBuilder sb1=new StringBuilder("nethra");
		StringBuilder sb2=new StringBuilder("nethra");
		System.out.println(sb1.equals(sb2)); //false
		
		StringBuffer sf1=new StringBuffer("nethra");
		StringBuffer sf2=new StringBuffer("nethra");
		System.out.println(sf1.equals(sf2)); //false


	}

}
