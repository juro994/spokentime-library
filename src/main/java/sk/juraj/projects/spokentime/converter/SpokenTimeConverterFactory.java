package sk.juraj.projects.spokentime.converter;

import java.util.Locale;

import sk.juraj.projects.spokentime.converter.uk.BritishSpokenTimeConverter;

public class SpokenTimeConverterFactory {

	/**
	 * Gets an instance of {@link SpokenTimeConverter} based on Locale provided.
	 * Currently, only Locale.UK is supported.
	 * 
	 * @param locale locale object that corresponds to the translated language
	 * @return an instance of {@link SpokenTimeConverter}
	 * @throws IllegalArgumentException if the provided locale is null or
	 *                                  unsupported
	 */
	public static SpokenTimeConverter getInstance(Locale locale) {
		if (Locale.UK.equals(locale)) {
			return new BritishSpokenTimeConverter();
		}
		throw new IllegalArgumentException("Locale " + locale + " is not supported");
	}

}
