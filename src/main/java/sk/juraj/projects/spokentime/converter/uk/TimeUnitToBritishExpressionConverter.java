package sk.juraj.projects.spokentime.converter.uk;

public class TimeUnitToBritishExpressionConverter {
	
	private static final String[] UNITS = {
			"",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen"
	};

	private static final String[] TENS = {
			"",
			"",
			"twenty",
			"thirty",
			"forty",
			"fifty"
	};
	
	public static String convertHour(int n) {
		if (n == 0) {
			return "midnight";
		} else {
			return convertStandardTimeUnits(n);
		}
	}
	
	public static String convertMinute(int n) {
		if (n == 15) {
			return "quarter";
		} else if (n == 30) {
			return "half";
		} else {
			return convertStandardTimeUnits(n);
		}
	}
	
	private static String convertStandardTimeUnits(int n) {
		if (n < 20) {
			return UNITS[n];
		} else {
			return TENS[n/10] + ((n % 10 != 0) ? " " : "") + UNITS[n % 10];
		}
	}

}