package sk.juraj.projects.spokentime.converter.uk.strategy;

import static sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConversionHelper.convertHour;
import static sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConversionHelper.convertMinute;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;

public class TrivialConverterStrategy implements ConversionStrategy {

	@Override
	public String convert(LocalTime time) {
		var minute = time.getMinute();
		var minuteExpressionBuilder = new StringBuilder(convertMinute(minute));
		if(minute < 10) {
			minuteExpressionBuilder.insert(0, "oh ");
		}
		
		var spokenHour = convertHour(adjustToTwelveHourFormat(time.getHour()));
		var spokenMinute = minuteExpressionBuilder.toString();
		
		return spokenHour + " " + spokenMinute;
	}

}
