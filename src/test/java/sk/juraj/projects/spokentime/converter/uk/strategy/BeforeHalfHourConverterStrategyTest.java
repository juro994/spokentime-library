package sk.juraj.projects.spokentime.converter.uk.strategy;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class BeforeHalfHourConverterStrategyTest {

	@Test
	void testConvert() {
		var strategy = new BeforeHalfHourConverterStrategy();
		var finalExpression = strategy.convert(LocalTime.of(10, 25));
		assertTrue(finalExpression.contains("past"));
	}

}
