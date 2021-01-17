package sk.juraj.projects.spokentime.converter.uk;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.SpokenTimeConverter;

public class BritishSpokenTimeConverter implements SpokenTimeConverter {

	public String convert(LocalTime time) {
		var strategy = BritishConversionStrategyFactory.getStrategy(time);
		return strategy.convert(time);
	}

}
