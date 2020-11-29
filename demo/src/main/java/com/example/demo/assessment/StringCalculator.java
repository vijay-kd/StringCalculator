package com.example.demo.assessment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	public static int add(String numbers) {
		
		int sum = 0;
		
		if(numbers.isEmpty()) {
			return 0;
		}
		
		String[] integers = spliter(numbers);
		
		for(String integer: integers) {
			
			int num = Integer.parseInt(integer);
			
			if(num < 0) throw new RuntimeException("negatives not allowed");
			
			sum += num;
		}
		
		return sum;
	}
	
	static String[] spliter(String text) {
		
		if(text.startsWith("//")) {
			
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
			m.matches();
			
			String customDelimiters = m.group(1);
			String numbers = m.group(2);
			
			return numbers.split(customDelimiters);
		}
		
		return text.split(",|\n");
	}
}	
