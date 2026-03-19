package stringsPrograms;

public class CountVowelsConsonants {

	public static void main(String[] args) {

		//counting vowels,consonants, digits and spaces
		
		String s="automation 123 ";
		s=s.toLowerCase();
		int vowels=0,consonants=0,digits=0,spaces=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(c>='0'&&c<='9')
			{
				digits++;
			}
			else if(c==' ')
			{
				spaces++;
			}
			
		}
		System.out.println("vowels are: " +vowels);
		System.out.println("consonants are: " +consonants);
		System.out.println("digits are: " +digits);
		System.out.println("spaces are: " +spaces);

		
		
	}

}
