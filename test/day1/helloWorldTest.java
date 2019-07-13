package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class helloWorldTest {

	@Test
	public void test()
	{
		helloWorld hw=new helloWorld();
		String actual=hw.getMessage();
		String expected="Hello World!";
		assertEquals(expected, actual);
	}

}
