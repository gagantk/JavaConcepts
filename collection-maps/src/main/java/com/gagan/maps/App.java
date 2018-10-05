package com.gagan.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    
	
	
	public static void main( String[] args )
    {
        
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(7, "Gagan");
		hashMap.put(8, "Susheel");
		hashMap.put(9, "Daya");
		hashMap.put(10, "Soumya");
		hashMap.put(11, "Akshatha");
		
		System.out.println("Value of Key '7': " + hashMap.get(7));
		System.out.println("*********************************");
		
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		System.out.println("*********************************");
		System.out.println("Size of HashMap: " + hashMap.size());
		System.out.println("*********************************");
		hashMap.clear();
		for(String index:hashMap.values()) {
			System.out.println(index);
		}
		System.out.println("*********************************");
		hashMap.put(7, "Gagan");
		hashMap.put(8, "Susheel");
		hashMap.put(9, "Daya");
		hashMap.put(10, "Soumya");
		hashMap.put(11, "Akshatha");
		for(String index:hashMap.values()) {
			System.out.println(index);
		}
		System.out.println("*********************************");
		for(int index:hashMap.keySet()) {
			System.out.println(index);
		}
		System.out.println("*********************************");
		for(String index:hashMap.values()) {
			System.out.println(index);
		}
		System.out.println("*********************************");
		ArrayList<Integer> sortedKeys = new ArrayList<Integer>(hashMap.keySet());
		Collections.sort(sortedKeys);
		Collections.reverse(sortedKeys);
		for(int index: sortedKeys) {
			System.out.println("Key: " + index + ", Value: " + hashMap.get(index));
		}
		System.out.println("*********************************");
		ArrayList<String> sortedValues = new ArrayList<String>(hashMap.values());
		Collections.sort(sortedValues);
		Collections.reverse(sortedValues);
		for(String index: sortedValues) {
			System.out.println("Key: " + hashMap.keySet() + ", Value: " + index);
		}
    }
}
