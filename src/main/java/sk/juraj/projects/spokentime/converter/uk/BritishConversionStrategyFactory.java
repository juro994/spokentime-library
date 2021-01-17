package sk.juraj.projects.spokentime.converter.uk;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.BeforeHalfHourConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.MidnightConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.NoonConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.PastHalfHourConverterStrategy;
import sk.juraj.projects.spokentime.converter.uk.strategy.RoundHourConverterStrategy;

public class BritishConversionStrategyFactory {
	
	public static ConversionStrategy getStrategy(LocalTime time) {
		if(time == null) {
			throw new IllegalArgumentException("Time cannot be null");
		}
		
		var minute = time.getMinute();
		
		if(LocalTime.MIDNIGHT.equals(time)) {
			return new MidnightConverterStrategy();
		} else if (LocalTime.NOON.equals(time)) {
			return new NoonConverterStrategy();
		} else if (minute == 0) {
			return new RoundHourConverterStrategy();
		} else if(minute < 35) {
			return new BeforeHalfHourConverterStrategy();
		} else {
			return new PastHalfHourConverterStrategy();
		}
	}

}
