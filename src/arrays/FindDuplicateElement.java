package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,1,2,3};
		
		Set<Integer> store=new HashSet<>();
		
		for(int num:a)
		{
			if(store.add(num)==false)
			{
				System.out.println("duplicate is:" +num);
			}
		}

	}

}
