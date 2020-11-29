package com.example.demo.assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	void shouldReturnZeroOnEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	void shouldReturnNumberOnNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}
	
	@Test
	void shouldReturnSumOnTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}
}
