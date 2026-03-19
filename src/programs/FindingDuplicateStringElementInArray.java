package programs;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateStringElementInArray {

	public static void main(String[] args) {
		
		//time complexity is o(n2)
		String[] s= {"Nethra","Hagari","Hagari"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println("duplicate element is:" +s[i]);
				}
			}
		}
		
		//solution 2:-using set:-time complexity is O(n)
		Set<String> store=new HashSet<String>();
		for(String s1:s)
		{
			if(store.add(s1)==false)
			{
				System.out.println("duplicate is:" +s1);
			}
		}

	}

}
