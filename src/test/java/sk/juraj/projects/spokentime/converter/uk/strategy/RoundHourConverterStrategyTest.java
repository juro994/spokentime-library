package sk.juraj.projects.spokentime.converter.uk.strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class RoundHourConverterStrategyTest {

	@Test
	void testConvert() {
		var strategy = new RoundHourConverterStrategy();
		var finalExpression = strategy.convert(LocalTime.of(9, 0));
		assertTrue(finalExpression.contains("o'clock"));
	}

}
