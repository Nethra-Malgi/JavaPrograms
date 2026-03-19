package stringsPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateCharactersInString {

	public static void main(String[] args) {
		
		String s="hagarilingappa"; 
		String res=" ";
		char[] character=s.toCharArray();
		
		Set<Character> store=new HashSet<Character>();
		for(char ch:character)
		{
			if(store.add(ch)==false)
			{
				res=res+ch+" ";
			}
				
		}
		
		System.out.println("duplicate characters in a string is:" +res.trim());
		
		
			}

      }
