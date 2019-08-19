package com.amdocs;

import java.util.Scanner;

public class Main {

	public static void displayMenu() {
		System.out.println("Main Menu");
		System.out.println("Bubble-------------->1");
		System.out.println("Heap---------------->2");
		System.out.println("Radix--------------->3");
		System.out.println("Exit---------------->4");
	}
	
	public static int getChoice() {
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static void doWork(int choice) {
		IAlgorithm algo = AlgorithmFactory.getAlgoDetails(choice);
		algo.sort();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		while(choice != 4) {
			displayMenu();
			choice = getChoice();
			if(choice !=4 )
				doWork(choice);
		}
		System.out.println("Thank You!");

	}

}
