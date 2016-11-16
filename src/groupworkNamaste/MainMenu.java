package groupworkNamaste;

import java.util.Scanner;

public class MainMenu {

	public static Scanner ourScanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean x = true;
		
//      START CHOICE LOOP 
		do {

			// USER MAKES A CHOICE OF FOLLOWING
			System.out.println("**************************");
			System.out.println("1 - Employee managment");
			System.out.println("2 - Statistics");
			System.out.println("3 - Exit");

			System.out.println("Choose acitivity by number ");
			int choice = ourScanner.nextInt();
			ourScanner.nextLine(); // EMPTY SCANNER

			switch (choice) {
			case 1:
				System.out.println("work here");
				break;

			case 2:
				System.out.println("statistics to come");
				break;

			case 3:
				x = false; // SET EXIT LOOP VALUE
				System.out.println("Thank U and bye bye!");
				break;

			default:
				System.out.println("Give a number btw 1-3");
				break;

			} // END OF SWITCH

		} // END OF DO LOOP

		while (x);
		// END OF LOOP

		System.out.println("Good bye");

	} // END OF MAIN

}// END OF CLASS



