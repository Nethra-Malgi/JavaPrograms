package stringsPrograms;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		String s="Selenium";
		s=s.toLowerCase();
		
		int vowels=0, cons=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			if(c>='a' && c<='z')
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
				vowels++;
				}
				
				else
				{
					cons++;
				}

			}
					}
		
		System.out.println("number of vowels are:" +vowels);
		System.out.println("number of consonants are:" +cons);


	}

}
