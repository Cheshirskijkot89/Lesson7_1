package chizhenko;

import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		int monthNow = 0;
		int monthBefore = 0;
		int yearNow = 0;
		int yearBefore = 0;

		Date dateNow = new Date();
		Date dateBefore = new Date();

		monthNow = dateNow.getMonth();
		yearNow = dateNow.getYear();

		if ((monthNow - 1) < 0) {
			monthBefore = 11;
			yearBefore = yearNow - 1;
		} else {
			monthBefore = monthNow - 1;
			yearBefore = yearNow;
		}
		;

		dateBefore.setMonth(monthBefore);
		dateBefore.setYear(yearBefore);

		System.out.println(dateNow.getTime() - dateBefore.getTime());

	}

}
