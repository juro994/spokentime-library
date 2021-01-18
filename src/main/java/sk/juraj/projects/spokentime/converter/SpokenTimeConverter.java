package sk.juraj.projects.spokentime.converter;

import java.time.LocalTime;

public interface SpokenTimeConverter {
	
	/**
	 * Converts provided {@link LocalTime} to text representation in the corresponding language.
	 * @param time Time to convert.
	 * @return Spoken representation of the provided time.
	 */
	String convert(LocalTime time);

}
