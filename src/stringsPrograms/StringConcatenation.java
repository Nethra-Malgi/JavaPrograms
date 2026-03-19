package stringsPrograms;

public class StringConcatenation {

	public static void main(String[] args) {

		
		String a="heelo";
		String b="world";
		String c=a+b;
		System.out.println(c);
		//final result will be stored in the heap memory
		//concatenation is taking place at the run time not the compile time
		//here internally stringbuilder is working to join the strings
		
		String d="welcome"+"all";
		System.out.println(d);
		//result is stored in the string constant pool
		//concatention at the compile time but not the run time
		//stringbuilder is not working here bec already values of the string declared
		
		String e="age"+20; //20 will be converted to string internally by string builder and stored in heap memory
		System.out.println(e);
		
		String s1="age"+10+10;
		String s2=10+10+"age";
		String s3="age"+(10+10);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		//diff b/w valueOf() and toString() methods:-
		Integer x=null;
		System.out.println(String.valueOf(x)); //null-->safer option to use bec it will not crash 
		System.out.println(x.toString()); //null pointer exception
		
		
	}

}
