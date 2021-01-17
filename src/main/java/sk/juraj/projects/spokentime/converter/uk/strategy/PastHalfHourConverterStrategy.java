package sk.juraj.projects.spokentime.converter.uk.strategy;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;
import sk.juraj.projects.spokentime.converter.uk.TimeUnitToBritishExpressionConverter;

public class PastHalfHourConverterStrategy implements ConversionStrategy {

	@Override
	public String convert(LocalTime time) {
		var minuteToConvert = 60 - time.getMinute();
		var hourToConvert = time.getHour() != 12 ? time.getHour() + 1 : 1;
		return TimeUnitToBritishExpressionConverter.convertMinute(minuteToConvert) + " to "
				+ TimeUnitToBritishExpressionConverter.convertHour(hourToConvert);
	}

}
