package day1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testCalculateFactorialOf0() {
		Factorial factorial=new Factorial();
		int actual=factorial.calculateFactorial(0);
		int expected=1;
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculateFactorialOf5() {
		Factorial factorial=new Factorial();
		int actual=factorial.calculateFactorial(5);
		int expected=120;
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculateFactorialOf12() {
		Factorial factorial=new Factorial();
		int actual=factorial.calculateFactorial(12);
		int expected=479001600;
		assertEquals(expected, actual);
	}
}
