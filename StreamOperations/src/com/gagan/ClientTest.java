package com.gagan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	
	public static void main(String[] args) {
		
		List<String> list =  new ArrayList<>();
		list.add("Gagan");
		list.add("Daya");
		list.add("Susheel");
		
		Stream<String> stream = list.stream();
		//long count2 = stream.count();
		/*Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();*/
		long count = stream.count();
		System.out.println(count);
		
		boolean anyMatch = list.stream().anyMatch(s -> s.contains("ga"));
		System.out.println(anyMatch);
		
	}

}
