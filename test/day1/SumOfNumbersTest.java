package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOfNumbersTest {
	
	@Test
	void testSumOfEvenNumbersBetween11to20() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfEvenNumbers(11, 20);
		
		int expected=80;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfEvenNumbersBetween11to19() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfEvenNumbers(11, 19);
		
		int expected=60;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfEvenNumbersBetween12to20() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfEvenNumbers(12, 20);
		
		int expected=80;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfEvenNumbersBetween12to19() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfEvenNumbers(12, 19);
		
		int expected=60;
		assertEquals(expected, actual);
	}
	
	/*
	@Test
	void testSumOfEvenNumbersBetween1to2147483647() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfEvenNumbers(1, 2147483647);
		
		int expected=0;
		assertEquals(expected, actual);
	}
	*/
	@Test
	void testSumOfOddNumbersBetween11to20() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfOddNumbers(11,20);
		
		int expected=75;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfOddNumbersBetween11to19() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfOddNumbers(11,19);
		
		int expected=75;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfOddNumbersBetween12to20() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfOddNumbers(12,20);
		
		int expected=64;
		assertEquals(expected, actual);
	}
	
	@Test
	void testSumOfOddNumbersBetween12to19() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfOddNumbers(12,19);
		
		int expected=64;
		assertEquals(expected, actual);
	}
	
	/*
	@Test
	void testSumOfOddNumbersBetween1to2147483647() {
		SumOfNumbers sum=new SumOfNumbers();
		int actual=sum.sumOfOddNumbers(1,2147483647);
		
		int expected=0;
		assertEquals(expected, actual);
	}
	*/
}
