package sk.juraj.projects.spokentime.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;

import org.junit.jupiter.api.Test;

import sk.juraj.projects.spokentime.converter.uk.BritishSpokenTimeConverter;

class SpokenTimeConverterFactoryTest {

	@Test
	void testGetInstanceWithSupportedLocale() {
		var converter = SpokenTimeConverterFactory.getInstance(Locale.UK);
		assertTrue(converter instanceof BritishSpokenTimeConverter);
	}
	
	@Test
	void testGetInstanceWithUnsupportedLocale() {
		var germanLocale = Locale.GERMAN;
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> SpokenTimeConverterFactory.getInstance(germanLocale));
	    assertEquals("Locale " + germanLocale + " is not supported", exception.getMessage());
	}
	
	@Test
	void testGetInstanceWithNullLocale() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> SpokenTimeConverterFactory.getInstance(null));
		assertEquals("Locale null is not supported", exception.getMessage());
	}

}
