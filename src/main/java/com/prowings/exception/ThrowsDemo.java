package com.prowings.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		m1();
		System.out.println("main ended");
		
	}

	public static void m1() {
		System.out.println("m1 started");
		try {
			m2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1 ended");
	}

	public static void m2() throws IOException, CloneNotSupportedException {
		System.out.println("m2 started");
		m3();
		System.out.println("m2 ended");
	}
	public static void m3() throws IOException, CloneNotSupportedException {
		System.out.println("m3 started");
		//risky code
		File file = new File("");
		FileWriter fileWriter = new FileWriter(file);
		ThrowsDemo obj = new ThrowsDemo();
		obj.clone();
		
		System.out.println("m3 ended");
	}
}
