package sk.juraj.projects.spokentime.converter.uk;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import sk.juraj.projects.spokentime.converter.uk.strategy.BeforeHalfHourConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.MidnightConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.NoonConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.PastHalfHourConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.RoundHourConverterStrategy;

class BritishConversionStrategyFactoryTest {

	@Test
	void testGetStrategyIfTimeIsNull() {
		var exception = assertThrows(IllegalArgumentException.class, () -> { BritishConversionStrategyFactory.getStrategy(null); });
		assertEquals("Time cannot be null", exception.getMessage());
	}
	
	@Test
	void testGetStrategyIfTimeIsMidnight() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.MIDNIGHT);
		assertTrue(strategy instanceof MidnightConverterStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsNoon() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.NOON);
		assertTrue(strategy instanceof NoonConverterStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsRound() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.of(6, 0));
		assertTrue(strategy instanceof RoundHourConverterStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsBeforeHalfHour() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.of(7, 25));
		assertTrue(strategy instanceof BeforeHalfHourConverterStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsPastHalfHour() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.of(7, 37));
		assertTrue(strategy instanceof PastHalfHourConverterStrategy);
	}

}
