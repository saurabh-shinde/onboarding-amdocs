package com.amdocs;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(420);
		numbers.add(320);
		numbers.add(560);
		numbers.add(100);
		numbers.add(20);
		System.out.println("Size: "+numbers.size());
		System.out.println("Arraylist has foll. elements (unsorted):");
		for(int element : numbers) {
			System.out.println(element);
		}
		
		Collections.sort(numbers);
		
		System.out.println("Arraylist has foll. elements (sorted):");
		for(int element : numbers) {
			System.out.println(element);
		}
		
				
		
	}

}
