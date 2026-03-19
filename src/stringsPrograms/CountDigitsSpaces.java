package stringsPrograms;

public class CountDigitsSpaces {

	public static void main(String[] args) {
		
		String s="  selenium 123 890 ";
		
		int digits=0,spaces=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(c>='0' && c<='9')
			{
				digits++;
			}
			else if(c==' ')
			{
				spaces++;
			}
			
		}
		
		System.out.println("number of digits are:" +digits);
		System.out.println("number of spaces are:" +spaces);


	}

}
