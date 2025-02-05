package sk.juraj.projects.spokentime.converter.uk;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import sk.juraj.projects.spokentime.converter.uk.strategy.BeforeHalfHourConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.MidnightConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.NoonConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.PastHalfHourConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.RoundHourConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.TrivialConverterStrategy;

class BritishConversionStrategyFactoryTest {

	@Test
	void testGetStrategyIfTimeIsNull() {
		var exception = assertThrows(IllegalArgumentException.class, () -> { BritishConversionStrategyFactory.getStrategy(null); });
		assertEquals("Time cannot be null", exception.getMessage());
	}
	
	@Test
	void testGetStrategyIfTimeIsMidnight() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.MIDNIGHT);
		assertTrue(strategy instanceof MidnightConversionStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsNoon() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.NOON);
		assertTrue(strategy instanceof NoonConversionStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsRound() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.of(6, 0));
		assertTrue(strategy instanceof RoundHourConversionStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsBeforeHalfHour() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.of(7, 25));
		assertTrue(strategy instanceof BeforeHalfHourConversionStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsTrivial() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.of(7, 37));
		assertTrue(strategy instanceof TrivialConverterStrategy);
	}
	
	@Test
	void testGetStrategyIfTimeIsPastHalfHour() {
		var strategy = BritishConversionStrategyFactory.getStrategy(LocalTime.of(7, 35));
		assertTrue(strategy instanceof PastHalfHourConversionStrategy);
	}

}
