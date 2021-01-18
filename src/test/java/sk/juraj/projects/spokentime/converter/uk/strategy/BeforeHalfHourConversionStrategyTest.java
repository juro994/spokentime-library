package sk.juraj.projects.spokentime.converter.uk.strategy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class BeforeHalfHourConversionStrategyTest {

	@Test
	void testConvert() {
		var strategy = new BeforeHalfHourConversionStrategy();
		var finalExpression = strategy.convert(LocalTime.of(10, 25));
		assertTrue(finalExpression.contains("past"));
	}

}
