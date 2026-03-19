package stringsPrograms;

import java.util.HashMap;

public class OccurenceOfCharactersInString {

	public static void main(String[] args) {
		
		
		String str="automation";
		char[] occurence=str.toCharArray();
		int count=0;
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				if(occurence[i]==occurence[j])
				{
					count++;
				}
				
			}
			map.put(occurence[i], count);
			
		}
		
		System.out.println(map);
	}

}
