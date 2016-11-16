package groupworkNamaste;

import java.util.ArrayList;



public class EmployeeManagement {

	// ArrayList of employees (includes all kinds of employees of all
	 static ArrayList<SuperClassEmployee> employeeList = new ArrayList<>();


	
	// METHOD FOR ADDING NEW EMPLOYEES
	 //To add a new employee you first need to capture all the data needed to enter the employee
	 //Basically it's the data you need for the constructors in the super and base classes
	public static void enterEmployee() {
		EnumCategory category;
		String inputName = ScannerMethods.scannerString("Please enter the data related to the new employee.\nName:");
		double inputSalary = ScannerMethods.scannerDouble("Salary:");
		int inputYearOfBirth = ScannerMethods.scannerInt("Year of birth:");
		//TODO: try-catch if/switch for incorrect input
		//TODO: if statement with logical OR || to check values
		do{		
		
		String inputCategoryName = ScannerMethods.scannerString("Employee category: \n(MT for Management, PR for Programmers, TE for Testers, AD for Admin MG for Marketing)");
		
		// TODO: CONTINUE WITH SWITCH
		//TODO: ask Bardia for breaking loop and tagging loop and so on
//(MT for Management, PR for Programmers, TE for Testers, AD for Admin MG for Marketing)");
		
		switch (inputCategoryName) {
		case "MT":
			category = EnumCategory.MT;
			int inputYearsOfExperience = ScannerMethods.scannerInt("Years of experience:");
			
			//CREATE A NEW MANAGEMENT PERSON
			CategoryManagement cm = new CategoryManagement(inputName, inputSalary, inputYearOfBirth, category, inputYearsOfExperience);
			employeeList.add(cm);
			break;
			
		case "PR":
			category = EnumCategory.PR;
			int noOfCompletedProjects = ScannerMethods.scannerInt("Number of programs completed:");
			
			//Enter a new programmer into the employee program
			CategoryProgrammer cp = new CategoryProgrammer(inputName, inputSalary, inputYearOfBirth, category, noOfCompletedProjects);
			employeeList.add(cp);
			break;
			
		case "TE":
			category = EnumCategory.TE;
			int noOfTestedProjects = ScannerMethods.scannerInt("Number of programs tested:");
			
			//Enter a new tester into the employee program
			CategoryTesters ct = new CategoryTesters(inputName, inputSalary, inputYearOfBirth, category, noOfTestedProjects);
			employeeList.add(ct);
			break;
			
		case "AD":
			category = EnumCategory.AD;
			//bonus is fixed value for admin so no extra input necessary
				
			//Enter a new tester into the employee program
			CategoryAdmin ca = new CategoryAdmin(inputName, inputSalary, inputYearOfBirth, category);
			employeeList.add(ca);
			break;
			
		case "MG":
			category = EnumCategory.MG;
			int noOfNewCustomers = ScannerMethods.scannerInt("Number of programs tested:");
			
			//Enter a new tester into the employee program
			CategoryMarketing cg = new CategoryMarketing(inputName, inputSalary, inputYearOfBirth, category, noOfNewCustomers);
			employeeList.add(cg);
			break;
			
		default:
			System.out.println("Invalid input, please enter a valid choice.");
			continue;		
			}

			//going back into loop
		
		}while(true);
			
	}

	// METHOD FOR DELETING EMPLOYEES

	// THE NESTED CLASS INSIDE THIS CLASS EmployeeManagement
	class EmployeeUpdate {

	}// end class EmployeeUpdate

}
