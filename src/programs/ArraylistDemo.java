package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
         
		//1. heterogenous data is allowed
		//2. insertion order is preserved
		//3. duplicate values are allowed
		//4. multiple null values are allowed
		
		ArrayList list = new ArrayList();
		
		//List<Integer> list = new ArrayList<Integer>();//declaring only homogenous data then use wrapper class
		
		//adding the values into the arraylist
		list.add(200);
		list.add("Nethravathi");
		list.add('N');
		list.add(20.23);
		list.add(true);
		list.add(200);
		list.add(null);
		list.add(null);
		
		//printing the size of an arraylist
		int arraySize=list.size();
		System.out.println("the size of the arraylist is: " +arraySize);
		
		//printing all the values from the arraylist
		System.out.println(list);
		
		//removing particular value from the arraylist
		list.remove(5);
		System.out.println("After removing duplicate value:" +list);
		
		//insering new value in between 2 values in the arraylist
		list.add(1, "Selenium");  //add is another method to insert new value
		System.out.println("After adding new value:" +list);
		
		//replacing old value with new value
		list.set(6, "Java");
		System.out.println("replacing new value:" +list);
		
		//reading the particular value from the arraylist
		Object read=list.get(2);
		System.out.println(read);
		
		//reading all the values one by one
		//1. using normal for loop
		/*for(int i=0;i<list.size();i++)
		{
			Object allVal=list.get(i);
			System.out.println(allVal);
		}
		*/
		
		//2.using enhanced for loop
		/*
		for(Object x:list)
		{
			System.out.println(x);
		}
		*/
		
		//3.using iterator
		Iterator myit=list.iterator();
		//whenever we are using the iterator we will use while() loop to check the data exist or not in the arraylist
		
		while(myit.hasNext())
		{
			//hasNext() method will check the values are present or not in the array
			//once elements are present then next() method will retrieve those elements form the arraylist
			System.out.println(myit.next());
		}
		
		//checking the arraylist is empty or not
		boolean check=list.isEmpty();
		System.out.println("is array is empty? :" +check);
		
		//removing random elements from the array:---
		//we need to create separate object of the arraylist
		//then what are the elements we need to removed then we can add those in the arraylist
		//removeAll():--->this method is used to remove the specific elements
		//clear()--->it will remove all the elements from the arrayslist
		//remove()--->it will remove only single element from the array based on the index value
		
		ArrayList list2=new ArrayList();
		list2.add(200);
		list2.add('N');
		list.removeAll(list2);
		
		//System.out.println("After removing specific elements:" +list);

		for(Object y:list)
		{
			System.out.println(y);

		}
	}

}
