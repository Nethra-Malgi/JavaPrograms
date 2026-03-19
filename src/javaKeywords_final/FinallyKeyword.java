package javaKeywords_final;

public class FinallyKeyword {

	public static void main(String[] args) {

		
		String s="nethra";
		s=null;
		
		try {
			s.concat("vathi");
			System.out.println(s);
		}
		catch(Exception e)
		{
		  System.out.println(e.getMessage());
		}
		finally {
			System.out.println("exception is handled");
		}
	}

}
