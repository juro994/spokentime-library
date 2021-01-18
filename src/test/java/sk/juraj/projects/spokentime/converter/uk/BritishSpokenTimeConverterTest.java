package sk.juraj.projects.spokentime.converter.uk;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class BritishSpokenTimeConverterTest {

	@Test
	void testConvertHalfPastFive() {
		var converter = new BritishSpokenTimeConverter();
		var result = converter.convert(LocalTime.of(5, 30));
		assertEquals("half past five", result);
	}
	
	@Test
	void testConvertMidnight() {
		var converter = new BritishSpokenTimeConverter();
		var result = converter.convert(LocalTime.of(0, 0));
		assertEquals("midnight", result);
	}
	
	@Test
	void testConvertNoon() {
		var converter = new BritishSpokenTimeConverter();
		var result = converter.convert(LocalTime.of(12, 0));
		assertEquals("noon", result);
	}
	
	@Test
	void testConvertFiveThirtySixAm() {
		var converter = new BritishSpokenTimeConverter();
		var result = converter.convert(LocalTime.of(5, 36));
		assertEquals("five thirty six", result);
	}
	
	@Test
	void testConvertFiveThirtySixPm() {
		var converter = new BritishSpokenTimeConverter();
		var result = converter.convert(LocalTime.of(17, 36));
		assertEquals("five thirty six", result);
	}

}
