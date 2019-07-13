package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	
	void testConvertToFarenhite() {
		Temperature temperature=new Temperature();
		Double actual=temperature.convertToFarenhite(37.4);
		Double expected=99.32;
		assertEquals(expected, actual);
	}

	@Test
	void testConvertToCelsius() {
		Temperature temperature=new Temperature();
		Double actual=temperature.convertToCelsius(100.0);
		Double expected=37.78;
		assertEquals(expected, actual);
	}
}
