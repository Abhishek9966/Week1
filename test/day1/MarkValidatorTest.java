package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void testIsPass() {
		MarkValidator mv=new MarkValidator();
		boolean actual=mv.isPass(91);
		boolean expected=true;
		assertEquals(expected, actual);
	}
	
	@Test
	void testIsPass1() {
		MarkValidator mv=new MarkValidator();
		boolean actual=mv.isPass(30);
		boolean expected=false;
		assertEquals(expected, actual);
	}

	@Test
	void testMarkGrade() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(91);
			String expected="Grade A";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarkGrade1() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(80);
			String expected="Grade B";
		assertEquals(expected, actual);
	}

	@Test
	void testMarkGrade2() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(70);
			String expected="Grade C";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarkGrade3() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(55);
			String expected="Grade D";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarkGrad() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(91);
			String expected="Grade A";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarkGrad1() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(80);
			String expected="Grade B";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarkGrad2() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(70);
			String expected="Grade C";
		assertEquals(expected, actual);
	}
	
	@Test
	void testMarkGrad3() {
		MarkValidator mv=new MarkValidator();
			String actual=mv.markGrade(55);
			String expected="Grade D";
		assertEquals(expected, actual);
	}
}
