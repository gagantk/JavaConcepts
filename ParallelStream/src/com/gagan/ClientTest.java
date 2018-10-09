package com.gagan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("Gagan", 21));
		list.add(new Student("Susheel", 22));
		list.add(new Student("Daya", 21));
		
		Stream<Student> parallelStream = list.parallelStream();
		
		parallelStream.forEach(System.out::println);
	}

}
