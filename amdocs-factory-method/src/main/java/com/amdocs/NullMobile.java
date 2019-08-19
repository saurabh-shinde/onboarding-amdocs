package com.amdocs;

public class NullMobile implements IMobile {
	
	public void call() {
		System.out.println("Invalid Object");
		System.out.println("Perform Error handling here..");
	}
}
