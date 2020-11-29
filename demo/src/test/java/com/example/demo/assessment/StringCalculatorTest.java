package com.example.demo.assessment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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
	
	@Test
	void shouldReturnSumOnMultipleNumbersDelimitedByComma() {
		assertEquals(10, StringCalculator.add("1,2,3,4"));
	}
	
	@Test
	void shouldAcceptNewLineAsValidDelimiter() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
	@Test
	void shouldAcceptCustomDelimiter() {
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}
	
	@Test
	void shouldRaiseAnExceptionOnNegativeNumber() {

		try {
			StringCalculator.add("-1,2,3");
			fail("Exception Expected");
		}catch (RuntimeException e) {
			//System.out.println(e.getMessage());
		}
	}
}
