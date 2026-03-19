package arrays;

import java.util.HashMap;

public class OccurenceOfNumbersInArray {

	public static void main(String[] args) {

		
		int[] num= {1,2,2,3,4,4};
		int count=0;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<num.length;i++)
		{
			count=0;
			for(int j=0;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					count++;
				}
			}
			map.put(num[i], count);
		}
		
		System.out.println(map);
	}

}
