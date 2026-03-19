package stringsPrograms;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		String sentence="Selenium with java";
		String[] words=sentence.split(" ");
		String res=" ";
		
		for(String word:words)
		{
			String revWord=" ";
			for(int i=word.length()-1;i>=0;i--)
			{
				revWord=revWord+word.charAt(i);
			}
			res=res+revWord;

		}
		System.out.println(res.trim());

	}

}
