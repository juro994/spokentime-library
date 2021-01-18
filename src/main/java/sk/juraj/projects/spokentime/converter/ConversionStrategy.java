package sk.juraj.projects.spokentime.converter;

import java.time.LocalTime;

public interface ConversionStrategy {

	String convert(LocalTime time);

	default int adjustToTwelveHourFormat(int hour) {
		if (hour > 12) {
			return hour - 12;
		} else {
			return hour;
		}
	}

}
