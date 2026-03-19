package day_Jan_28;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

		//String s="automation";
		
//		char[] dup=s.toCharArray();
//		
//		Set<String> store=new HashSet<>();
//		
//		for(char ch:dup)
//		{
//			if(store.add(s))
//			{
//				System.out.println("duplicate is:" +ch);
//			}
//		}
		
//      int count=0;
//        char[] cha=s.toCharArray();
//        
//      Map<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<s.length();i++)
//        {
//            count=0;
//            for(int j=0;j<s.length();j++)
//            {
//                if(cha[i]==cha[j])
//                {
//                    count++;
//                }
//            }
//            map.put(cha[i],count);
//        }
//        System.out.println(map);
		
		String s1="java";
		String s2="selenium";

		String s3=s1+s2; //javaselenium

		s2=s1.substring(0,(s2.length()-s1.length()));
		s1=s1.substring(s2.length());
		System.out.println(s2);
		System.out.println(s1);
	}

}
