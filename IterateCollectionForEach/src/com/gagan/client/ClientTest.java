package com.gagan.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.gagan.model.Student;

public class ClientTest {
	
	public static void main(String[] args) {
		
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("Gagan", 21));
		stuList.add(new Student("Susheel", 22));
		stuList.add(new Student("Daya", 21));
		stuList.add(new Student("Naveen", 22));
		
		stuList.forEach(System.out::println);

	}

}

class MyConsumer implements Consumer<Student> {

	@Override
	public void accept(Student t) {

		System.out.println(t);
	}
	
	
}