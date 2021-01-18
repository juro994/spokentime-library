package sk.juraj.projects.spokentime.converter.uk.strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class RoundHourConversionStrategyTest {

	@Test
	void testConvert() {
		var strategy = new RoundHourConversionStrategy();
		var finalExpression = strategy.convert(LocalTime.of(9, 0));
		assertTrue(finalExpression.contains("o'clock"));
	}

}
