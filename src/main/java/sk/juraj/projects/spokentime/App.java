package sk.juraj.projects.spokentime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import sk.juraj.projects.spokentime.converter.SpokenTimeConverterFactory;

public class App {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("You need to provide an argument in a format of hh:mm");
		} else {
			var formatter = DateTimeFormatter.ofPattern("H:m");
			var time = LocalTime.parse(args[0], formatter);
			var converter = SpokenTimeConverterFactory.getInstance(Locale.UK);
			var spokenBritishExpression = converter.convert(time);
			System.out.println(spokenBritishExpression);
		}
	}

}
