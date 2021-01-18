package sk.juraj.projects.spokentime.converter.uk.strategy;

import static sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConversionHelper.convertHour;
import static sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConversionHelper.convertMinute;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;

public class PastHalfHourConversionStrategy implements ConversionStrategy {

	@Override
	public String convert(LocalTime time) {
		var minuteToConvert = 60 - time.getMinute();
		var hourToConvert = time.getHour() == 23 ? 0 : time.getHour() + 1;
		
		var spokenMinute = convertMinute(minuteToConvert);
		var spokenHour = convertHour(adjustToTwelveHourFormat(hourToConvert));
		
		return spokenMinute + " to " + spokenHour;
	}

}
