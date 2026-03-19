package strings;

public class StringsComparison {

	public static void main(String[] args) {
		
		
		//case 1:-comparing 2 normal strings
		//== it will compare the objects of the strings
		//equals()--it will compare the values of the objects
		
		String s1="hello";
		String s2="hello";
		//in normal string it will only comparing the values
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		//case 2:-creating 2 strings using new keyword
		
		String s3=new String("dream");
		String s4=new String("dream");
		System.out.println(s3==s4); //false-comparing the objects are different
		System.out.println(s3.equals(s4)); //true--values are same
		
		//case 3:-creating normal string and new keyword string
		String s5="java";
		String s6=new String("java");
		System.out.println(s5==s6); //false
		System.out.println(s5.equals(s6)); //true
		
		//case 4:-creating 3rd variable
		String s7=new String("ring");
		String s8=new String("ring");
		String s9=s7;
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8)); //true
		
		System.out.println(s7==s9); //true
		System.out.println(s8.equals(s9)); //true
	}

}
