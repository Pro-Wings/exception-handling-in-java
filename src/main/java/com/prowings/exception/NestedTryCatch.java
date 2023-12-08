package com.prowings.exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("main started!!");

		try {
			System.out.println("outer try");
			int res = 30 / 0; // arithmatic
			try {

				System.out.println("inner try");
				String s = null;
				s.toCharArray(); // NPE
			} 
			catch (Exception e) {
				System.out.println("inside inner catch");
			}
			finally
			{
				System.out.println("inside inner finally");
			}
		} 
		catch (NullPointerException e) {
			System.out.println("inside outer catch");
		}
		finally
		{
			System.out.println("inside outer finally");
			
		}


		System.out.println("main ended!!");
	}

}
