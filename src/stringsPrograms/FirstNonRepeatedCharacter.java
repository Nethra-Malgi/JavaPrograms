package stringsPrograms;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
	
		String s="nethra";
		
		int count=0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			
//			if(s.indexOf(c)==s.lastIndexOf(c))
//			{
//				System.out.println("repeated cha is:" +c);
//				break;
//			
//			}
//	
//		}
		
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println("total characters are:" +count);

	}

}
