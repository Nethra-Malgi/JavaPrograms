package stringsPrograms;

public class ReverseOfString {

	public static void main(String[] args) {
		
		/*
		 * String s1="Hagarilingappa kyadigal"; String[ ] s2=s1.split(" "); for(int
		 * i=s2.length-1;i>=0;i--) {
		 * 
		 * System.out.print(s2[i] +"");
		 * 
		 * }
		 * 
		 */	
		
		
		/*
		 * String s="Automation engineer in cognizant and manual engineer"; String[
		 * ]s1=s.split(" "); for(int i=s1.length-1;i>=0;i--) {
		 * System.out.print(s1[i]+""); }
		 * 
		 */	

		
		/*
		 * String s="hagarilingappa"; for(int i=s.length()-1;i>=0;i--) {
		 * System.out.print(s.charAt(i)); }
		 */		
		
//		String s1="KYADIGAL";
//		//StringBuilder str=new StringBuilder(s1);
//		StringBuffer str=new StringBuffer(s1);
//		System.out.println(str.reverse());
		
		//using string buffer
//		StringBuffer str=new StringBuffer("New");
//		StringBuffer rev1=str.reverse();
//		System.out.println(rev1);
		
		//using charArray
//				String s="Thajmahal";
//		System.out.println("the original string is:" +s);
//		String rev="";
//		char[] s1=s.toCharArray();
//		for(int i=s1.length-1;i>=0;i--)
//		{
//			rev=rev+s1[i];
//		    continue;
//		}
//		
//		System.out.println("The reversed string is:" +rev);
//		
//		
//		String s2="Hospete";
//		String rev1="";
//        for(int i=s2.length()-1;i>=0;i--)
//		{
//			rev=rev+s2.charAt(i);
//					}
//		
//		System.out.println(rev);
		
//		String s="Automation @gmail";
//		String s1=s.replaceAll(" ", "").replaceAll("@", "").toString();	
//		System.out.println(s1);
//		String rev="";
//		for(int i=s1.length()-1;i>=0;i--)
//		{ 
//			rev=rev+s1.charAt(i);
//			
//		}
//		System.out.println(rev);
//		
		
		String s="nethra @gmail.com";
		String s1=s.replaceAll(" ", "").replaceAll("@", "").toString();
		String s2=s1.replace(".", "");
		System.out.println("before reverse:" +s2);
		
		String rev="";
		for(int i=s2.length()-1;i>=0;i--)
		{
			rev=rev+s2.charAt(i);
		}
		
		System.out.println("after reverse:" +rev);

		
	
	}

}
