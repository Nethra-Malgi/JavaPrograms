package programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		//1.Heterogenous data is allowed.
		//2.Insertion order is not followed(indexing is not applicable)
		//3.duplicate values are not allowed
		//4.multiple null values are not allowed
		//5.single null value is only allowed
		
		//it will store any kind of elements like heterogenous
		HashSet set  = new HashSet();
		
		//storing only homogenous data then specify wrapper class
		//Set<String> set = new HashSet<String> ();
		
		set.add(100);
		set.add(10.23);
		set.add("Hello");
		set.add('B');
		set.add(null);
		set.add(true);
		set.add(100);
		set.add(null);
		
		//getting the size of an set
		int sizeset=set.size();
		System.out.println("the size of the set is:" +sizeset);
		
		//printing the data
		System.out.println(set); //[null, B, 100, Hello, 10.23, true]
        
		//inserting the new value is not allowed
		//retriving/reading single element is not allowed
		
		//accessing/reading all the elements is possible
		//workaround:-convert set to arraylist
		
		ArrayList list = new ArrayList(set);

       System.out.println(list);
       
       //normal for loop is not allowed
       
       //use enhanced for loop
       /*
       for(Object x:list)
       {
    	   System.out.println(x);
       }
       */
       
       
       //using iterator 
      Iterator it= list.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
       
	}

}
