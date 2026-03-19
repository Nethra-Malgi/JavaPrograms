package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String s="Selenium";
		
		//approach 1:-
		//using string builder
		/*StringBuilder rev = new StringBuilder(s);
		String rev1=rev.reverse().toString();
		System.out.println(rev1);
		*/
		
		//approach 2:-
		//using for loop
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//approach 2:-converting string to charArray
		
		String s1="Cognizant";
		String rev1="";
		char a[]=s1.toCharArray();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev1=rev1+a[i];
			
		}
		System.out.println(rev1);
		
		//approach 3:-using string buffer
		//same method is available in this class also
		StringBuffer s2 = new StringBuffer("Nethravathi");
		StringBuffer reverse=s2.reverse();
		System.out.println(reverse);
	}

}
