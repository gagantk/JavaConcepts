package com.gagan.ReferenceToInstanceMethodLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.gagan.model.Person;


public class ReferenceToInstanceMethodinLambda {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Gagan", 21));
		persons.add(new Person("Daya", 21));
		persons.add(new Person("Susheel", 22));
		persons.add(new Person("Akshatha", 22));
		
		
	List<String> personNames =ReferenceToInstanceMethodinLambda.getPersonsName(persons,Person::getName);
	personNames.forEach(System.out::println);
	}

	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
		List<String> results  = new ArrayList<>();
		persons.forEach(n->results.add(f.apply(n)));
		return results;
	}

}