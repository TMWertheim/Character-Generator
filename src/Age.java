
import java.util.GregorianCalendar;
import java.text.DateFormatSymbols;

class Age {

	private static int age;
	private static String num, day;

	public String getAge() {
		age = 1 + (int) (Math.random() * 99);
		num = Integer.toString(age);
		return num;
	}

	public String getBirthday() {
		GregorianCalendar gc = new GregorianCalendar();
		String month;
		int year = randBetween(1900, 2010);
		gc.set(gc.YEAR, year);
		int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
		gc.set(gc.DAY_OF_YEAR, dayOfYear);
		month = new DateFormatSymbols().getMonths()[gc.get(GregorianCalendar.MONTH)];
		day = month + " " + gc.get(GregorianCalendar.DAY_OF_MONTH);
		return day;
	}

	public int randBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}
}
