package stringsPrograms;

public class ReverseOrderOfWordsInSentence {

	public static void main(String[] args) {
		
		String s="Selenium automation java";
		String[] words=s.split(" ");
		String res=" ";
		for(int i=words.length-1;i>=0;i--)
		{
			res=res+words[i]+" ";
		}
		
		
		System.out.println(res.trim());
		
	}

}
