package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraylistToSet {

	public static void main(String[] args) {
		
		
		//converting arraylist to set for removing the duplicate values from array
		
		//declaration of arraylist
		ArrayList mylist=new ArrayList<>();
		
		//adding elements to the array
		mylist.add(100);
		mylist.add(10.90);
		mylist.add("nethra");
		mylist.add(null);
		mylist.add(true);
		mylist.add(100);
		
		//printing all the elements
		System.out.println("before convertion:" +mylist);
		
		//convert to set
		//declaring the set
		Set myset=new HashSet(mylist);
		
		//removing duplicate values from arraylist
		System.out.println("after conversion:" +myset);
		
		//reading all the values one by one using for loop
		//and iterator
		
		/*for(Object set:myset)
		{
			System.out.println(set);
		}
		*/
		
		Iterator set1=myset.iterator();
		while(set1.hasNext())
		{
			System.out.println(set1.next());
		}
	}

}
