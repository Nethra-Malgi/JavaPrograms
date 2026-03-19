package strings;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		
		
		String s="saabbc";
		
		int count=0;
		
		//convert string to arrays
		char[] arr=s.toCharArray();
		
		//to store character and count value
		//use map
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			count=0;
              for(int j=0;j<s.length();j++)
              {
            	  
            	  if(arr[i]==arr[j])
            	  {
            		  count++;
            	  }
              }
              map.put(arr[i], count);
              
             
		}
		
		 System.out.println(map);

		
		
}
}
