package sk.juraj.projects.spokentime.converter.uk.strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class PastHalfHourConversionStrategyTest {

	@Test
	void testConvert() {
		var strategy = new PastHalfHourConversionStrategy();
		var finalExpression = strategy.convert(LocalTime.of(10, 25));
		assertTrue(finalExpression.contains("to"));
	}

}
