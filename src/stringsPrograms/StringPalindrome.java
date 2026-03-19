package stringsPrograms;

public class StringPalindrome {

	public static void main(String[] args) {

		//bob,level,civic,dad,madam
		
		String s="level";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
			}

}
