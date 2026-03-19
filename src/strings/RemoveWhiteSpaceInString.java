package strings;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		
		String s="A uto ma tion";
		
	//	System.out.println(s.length());
		//String s2=s.trim(); //it will remove only left and right spaces of the string
		String s1=s.replaceAll(" ", "");
		System.out.println(s1);
		
		

	}

}
