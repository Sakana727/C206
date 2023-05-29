import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}


	@Test
	public void testSubtract() {
		int a = 5;
		int b = 3;
		
		Calculator calculator = new Calculator();
		int actual = calculator.subtract(a, b);
		int expected = 2;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int a = 4;
		int b = 2;
		
		Calculator calculator = new Calculator();
		int actual = calculator.multiply(a, b);
		int expected = 8;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		int a = 10;
		int b = 2;
		
		Calculator calculator = new Calculator();
		int actual = calculator.divide(a, b);
		int expected = 5;
		Assert.assertEquals(expected, actual);
	}
}
