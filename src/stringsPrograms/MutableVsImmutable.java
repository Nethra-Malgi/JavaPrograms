package stringsPrograms;

public class MutableVsImmutable {

	public static void main(String[] args) {

		//string is immutable class---->cannot be changed
		//String s= "welcome";
		String s1=new String("welcome");
		s1.concat("hello");
		System.out.println(s1);
		
		//mutable--->string builder and string buffer
		//useful for single threading and fast
		StringBuilder sb=new StringBuilder("welcome");
		sb.append("hello");
		System.out.println(sb);
		
		//mutable--->string buffer---->useful for multiple threading and slow
		StringBuffer sf=new StringBuffer("beautiful");
		sf.append("world");
		System.out.println(sf);
		
		
		
	}

}
