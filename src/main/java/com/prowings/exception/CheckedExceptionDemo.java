package com.prowings.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		System.out.println("main method started!!");

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		writeInToFile(input);

		System.out.println("main method ended!!");

	}

	public static void writeInToFile(String input) {
		File file = new File("myTextFile.txt");
		FileWriter fr = null;
		try {

			if (file.createNewFile())
				System.out.println("File created!!");
			else
				System.out.println("File already exist!!");

			fr = new FileWriter(file);
			fr.write(input);
			throw new NullPointerException("my message");

		} catch (IOException e) {
			System.out.println("Error while creating or writing file!!!");

		}
		catch (Exception e) {
			System.out.println("Some error while performing file operations!!");
			e.printStackTrace();
			
		}
		finally
		{
			try {
				fr.close();
				System.out.println("File writer closed successfully!!");
			} catch (IOException e) {
				System.out.println("Error while closing the file!!");
			}
		}
	}

}
