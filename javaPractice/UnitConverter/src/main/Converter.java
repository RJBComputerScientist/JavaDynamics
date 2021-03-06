package main;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Converter {
	static Scanner scan = new Scanner(System.in);

	private static void MoreThan(int selection) {
		System.out.println("You Picked " + "'" + selection + "'" + " Ins't a option right now");
	}

	private static void EqualToOne(int selection) {
		System.out.println("You Picked " + "'" + selection + "'" + " How many US DOLLARS do you have?\n");
		System.out.println("that you want to convert to EUROS");
	}

	private static void EqualToTwo(int selection) {
		System.out.println("You Picked " + "'" + selection + "'" + " How many EUROS do you have?\n");
		System.out.println("that you want to convert to US DOLLARS");
	}
	
	private static void EqualToThree(int selection) {
		System.out.println("You Picked " + "'" + selection + "'" + " How many Jamaican Dollars do you have?\n");
		System.out.println("that you want to convert to US DOLLARS");
	}
	
	private static void EqualToFour(int selection) {
		System.out.println("You Picked " + "'" + selection + "'" + " How many US Dollars do you have?\n");
		System.out.println("that you want to convert to JAMAICAN DOLLARS");
	}

	private static void Options() {
		System.out.println("1. US Dollars to EURO");
		System.out.println("2. EUROS to US Dollars");
		System.out.println("3. JMD to US Dollars");
		System.out.println("4. US Dollars to JMD");
		System.out.println("Pressing '5' will end the unit converter application");
	}

	// Conversions
	private static void conversion(int input, double conversion) {
		DecimalFormat df = new DecimalFormat("#.00");
		String formatted = df.format(conversion);
		System.out.println("\nCONVERSION!!! Your " + input + " is converted to " + formatted);
	}

	public static double UStoEURO(int number) {
		return number * .83;
	}

	public static double EUROtoUS(int number) {
		return number * 1.21;
	}
	
	public static double JAMtoUS(int number) {
		return number * 0.0067;
	}
	
	public static double UStoJAM(int number) {
		return 149.86 * number;
	}
	

	public static void main(String[] args) {
		Options();

		try {

			int menuSelection;
			menuSelection = scan.nextInt();


			loop: while (menuSelection != 5) {

				int v = 0;
				switch (menuSelection) {
				case 1:
					EqualToOne(menuSelection);	
					v = scan.nextInt();
					conversion(v, UStoEURO(v));
					break;
				case 2:
					EqualToTwo(menuSelection);
					v = scan.nextInt();
					conversion(v, EUROtoUS(v));
					break;
				case 3:
					EqualToThree(menuSelection);
					v = scan.nextInt();
					conversion(v, JAMtoUS(v));
					break;
				case 4:
					EqualToFour(menuSelection);
					v = scan.nextInt();
					conversion(v, UStoJAM(v));
					break;
				default:
					MoreThan(menuSelection);
					System.out.println("Not a valid Number\n");
				}
				System.out.print("\nConvert again? yes or no\n");
				String goAgain = scan.next();
				if (goAgain.equals("yes") || goAgain.equals("Yes")) {
					Options();
					menuSelection = scan.nextInt();
					continue;
				} else if (goAgain.equals("no") || goAgain.equals("No")) {
					System.out.println("You Have Closed The Unit Converter");
					break;
				} else {
					System.out.println("You didnt say 'yes' or 'no', so lets restart the program for you\n");
					Options();
					menuSelection = scan.nextInt();
					continue loop;
				}
			}
			if (menuSelection == 5) {
				System.out.println("GoodBye!");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("This isn't a valid entry");
			System.out.println("\nRESTART YOUR UNIT CONVERTER");

		}

	}
}
