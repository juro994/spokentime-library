package sk.juraj.projects.spokentime.converter.uk.strategy;

import java.time.LocalTime;

import sk.juraj.projects.spokentime.converter.ConversionStrategy;

public class NoonConverterStrategy implements ConversionStrategy{

	@Override
	public String convert(LocalTime time) {
		return "noon";
	}

}
