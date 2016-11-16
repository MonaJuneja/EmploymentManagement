package groupworkNamaste;
import java.util.ArrayList;

public class EmployeeManagement {
	// ArrayList of employees (includes all kinds of employees of all
	 static ArrayList<SuperClassEmployee> employeeList = new ArrayList<>();

	//SUBMENU
	 public static void subMenu(){
		 boolean x = true;
		 
//   START CHOICE LOOP 
		do {// USER MAKES A CHOICE OF FOLLOWING
			System.out.println("  *~^~*~^~*~^~*~^~*~^~*\n    SUBMENU MANAGEMENT\n  *~^~*~^~*~^~*~^~*~^~*");
			System.out.println("1 - Add a new employee");
			System.out.println("2 - Delete an employee");
			System.out.println("3 - Update an employee");
			System.out.println("4 - Exit the management menu");
			System.out.println("\nChoose acitivity by number ");
			int choice = MainMenu.ourScanner.nextInt();
			MainMenu.ourScanner.nextLine(); // EMPTY SCANNER

			switch (choice) {
			case 1:
				enterEmployee();
				break;

			case 2:
				System.out.println("Delete to come");
				break;
			
			case 3:
				System.out.println("Update to come");
				break;

			case 4:
				x = false; // SET EXIT LOOP VALUE
				//1System.out.println("Thank U and bye bye!");
				break;

			default:
				System.out.println("Ooops, please enter a number btw 1-3");
				break;

			} // END OF SWITCH

		} // END OF DO LOOP

		while (x);
		// END OF LOOP
	 
	 }
	 

	 
	// METHOD FOR ADDING NEW EMPLOYEES
	 //To add a new employee you first need to capture all the data needed to enter the employee
	 //Basically it's the data you need for the constructors in the super and base classes 
	public static void enterEmployee() {
			//>>>>>>> branch 'master' of https://github.com/MonaJuneja/EmploymentManagement.git
		EnumCategory category;
		String inputName = ScannerMethods.scannerString("Please enter the data related to the new employee.\nName: ");
		double inputSalary = ScannerMethods.scannerDouble("Salary: ");
		int inputYearOfBirth = ScannerMethods.scannerInt("Year of birth: ");
		//TODO: try-catch if/switch for incorrect input
		//TODO: if statement with logical OR || to check values
		boolean x = true;
		do{		
		
		String inputCategoryName = ScannerMethods.scannerString("Choose employee category; \n(MT) Management, (PR) Programmers, (TE) Testers, (AD) Admin, (MG) Marketing \nEmployee category:");
		
		// TODO: CONTINUE WITH SWITCH
		//TODO: ask Bardia for breaking loop and tagging loop and so on
//(MT for Management, PR for Programmers, TE for Testers, AD for Admin MG for Marketing)");
		
		switch (inputCategoryName) {
		case "MT":
			category = EnumCategory.MT;
			int inputYearsOfExperience = ScannerMethods.scannerInt("Years of experience: ");			
			//CREATE A NEW MANAGEMENT PERSON
			CategoryManagement cm = new CategoryManagement(inputName, inputSalary, inputYearOfBirth, category, inputYearsOfExperience);
			employeeList.add(cm);
			x=false;
			break;
			
		case "PR":
			category = EnumCategory.PR;
			int noOfCompletedProjects = ScannerMethods.scannerInt("Number of programs completed: ");		
			//Enter a new programmer into the employee program
			CategoryProgrammer cp = new CategoryProgrammer(inputName, inputSalary, inputYearOfBirth, category, noOfCompletedProjects);
			employeeList.add(cp);
			x=false;
			break;
			
		case "TE":
			category = EnumCategory.TE;
			int noOfTestedProjects = ScannerMethods.scannerInt("Number of programs tested: ");			
			//Enter a new tester into the employee program
			CategoryTesters ct = new CategoryTesters(inputName, inputSalary, inputYearOfBirth, category, noOfTestedProjects);
			employeeList.add(ct);
			x=false;
			break;
			
		case "AD":
			category = EnumCategory.AD;
			//bonus is fixed value for admin so no extra input necessary				
			//Enter a new tester into the employee program
			CategoryAdmin ca = new CategoryAdmin(inputName, inputSalary, inputYearOfBirth, category);
			employeeList.add(ca);
			x=false;
			break;
			
		case "MG":
			category = EnumCategory.MG;
			int noOfNewCustomers = ScannerMethods.scannerInt("Number of programs tested: ");			
			//Enter a new tester into the employee program
			CategoryMarketing cg = new CategoryMarketing(inputName, inputSalary, inputYearOfBirth, category, noOfNewCustomers);
			employeeList.add(cg);
			x=false;
			break;
			
		default:
			System.out.println("Invalid input, please enter a valid choice.");
			continue;		
			}

			//going back into loop
		
		}while(x);
		System.out.print("\n*** "+employeeList.get(SuperClassEmployee.getCounterId()-1).getName()+" is now added. ***\n\n");
		
// CHECKING LAST ADDED EMPLOYEE
//		System.out.print("\nRecently added employee" + employeeList.get(SuperClassEmployee.getCounterId()-1).getemploymentId());
//		System.out.print(" , "+employeeList.get(SuperClassEmployee.getCounterId()-1).getName());
//		System.out.println(" , "+employeeList.get(SuperClassEmployee.getCounterId()-1).getSalary());
		
	}//END METHOD

	// METHOD FOR DELETING EMPLOYEES

	// THE NESTED CLASS INSIDE THIS CLASS EmployeeManagement
	class EmployeeUpdate {

	}// end class EmployeeUpdate

}