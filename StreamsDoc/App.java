package com.gagan.Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		// Create a list of Integer values.
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(8);
		myList.add(19);
		myList.add(11);
		myList.add(25);
		myList.add(18);
		myList.add(6);
		System.out.println("Original list: " + myList);

		// Obtain a Stream to the array list.
		Stream<Integer> myStream = myList.stream();

		// Obtain the minimum and maximum value by use of min(), max(), isPresent(), and
		// get().
		Optional<Integer> minVal = myStream.min(Integer::compare);
		if (minVal.isPresent())
			System.out.println("Minimum value: " + minVal.get());

		// IntStream
		System.out.println("IntStream Sum = " + IntStream.rangeClosed(1, 10).sum());

		// Must obtain a new stream because previous call to min() is a terminal
		// operation that consumed the stream.
		myStream = myList.stream();
		Optional<Integer> maxVal = myStream.max(Integer::compare);
		if (maxVal.isPresent())
			System.out.println("Maximum value: " + maxVal.get());

		// Sort the stream by use of sorted().
		Stream<Integer> sortedStream = myList.stream().sorted();
		// Display the sorted stream by use of forEach().
		System.out.print("Sorted stream: ");
		sortedStream.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		// Display only the odd values by use of filter().
		Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
		System.out.print("Odd values: ");
		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		// Display only the odd values that are greater than 5
		// Pipelined
		oddVals = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
		System.out.print("Odd values greater than 5: ");
		oddVals.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		// IllegalStateException
		// System.out.println(oddVals.count());

		// Two ways to obtain the integer product of the elements
		// in myList by use of reduce().
		Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
		if (productObj.isPresent())
			System.out.println("Product as Optional: " + productObj.get());
		int product = myList.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Product as int: " + product);

		int parallelProduct = myList.parallelStream().reduce(1, (a, b) -> a * b, (a, b) -> a * b);
		System.out.println("Out = " + parallelProduct);

		ArrayList<Double> myList2 = new ArrayList<>();
		myList2.add(7.0);
		myList2.add(18.0);
		myList2.add(10.0);
		myList2.add(24.0);
		myList2.add(17.0);
		myList2.add(5.0);

		double productOfSquareRoots = myList2.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
		System.out.println("Product of square roots: " + productOfSquareRoots);

		// Map the square root of the elements in myList to a new stream.
		Stream<Double> sqrtRootStrm = myList2.stream().map((a) -> Math.sqrt(a));
		// Find the product of the square roots.
		double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
		System.out.println("Product of square roots is " + productOfSqrRoots);

		// A list of names, phone numbers, and e-mail addresses.
		ArrayList<NamePhoneEmail> myList3 = new ArrayList<>();
		myList3.add(new NamePhoneEmail("Sachin", "1234", "sachin@gmail.com"));
		myList3.add(new NamePhoneEmail("Rajesh", "1235", "rajesh@gmail.com"));
		myList3.add(new NamePhoneEmail("Manish", "1236", "manish@gmail.com"));
		System.out.println("Original values in myList: ");
		myList3.stream().forEach((a) -> {
			System.out.println(a.name + " " + a.phonenum + " " + a.email);
		});
		System.out.println();
		// Map just the names and phone numbers to a new stream.
		Stream<NamePhone> nameAndPhone = myList3.stream().map((a) -> new NamePhone(a.name, a.phonenum));
		System.out.println("List of names and phone numbers: ");
		nameAndPhone.forEach((a) -> {
			System.out.println(a.name + " " + a.phonenum);
		});

		// Map just the names and phone numbers to a new stream using collect.
		Stream<NamePhone> nameAndPhone2 = myList3.stream().map((a) -> new NamePhone(a.name, a.phonenum));
		// Use collect to create a List of the names and phone numbers.
		List<NamePhone> npList = nameAndPhone2.collect(Collectors.toList());
		System.out.println("Names and phone numbers in a List:");
		for (NamePhone e : npList)
			System.out.println(e.name + ": " + e.phonenum);
		// Obtain another mapping of the names and phone numbers.
		nameAndPhone2 = myList3.stream().map((a) -> new NamePhone(a.name, a.phonenum));
		// Now, create a Set by use of collect().
		Set<NamePhone> npSet = nameAndPhone2.collect(Collectors.toSet());
		System.out.println("\nNames and phone numbers in a Set:");
		for (NamePhone e : npSet)
			System.out.println(e.name + ": " + e.phonenum);
		Stream<Double> newStream = myList2.stream();
		Iterator<Double> itr = newStream.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

	static class NamePhoneEmail {
		String name;
		String phonenum;
		String email;

		NamePhoneEmail(String n, String p, String e) {
			name = n;
			phonenum = p;
			email = e;
		}
	}

	static class NamePhone {
		String name;
		String phonenum;

		NamePhone(String n, String p) {
			name = n;
			phonenum = p;
		}
	}
}
