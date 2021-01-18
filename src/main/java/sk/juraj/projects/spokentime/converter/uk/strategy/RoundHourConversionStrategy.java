package sk.juraj.projects.spokentime.converter.uk.strategy;

import static sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConversionHelper.convertHour;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;

public class RoundHourConversionStrategy implements ConversionStrategy {

	@Override
	public String convert(LocalTime time) {
		var spokenHour = convertHour(adjustToTwelveHourFormat(time.getHour()));
		
		return spokenHour + " o'clock";
	}

}
