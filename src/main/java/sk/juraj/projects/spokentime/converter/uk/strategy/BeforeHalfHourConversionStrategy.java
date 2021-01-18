package sk.juraj.projects.spokentime.converter.uk.strategy;

import static sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConversionHelper.convertHour;
import static sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConversionHelper.convertMinute;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;

public class BeforeHalfHourConversionStrategy implements ConversionStrategy {

	@Override
	public String convert(LocalTime time) {
		var spokenMinute = convertMinute(time.getMinute());
		var spokenHour = convertHour(adjustToTwelveHourFormat(time.getHour()));
		
		return spokenMinute + " past " + spokenHour;
	}

}
