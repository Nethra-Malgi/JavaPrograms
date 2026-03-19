package javaKeywords;

public class MainMethod {

	/*public static void main(String[] args) {
		
		//public static void main(String[] args) //valid
		System.out.println("hello....");
		}
	*/
	
   /* static public void main(String[] args) {
		
		//static public void main(String[] args) //valid
		System.out.println("hello....");
		}
*/
    
	/*public void static main(String[] args) {

		//  public void static main(String[] args) //invalid void always come infront of main
		System.out.println("hello....");
	}
	*/
	
	/*
	public static void main(int[] args) {

		//  public void static main(int[] args) //invalid bec JVM will always looks for string[] args
		System.out.println("hello....");
		}
	*/
	

	public static void main(String[] s) {

		//  public void static main(String[] s) //valid bec variable name can be anything
		//System.out.println("hello....");
		
		//finding length of args
		System.out.println(s.length);
		
		//printing args values from run configurations tab
		for(String val:s)
		{
			System.out.println(val);
		}
		}
}
