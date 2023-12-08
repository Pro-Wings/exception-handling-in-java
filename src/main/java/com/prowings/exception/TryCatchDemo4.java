package com.prowings.exception;

public class TryCatchDemo4 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		try
		{
			System.out.println("inside try");
			int res = 10/0;
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("inside catch");
		}
		finally {
			System.out.println("inside finally");
		}
		
		System.out.println("main method ended!!");
		
		
	}

}
