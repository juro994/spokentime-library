package sk.juraj.projects.spokentime.converter;

import java.util.Locale;

import sk.juraj.projects.spokentime.converter.uk.BritishSpokenTimeConverter;

public class SpokenTimeConverterFactory {
	
	public static SpokenTimeConverter getInstance(Locale locale) {
		if(Locale.UK.equals(locale)) {
			return new BritishSpokenTimeConverter();
		}
		throw new IllegalArgumentException("Locale " + locale + " is not supported");
	}

}
