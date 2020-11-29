package com.example.demo.assessment;

public class StringCalculator {
	public static int add(String numbers) {
		
		int sum = 0;
		
		if(numbers.isEmpty()) {
			return 0;
		}
		
		String[] integers = numbers.split(",|\n");
		
		for(String integer: integers) {
			sum += Integer.parseInt(integer);
		}
		
		return sum;
	}
}	
