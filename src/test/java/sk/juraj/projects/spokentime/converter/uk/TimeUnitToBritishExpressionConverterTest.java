package sk.juraj.projects.spokentime.converter.uk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeUnitToBritishExpressionConverterTest {
	
	@Test
	void testConvertMidnightHour() {
		var expression = TimeUnitToBritishExpressionConverter.convertHour(0);
		assertEquals("midnight", expression);
	}
	
	@Test
	void testConvertStandardHour() {
		var expression = TimeUnitToBritishExpressionConverter.convertHour(7);
		assertEquals("seven", expression);
	}

	@Test
	void testConvertQuarterHourMinute() {
		var expression = TimeUnitToBritishExpressionConverter.convertMinute(15);
		assertEquals("quarter", expression);
	}
	
	@Test
	void testConvertHalfHourMinute() {
		var expression = TimeUnitToBritishExpressionConverter.convertMinute(30);
		assertEquals("half", expression);
	}
	
	@Test
	void testConvertStandardMinute() {
		var expression = TimeUnitToBritishExpressionConverter.convertMinute(48);
		assertEquals("forty eight", expression);
	}

}
