package stringsPrograms;

public class RemoveJunkInString {

	public static void main(String[] args) {

		String s="Hell@#o Neth^&ra va&th*i";
		
		System.out.println("The original string before removing junk:" +s);
		
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After removing junk:" +s1);
	}

}
