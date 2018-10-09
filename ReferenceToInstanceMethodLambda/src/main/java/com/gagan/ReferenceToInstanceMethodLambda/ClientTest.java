package com.gagan.ReferenceToInstanceMethodLambda;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Gagan");
		names.add("Susheel");
		names.add("Daya");
		names.add("Akshatha");
		names.add("Sowmya");
		
		//names.forEach(x->System.out.println(x));
		names.forEach(System.out::println);
	}

}
