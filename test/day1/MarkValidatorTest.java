package day1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void testIsPassFor80marks() {
		MarkValidator markValidator=new MarkValidator();
		boolean actual=markValidator.isPass(80);
		
		boolean expected=true;
		assertEquals(expected, actual);
	}
	
	@Test
	void testIsPassFor20marks() {
		MarkValidator markValidator=new MarkValidator();
		boolean actual=markValidator.isPass(20);
		
		boolean expected=false;
		assertEquals(expected, actual);
	}

	@Test
	void testGradeFor40marks() {
		MarkValidator markValidator=new MarkValidator();
		String actual=markValidator.markGrade(40);
		
		String expected="Grade D";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradeFor100marks() {
		MarkValidator markValidator=new MarkValidator();
		String actual=markValidator.markGrade(100);
		
		String expected="Grade A";
		assertEquals(expected, actual);
	}

	@Test
	void testGradeFor20marks() {
		MarkValidator markValidator=new MarkValidator();
		String actual=markValidator.markGrade(20);
		
		String expected="Fail";
		assertEquals(expected, actual);
	}
	
	@Test
	void testGradeBySwitchFor100marks() {
		MarkValidator markValidator=new MarkValidator();
		String actual=markValidator.markGradeBySwitch(100);
		
		String expected="Grade A";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testGradeBySwitchFor76marks() {
		MarkValidator markValidator=new MarkValidator();
		String actual=markValidator.markGradeBySwitch(76);
		
		String expected="Grade B";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testGradeBySwitchFor20marks() {
		MarkValidator markValidator=new MarkValidator();
		String actual=markValidator.markGradeBySwitch(20);
		
		String expected="Fail";
		assertEquals(expected, actual);
		
	}
}
