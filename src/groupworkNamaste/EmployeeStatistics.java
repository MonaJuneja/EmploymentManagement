package groupworkNamaste;

public class EmployeeStatistics {

	//percentages?
	
	// SUBMENU for statistics
	public static void subMenuStatistics() {
		boolean x = true;

		// START CHOICE LOOP
		do {// USER MAKES A CHOICE OF FOLLOWING
			System.out.println("  *~^~*~^~*~^~*~^~*~^~*\n    SUBMENU STATISTICS\n  *~^~*~^~*~^~*~^~*~^~*");
			System.out.println("1 - Show total salary");
			System.out.println("2 - Show total bonus");
			System.out.println("3 - Show total wages (salary + bonus)");
			System.out.println("4 - Show average wages in company");
			System.out.println("5 - Find minimum salary");
			System.out.println("6 - Find maximum salary");
			System.out.println("7 - Print number of employees");
			System.out.println("8 - Print all data");
			System.out.println("\nChoose acitivity by number ");
			int choice = MainMenu.ourScanner.nextInt();
			MainMenu.ourScanner.nextLine(); // EMPTY SCANNER

			switch (choice) {
			case 1:
				enterEmployee();
				x = false;
				break;

			case 2:
				String userInput = ScannerMethods.scannerString("Please enter the name of the employee you wish to remove from the system:");
				EmployeeDataBase.deleteEmployee(userInput);
				x = false;
				break;

			case 3:
				System.out.println("Work in progress expected to be implemented by Dec 2017");
				x = false;
				break;

			case 4:
				x = false; // SET EXIT LOOP VALUE
				// 1System.out.println("Thank U and bye bye!");
				break;
				
			case 5:
				x = false; // SET EXIT LOOP VALUE
				// 1System.out.println("Thank U and bye bye!");
				break;
				
			case 6:
				x = false; // SET EXIT LOOP VALUE
				// 1System.out.println("Thank U and bye bye!");
				break;
				
			case 7:
				x = false; // SET EXIT LOOP VALUE
				// 1System.out.println("Thank U and bye bye!");
				break;
				
			case 8:
				x = false; // SET EXIT LOOP VALUE
				// 1System.out.println("Thank U and bye bye!");
				break;

			default:
				System.out.println("Ooops, please enter a number btw 1-3");
				break;

			} // END OF SWITCH

		} // END OF DO LOOP

		while (x);
		// END OF LOOP

	}
	public static void sizeOfArrayList() {
		System.out.println("Size of list: " + EmployeeManagement.employeeList.size());
	}

	// total
	public static double calculateTotalSalary(){
		double totalSalary = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			totalSalary += sce.getSalary();
		}
		System.out.println("Total salary is " + totalSalary);
		return totalSalary;
	}
	
	
	public static double calculateTotalBonus(){
		double totalBonus = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			sce.bonusCalculation();
			totalBonus += sce.getBonus();
		}
		System.out.println("Total bonus is " + totalBonus);
		return totalBonus;
	}
	
	public static double calculateTotalWages(){
		double totalWages = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			totalWages += sce.getSalary() + sce.getSalary();;
		}
		System.out.println("Total wages is " + totalWages);
		return totalWages;
	}

	public static double calculateAverageWage(){
		double totalWages = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			totalWages += sce.getSalary() + sce.getSalary();;
		}
		System.out.println("Average wage is " + totalWages/EmployeeManagement.employeeList.size());
		return totalWages;
	}
	
	public static double findMinimumSalary(){
		double min = 1000000000;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			if (sce.getSalary()<min){
				min = sce.getSalary();				
			}
		}
		System.out.println(min);
		return min;	
	}
	
	public static double findMaximumSalary(){
		double max = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			if (sce.getSalary()>max){
				max = sce.getSalary();				
			}
		}
		System.out.println(max);
		return max;	
	}

	
	public static void printAll(){
		System.out.println(SuperClassEmployee.getCounterId());
		}
	
	public static void printAdmin(){
		System.out.println(CategoryAdmin.getCounterAdmin());
		}
	
	public static void printMgt(){
		System.out.println(CategoryManagement.getCounterMgt());
		}
	
	public static void printMkt(){
		System.out.println(CategoryMarketing.getCounterMkt());
		}
	
	public static void printPro(){
		System.out.println(CategoryProgrammer.getCounterPro());
		}
	
	public static void printTst(){
		System.out.println(CategoryTesters.getCounterTst());
		}
	
}