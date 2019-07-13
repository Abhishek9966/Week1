package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {

	@Test
	void testSumOfEvenNumbers() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfEvenNumbers(1, 10);
		int expected=30;
		assertEquals(expected, actual);
	}

	@Test
	void testSumOfOddNumbers() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfOddNumbers(1, 11);
		int expected=36;
		assertEquals(expected, actual);
	}

}
