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
	
		Stream<Student> filter = list.stream().filter(s -> s.getAge()>21);
		filter.forEach(System.out::println);
		
		boolean allMatch = list.stream().allMatch(s -> s.getName().contains("a"));
		System.out.println(allMatch);
		
		boolean anyMatch = list.stream().anyMatch(s -> s.getAge()>22);
		System.out.println(anyMatch);
		
		boolean noneMatch = list.stream().noneMatch(s -> s.getAge()>25);
		System.out.println(noneMatch);
		
	
	}

}
