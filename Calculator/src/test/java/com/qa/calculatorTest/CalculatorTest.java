package com.qa.calculatorTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.calculator.Calculator;

public class CalculatorTest {
	Calculator calc;
	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void addition() {
		int actualValue = calc.add(2,2);
		assertEquals("Addition error", 4, actualValue);
	}
	@Test
	public void division() {
		int actualValue = calc.divide(8,4);
		assertEquals("Division error", 2, actualValue);
	}
}
