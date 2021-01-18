package sk.juraj.projects.spokentime.converter.uk.strategy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

class TrivialConverterStrategyTest {

	@Test
	void testConvert() {
		var strategy = new TrivialConverterStrategy();
		var finalExpression = strategy.convert(LocalTime.of(9, 34));
		assertTrue(finalExpression.contains("nine thirty four"));
	}
	
	@Test
	void testConvertWithOhWord() {
		var strategy = new TrivialConverterStrategy();
		var finalExpression = strategy.convert(LocalTime.of(9, 4));
		assertTrue(finalExpression.contains("nine oh four"));
	}

}
