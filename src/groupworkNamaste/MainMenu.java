package groupworkNamaste;

import java.util.Scanner;

public class MainMenu {

	public static Scanner ourScanner = new Scanner(System.in);

	public static void main(String[] args) {

		//the main menu is the point of entry into our program
		boolean x = true;

		
//      START CHOICE LOOP 
		

		
	

		do {

			// USER MAKES A CHOICE OF FOLLOWING
			System.out.println("**************************\n         TOPMENU\n**************************");
			System.out.println("1 - Employee management");
			System.out.println("2 - Statistics");
			System.out.println("3 - Exit");

			System.out.println("\nChoose acitivity by number ");
			int choice = ourScanner.nextInt();
			ourScanner.nextLine(); // EMPTY SCANNER

			switch (choice) {
			case 1:
				EmployeeManagement.subMenu();

//				EmployeeManagement.enterEmployee();
				System.out.println("woooooork needed on loop");

				//EmployeeManagement.enterNewEmployee();

				break;

			case 2:
				System.out.println("statistics to come");
				break;

			case 3:
				x = false; // SET EXIT LOOP VALUE
				System.out.println("Well then, great work & have a nice day!");
				break;

			default:
				System.out.println("Please, enter a number btw 1-3. ");
				break;

			} 
			// END OF SWITCH

		} // END OF DO LOOP

		while (x);
		// END OF LOOP

		//System.out.println("Good bye");
		
		System.out.println("Good bye");
		ourScanner.close();

	} // END OF MAIN

}// END OF CLASS
//<<<<<<< HEAD




//=======
//>>>>>>> branch 'master' of https://github.com/MonaJuneja/EmploymentManagement.git


