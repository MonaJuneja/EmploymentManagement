package groupworkNamaste;

import java.util.ArrayList;

public class EmployeeManagement {
	// ArrayList of employees (includes all categories of employees)
	static ArrayList<SuperClassEmployee> employeeList = new ArrayList<>();

	// SUBMENU
	//this submenu lets users add, print and delete entries into the database
	public static void subMenu() {
		boolean x = true; //boolean used to keep the loop running or end it

		// START CHOICE LOOP
		do {// USER MAKES A CHOICE OF FOLLOWING
			System.out.println("\n  *~^~*~^~*~^~*~^~*~^~*\n    SUBMENU MANAGEMENT\n  *~^~*~^~*~^~*~^~*~^~*");
			System.out.println("1 - Add a new employee");
			System.out.println("2 - Delete an employee");
			System.out.println("3 - Update an employee");
			System.out.println("4 - Exit the management menu");
			System.out.println("\nChoose acitivity by number ");
			int choice = MainMenu.ourScanner.nextInt();
			MainMenu.ourScanner.nextLine(); // EMPTY SCANNER

			switch (choice) {
			case 1:
				enterEmployee(); // takes user to method that handles entry of new employees in system
				x = false; //needed to break out of the loop once the user has finished entering the employee
				break;

			case 2:
			// TODO: Fix Y/N input for additional security
			// in next update make a loop for Y/N question
			// System.out.println("Are you sure you want to delete an employee?");
				String userInput = ScannerMethods.scannerString("Please enter the name of the employee you wish to remove from the system:");
				// System.out.println("Are you sure you want to remove " + userInput + " from the employee register?");
				EmployeeDataBase.deleteEmployee(userInput);
				// deletes employee
				//requires user input to know which employee to delete
				//sends user input as parameter
				x = false;
				break;

			case 3:
				// TODO: add update employee functionality
				//not implemented yet
				System.out.println("Work in progress expected to be implemented by Dec 2017");
				x = false;
				break;

			case 4:
				x = false; // SET EXIT LOOP VALUE
				// 1System.out.println("Thank U and bye bye!");
				break;

			default:
				System.out.println("Ooops, please enter a number btw 1-3");
				break;

			} // END OF SWITCH

		} // END OF DO LOOP

		while (x); //boolean used to keep the loop running or end it
		// END OF LOOP

	}

// METHOD FOR ADDING NEW EMPLOYEES
// To add a new employee you first need to capture all the data needed to enter the employee
// Basically it's the data you need for the constructors in the super and base classes
	public static void enterEmployee() {
		EnumCategory category; //Enums used for employee category
		//user enters data of new employee
		String inputName = ScannerMethods.scannerString("Please enter the data related to the new employee.\nName: ");
		double inputSalary = ScannerMethods.scannerDouble("Salary: ");
		int inputYearOfBirth = ScannerMethods.scannerInt("Year of birth: ");
		// TODO: try-catch or exception if/switch for incorrect input
		// TODO: if statement with logical OR || to check values
		
		boolean x = true; //boolean used to keep the loop running or end it
		do {

			String inputCategoryName = ScannerMethods.scannerString(
					"Choose employee category; \n(MT) Management, (PR) Programmers, (TE) Testers, (AD) Admin, (MG) Marketing \nEmployee category:");

			// (MT for Management, PR for Programmers, TE for Testers, AD for
			// Admin MG for Marketing)")
			switch (inputCategoryName) {
			case "MT":
				category = EnumCategory.MT;
				int inputYearsOfExperience = ScannerMethods.scannerInt("Years of experience: ");
				// CREATE A NEW PERSON IN CATEGORY MANAGEMENT
				CategoryManagement cm = new CategoryManagement(inputName, inputSalary, inputYearOfBirth, category,
						inputYearsOfExperience);
				employeeList.add(cm);
				x = false; 
				break;

			case "PR":
				category = EnumCategory.PR;
				int noOfCompletedProjects = ScannerMethods.scannerInt("Number of programs completed: ");
				// Enter a new programmer into the employee program
				CategoryProgrammer cp = new CategoryProgrammer(inputName, inputSalary, inputYearOfBirth, category,
						noOfCompletedProjects);
				employeeList.add(cp);
				x = false;
				break;

			case "TE":
				category = EnumCategory.TE;
				int noOfTestedProjects = ScannerMethods.scannerInt("Number of programs tested: ");
				// Enter a new tester into the employee program
				CategoryTesters ct = new CategoryTesters(inputName, inputSalary, inputYearOfBirth, category,
						noOfTestedProjects);
				employeeList.add(ct);
				x = false;
				break;

			case "AD":
				category = EnumCategory.AD;
				// bonus is fixed value for admin so no extra input necessary
				// Enter a new tester into the employee program
				CategoryAdmin ca = new CategoryAdmin(inputName, inputSalary, inputYearOfBirth, category);
				employeeList.add(ca);
				x = false;
				break;

			case "MG":
				category = EnumCategory.MG;
				int noOfNewCustomers = ScannerMethods.scannerInt("Number of programs tested: ");
				// Enter a new tester into the employee program
				CategoryMarketing cg = new CategoryMarketing(inputName, inputSalary, inputYearOfBirth, category,
						noOfNewCustomers);
				employeeList.add(cg);
				x = false;
				break;

			default:
				System.out.println("Invalid input, please enter a valid choice.");
				continue;
			}

			// going back into loop

		} while (x);
		System.out.print("\n*** " + employeeList.get(SuperClassEmployee.getCounterId() - 1).getName()
				+ " is now added. ***\n\n");

		// CHECKING LAST ADDED EMPLOYEE
		// System.out.print("\nRecently added employee" +
		// employeeList.get(SuperClassEmployee.getCounterId()-1).getemploymentId());
		// System.out.print(" ,
		// "+employeeList.get(SuperClassEmployee.getCounterId()-1).getName());
		// System.out.println(" ,
		// "+employeeList.get(SuperClassEmployee.getCounterId()-1).getSalary());

	}// END METHOD

}// END CLASS
