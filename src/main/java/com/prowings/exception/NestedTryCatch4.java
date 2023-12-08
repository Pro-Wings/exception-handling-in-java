package com.prowings.exception;

public class NestedTryCatch4 {

	public static void main(String[] args) {
		System.out.println("main started!!");

		try {
			System.out.println("outer try");
			int res = 30 / 0; // arithmatic
		} 
		catch (ArithmeticException e) {
			System.out.println("inside outer catch");
			try {
				//some code
			}catch (NullPointerException e1) {
				// TODO: handle exception
			}
			finally
			{
				System.out.println("inside inner-catch finally");
			}

		}
		finally
		{
			System.out.println("inside outer finally");
		}


		System.out.println("main ended!!");
	}

}
