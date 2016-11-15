package groupworkNamaste;

import java.util.ArrayList;



public class EmployeeManagement {

	// ArrayList of employees (includes all kinds of employees of all
	 static ArrayList<SuperClassEmployee> employeeList = new ArrayList<>();


	
	// METHOD FOR ADDING NEW EMPLOYEES
	public static void enterEmployee() {
		EnumCategory category;
		String inputName = ScannerMethods.scannerString("Please enter the data related to the new employee.\nName:");
		double inputSalary = ScannerMethods.scannerDouble("Salary:");
		int inputYearOfBirth = ScannerMethods.scannerInt("Year of birth:");
		String inputCategoryName = ScannerMethods.scannerString("Employee category: \n(MT for Management, PR for Programmers, TE for Testers, AD for Admin MG for Marketing)");
		
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
