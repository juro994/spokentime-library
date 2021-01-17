package sk.juraj.projects.spokentime.converter;

import java.time.LocalTime;

public interface ConversionStrategy {
	
	String convert(LocalTime time);

}
