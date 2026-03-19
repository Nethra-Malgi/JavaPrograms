package programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		//1.data is stored in the key-value pairs
		//2.key should be unique and values can also be duplicate
		//3. insertion order is not allowed
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//integer:-key
		//string:-value
		//these wrapper classes need to explicitly specify
		
		//adding data to the hashmap
		map.put(101, "Nethra");
		map.put(102, "Neha");
		map.put(103, "Nayana");
		map.put(104, "Naga");
		map.put(101, "Raja");
		
		System.out.println(map);
		int size=map.size();
		System.out.println(size);
		
		//retriving the key value from the data
     Set<Integer> keys=map.keySet();
     System.out.println(keys);
    Collection<String> values= map.values();
    System.out.println(values);
    
    //printing both keys and values
    System.out.println(map.entrySet());
    
    //removing one pair
    map.remove(101);
    System.out.println("After removing one pair:" +map);
	
    //getting specific value by using key
    System.out.println(map.get(103));
    
    //reading all the pairs
    //1.using enhanced for loop
    /*
    for(int x:map.keySet())
    {
    	System.out.println(x+ "  " +map.get(x));
    }
	*/
    
    //using iterator
    
    Iterator <Entry <Integer, String>> data=map.entrySet().iterator();
    
    while(data.hasNext())
    {
    	Entry<Integer,String> finalData=data.next();
    	System.out.println(finalData.getKey()+ "  " +finalData.getValue());
    }
		
    
    //clearing all the data from map
    map.clear();
    map.isEmpty();
	}

}
