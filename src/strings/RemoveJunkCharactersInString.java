package strings;

public class RemoveJunkCharactersInString {

	public static void main(String[] args) {
		
		String s="He@ll#o! w$orld^ 123";
		
		System.out.println("original string before removing juck:" +s);
		
		String cleanedString=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("after removing junk:" +cleanedString);

	}

}
