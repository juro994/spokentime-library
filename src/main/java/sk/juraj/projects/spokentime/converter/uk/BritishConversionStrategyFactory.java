package sk.juraj.projects.spokentime.converter.uk;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.BeforeHalfHourConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.MidnightConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.NoonConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.PastHalfHourConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.RoundHourConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.TrivialConverterStrategy;

public class BritishConversionStrategyFactory {
	
	public static ConversionStrategy getStrategy(LocalTime time) {
		if(time == null) {
			throw new IllegalArgumentException("Time cannot be null");
		}
		
		var minute = time.getMinute();
		
		if(LocalTime.MIDNIGHT.equals(time)) {
			return new MidnightConversionStrategy();
		} else if (LocalTime.NOON.equals(time)) {
			return new NoonConversionStrategy();
		} else if (minute == 0) {
			return new RoundHourConverterStrategy();
		} else if (minute%5 != 0) {
			return new TrivialConverterStrategy();
		} else if(minute <= 30) {
			return new BeforeHalfHourConverterStrategy();
		} else {
			return new PastHalfHourConverterStrategy();
		}
	}

}
