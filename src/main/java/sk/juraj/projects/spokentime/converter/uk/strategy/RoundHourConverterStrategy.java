package sk.juraj.projects.spokentime.converter.uk.strategy;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConverter;

public class RoundHourConverterStrategy implements ConversionStrategy{

	@Override
	public String convert(LocalTime time) {
		return TimeUnitToBritishExpressionConverter.convertHour(time.getHour()) + " o'clock";
	}

}
