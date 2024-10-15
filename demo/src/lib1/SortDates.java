package lib1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class SortDates {

	public static void main(String[] args) {

		String[] dates = {"2000-10-10", "2002-10-20", "2005-01-20", "2004-12-12", "2003-03-03" };

		LocalDate[] dobs = new LocalDate[5];

		for (int i = 0; i < 5; i++)
			dobs[i] = LocalDate.parse(dates[i]);

		Arrays.sort(dobs);

		var format = DateTimeFormatter.ofPattern("dd-MMM-uuuu");
		
		for (LocalDate dob : dobs)
			System.out.println(dob.format(format));

	}
}
