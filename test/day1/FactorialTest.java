package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testCalculateFactorial() {
		Factorial factorial=new Factorial();
		int actual=factorial.calculateFactorial(5);
		int expected=120;
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculateFactorial1() {
		Factorial factorial=new Factorial();
		int actual=factorial.calculateFactorial(10);
		int expected=3628800;
		assertEquals(expected, actual);
	}

}
