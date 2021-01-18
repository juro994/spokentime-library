package sk.juraj.projects.spokentime.converter.uk;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.BeforeHalfHourConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.MidnightConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.NoonConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.PastHalfHourConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.RoundHourConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.TrivialConverterStrategy;

public class BritishConversionStrategyFactory {

	public static ConversionStrategy getStrategy(LocalTime time) {
		if (time == null) {
			throw new IllegalArgumentException("Time cannot be null");
		}

		var minute = time.getMinute();

		if (LocalTime.MIDNIGHT.equals(time)) {
			return new MidnightConversionStrategy();
		} else if (LocalTime.NOON.equals(time)) {
			return new NoonConversionStrategy();
		} else if (minute == 0) {
			return new RoundHourConversionStrategy();
		} else if (minute % 5 != 0) {
			return new TrivialConverterStrategy();
		} else if (minute <= 30) {
			return new BeforeHalfHourConversionStrategy();
		} else {
			return new PastHalfHourConversionStrategy();
		}
	}

}
