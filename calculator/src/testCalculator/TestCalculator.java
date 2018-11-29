package testCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.Calculator;


public class TestCalculator {
	
	@Test
	public void testCalculatoradd() {
		assertEquals("The addition is  correct", "5+3=8", Calculator.calcAddition(5,3,8));
	}
	
	@Test
	public void testCalculatoradd2() {
		assertEquals("The addition is incorrect", "", Calculator.calcAddition(5,3,15));
		
	}
	
	@Test
	public void testCalculatorMulty1() {
		assertEquals("The multiplication is incorrect", "", Calculator.calcMultiply(5, 3, 8));
	}
	
	@Test
	public void testCalcualtormulty2() {
		assertEquals("The multiplication works!", "4*2=8", Calculator.calcMultiply(4, 2, 8));
	}
	
	@Test
	public void testCalculatorDivide() {
		assertEquals("The division works!", "8/4=2", Calculator.calcDivide(4, 2, 8));
	}

	@Test
	public void testCalculatorDivide1() {
		assertEquals("The division works!", "", Calculator.calcDivide(num1, num2, num3));
	}
}
