import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Birthday {
	private static Scanner input;

	public static void getBirthday() {
		input = new Scanner(System.in);
		boolean Loop = true;
		int year = 0;
		int age = 0;

		do {
			try {
				System.out.println("What age would you like to use?");
				age = input.nextInt();
				if (age < 0) {
					throw new NumberFormatException("Enter positive number.");
				}
				Loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Please enter integer");
				input.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				input.nextLine();
			}
		} while (Loop);
		year = 2015 - age;

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Born, " + year + " which is a leap year.");
		else
			System.out.println("Born, " + year + " which isn't a leap year.");
	}

	public static void getAge() {
		int r;
		Random random = new Random();

		System.out.println("Possible age:");
		for (r = 1; r <= 3; r++) {
			System.out.println(random.nextInt(100));
		}
	}

}