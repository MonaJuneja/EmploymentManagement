package groupworkNamaste;

import java.util.ArrayList;



public class EmployeeManagement {

	// ArrayList of employees (includes all kinds of employees of all
	 static ArrayList<SuperClassEmployee> employeeList = new ArrayList<>();


	
	// METHOD FOR ADDING NEW EMPLOYEES
	public static void enterEmployee() {
		EnumCategory category;
		ScannerMethods.scannerString("Please enter the data related to the new employee.\nName:");
		System.out.print("Please enter the data related to the new employee.\n" + "Name:");
		String inputName = MainMenu.ourScanner.nextLine();
		System.out.print("Salary:");
		double inputSalary = MainMenu.ourScanner.nextDouble();
		System.out.print("Year of birth:");
		int inputYearOfBirth = MainMenu.ourScanner.nextInt();
		MainMenu.ourScanner.nextLine();
		System.out.println(
				"Employee category: \n(MT for Management, PR for Programmers, TE for Testers, AD for Admin MG for Marketing)");
		
		String inputCategoryName = MainMenu.ourScanner.nextLine();
		// TODO: CONTINUE WITH SWITCH

		switch (inputCategoryName) {
		case "MT":
			category = EnumCategory.MT;
			System.out.print("Years of experience:");
			int inputYearsOfExperience = MainMenu.ourScanner.nextInt();
			
			//CREATE A NEW MANAGEMENT PERSON
			CategoryManagement cm = new CategoryManagement(inputName, inputSalary, inputYearOfBirth, category, inputYearsOfExperience);
			employeeList.add(cm);
			System.out.println(cm);
			break;
		}

	}

	// METHOD FOR DELETING EMPLOYEES

	// THE NESTED CLASS INSIDE THIS CLASS EmployeeManagement
	class EmployeeUpdate {

	}// end class EmployeeUpdate

}
