package day1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureTest {

	
	@Test
	void testConvert100degreeCelcuisToFarenhite(){
		Temperature temperature=new Temperature();
		Double actual=temperature.convertToFarenhite(100.0);
		
		Double expected=212.0;
		assertEquals(expected, actual);
	}

	@Test
	void testConvert39degreeCelcuisToFarenhite(){
		Temperature temperature=new Temperature();
		Double actual=temperature.convertToFarenhite(39.0);
		
		Double expected=102.2;
		assertEquals(expected, actual);
	}

	
	@Test
	void testConvert212degreeFarenhiteToCelsius() {
		Temperature temperature=new Temperature();
		Double actual=temperature.convertToCelsius(212.0);
		
		Double expected=100.0;
		assertEquals(expected, actual);
	}
	
}
