package com.gagan;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface1 myInterface1=()->System.out.println("Lambda Expressions");
		myInterface1.method1();
		
		System.out.println("-----------------------------");
		
		MyInterface2 myInterface2=name->System.out.println("Your name is: "+name);
		myInterface2.method2("Gagan");
		
		System.out.println("-----------------------------");
		
		MyInterface3 myInterface3=(name,age)->{
			System.out.println("Your name is: "+name);
			System.out.println("You are "+age+" years Old");
		};
		
		myInterface3.method3("Gagan", 21);
	}

}
