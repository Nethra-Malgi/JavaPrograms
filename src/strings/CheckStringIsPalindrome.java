package strings;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {
		
		//checking the string is palindrome or not
		
		String s="madam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is not palindrome");
		}
	}

}
