package sk.juraj.projects.spokentime.converter.uk.strategy;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConverter;

public class TrivialConverterStrategy implements ConversionStrategy {

	@Override
	public String convert(LocalTime time) {
		var minute = time.getMinute();
		var minuteExpressionBuilder = new StringBuilder();
		if(minute < 10) {
			minuteExpressionBuilder.append("oh ");
		}
		minuteExpressionBuilder.append(TimeUnitToBritishExpressionConverter.convertMinute(minute));
		return TimeUnitToBritishExpressionConverter.convertHour(adjustToTwelveHourFormat(time.getHour())) + " "
				+ minuteExpressionBuilder.toString();
	}

}
