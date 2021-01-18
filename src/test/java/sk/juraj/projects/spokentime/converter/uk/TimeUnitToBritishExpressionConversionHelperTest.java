package sk.juraj.projects.spokentime.converter.uk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeUnitToBritishExpressionConversionHelperTest {
	
	@Test
	void testConvertMidnightHour() {
		var expression = TimeUnitToBritishExpressionConversionHelper.convertHour(0);
		assertEquals("midnight", expression);
	}
	
	@Test
	void testConvertStandardHour() {
		var expression = TimeUnitToBritishExpressionConversionHelper.convertHour(7);
		assertEquals("seven", expression);
	}

	@Test
	void testConvertQuarterHourMinute() {
		var expression = TimeUnitToBritishExpressionConversionHelper.convertMinute(15);
		assertEquals("quarter", expression);
	}
	
	@Test
	void testConvertHalfHourMinute() {
		var expression = TimeUnitToBritishExpressionConversionHelper.convertMinute(30);
		assertEquals("half", expression);
	}
	
	@Test
	void testConvertStandardMinute() {
		var expression = TimeUnitToBritishExpressionConversionHelper.convertMinute(48);
		assertEquals("forty eight", expression);
	}

}
