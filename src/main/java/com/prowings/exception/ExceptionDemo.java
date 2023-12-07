package com.prowings.exception;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		myMethod();
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

	public static void myMethod() {
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		int res = 0;
		res = 10/0;
		System.out.println(">>>>RES>>>"+res);
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
	}

}
