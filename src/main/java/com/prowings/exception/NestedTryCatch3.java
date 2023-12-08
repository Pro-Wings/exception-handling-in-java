package com.prowings.exception;

public class NestedTryCatch3 {

	public static void main(String[] args) {
		System.out.println("main started!!");

		try {
			System.out.println("outer try");
			int res = 30 / 2; // arithmatic
			try {

				System.out.println("inner try");
				String s = null;
				s.toCharArray(); // NPE
			} 
			catch (NumberFormatException e) {
				System.out.println("inside inner catch");
			}
			finally
			{
				System.out.println("inside inner finally");
			}
		} 
		catch (NullPointerException e) {
			System.out.println("inside outer catch");
			try {
				//some code
			}catch (NullPointerException e1) {
				// TODO: handle exception
			}
		}
		finally
		{
			System.out.println("inside outer finally");
			
		}


		System.out.println("main ended!!");
	}

}
