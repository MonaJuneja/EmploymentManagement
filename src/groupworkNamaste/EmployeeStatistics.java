package groupworkNamaste;

public class EmployeeStatistics {

	private static double adminPercentage;
	private static double managementPercentage;
	private static double marketingPercentage;
	private static double programmerPercentage;
	private static double testerPercentage;

	// SUBMENU for statistics
	public static void subMenuStatistics() {
		boolean x = true; //boolean used to run/break loop

		// START CHOICE LOOP
		do {// USER MAKES A CHOICE OF FOLLOWING
			System.out.println("\n  *~^~*~^~*~^~*~^~*~^~*\n    SUBMENU STATISTICS\n  *~^~*~^~*~^~*~^~*~^~*");
			System.out.println("1 - Show total salary");
			System.out.println("2 - Show total bonus");
			System.out.println("3 - Show total wages (salary + bonus)");
			System.out.println("4 - Show average wages in company");
			System.out.println("5 - Find minimum salary");
			System.out.println("6 - Find maximum salary");
			System.out.println("7 - Print number of employees");
			System.out.println("8 - Print all data");
			System.out.println("9 - Print percentages of personell categories");
			System.out.println("10 - Exit the statistics menu");
			System.out.println("\nChoose acitivity by number ");
			int choice = MainMenu.ourScanner.nextInt();
			MainMenu.ourScanner.nextLine(); // EMPTY SCANNER

			switch (choice) {
			case 1:
				calculateTotalSalary();		
				break;

			case 2:
				calculateTotalBonus();
				break;

			case 3:
				calculateTotalWages();
				break;

			case 4:
				calculateAverageWage();
				break;

			case 5:
				findMinimumSalary();
				break;

			case 6:
				findMaximumSalary();
				break;

			case 7:
				printAll();
				break;

			case 8:
				EmployeeDataBase.printArrayList();
				break;
				
			case 9:
				printPercentages();
				break;
				
			case 10:
				x = false; // SET EXIT LOOP VALUE
				break;

			default:
				System.out.println("Ooops, please enter a number btw 1-3");
				break;

			} // END OF SWITCH

		} // END OF DO LOOP

		while (x);
		// END OF LOOP

	}

	//meethods to calculate size of arraylist, total and average salary, bonus, wage, minimum and maximum salary,
	public static void sizeOfArrayList() {
		System.out.println("Size of list: " + EmployeeManagement.employeeList.size());
	}

	// total
	public static double calculateTotalSalary() {
		double totalSalary = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			totalSalary += sce.getSalary();
		}
		System.out.println("Total salary is " + totalSalary);
		return totalSalary;
	}

	public static double calculateTotalBonus() {
		double totalBonus = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			sce.bonusCalculation();
			totalBonus += sce.getBonus();
		}
		System.out.println("Total bonus is " + totalBonus);
		return totalBonus;
	}

	public static double calculateTotalWages() {
		double totalWages = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			totalWages += sce.getSalary() + sce.getSalary();
			;
		}
		System.out.println("Total wages is " + totalWages);
		return totalWages;
	}

	public static double calculateAverageWage() {
		double totalWages = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			totalWages += sce.getSalary() + sce.getSalary();
			;
		}
		System.out.println("Average wage is " + totalWages / EmployeeManagement.employeeList.size());
		return totalWages;
	}

	public static double findMinimumSalary() {
		double min = 1000000000;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			if (sce.getSalary() < min) {
				min = sce.getSalary();
			}
		}
		System.out.println("The lowest salary is: " + min);
		return min;
	}

	public static double findMaximumSalary() {
		double max = 0;
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			if (sce.getSalary() > max) {
				max = sce.getSalary();
			}
		}
		System.out.println("The highest salary is: " + max);
		return max;
	}

	//methods used to print the number of employees in different categories
	public static void printAll() {
		System.out.println("The number of employees is " + SuperClassEmployee.getCounterId());
	}

	public static void printAdmin() {
		System.out.println("The number of employees in this category is " + CategoryAdmin.getCounterAdmin());
	}

	public static void printMgt() {
		System.out.println("The number of employees in this category is " + CategoryManagement.getCounterMgt());
	}

	public static void printMkt() {
		System.out.println("The number of employees in this category is " + CategoryMarketing.getCounterMkt());
	}

	public static void printPro() {
		System.out.println("The number of employees in this category is " + CategoryProgrammer.getCounterPro());
	}

	public static void printTst() {
		System.out.println("The number of employees in this category is " + CategoryTesters.getCounterTst());
	}

	//methods used to calculate percentages
	// TODO: integrate functionality
	
	
	
	public static void printPercentages() {
		System.out.println("The percentage of personnel that work in administration is " + ((double)CategoryAdmin.getCounterAdmin()/(double)SuperClassEmployee.getCounterId()*100) + "%");
		System.out.println("The percentage of personnel that work in management is " + ((double)CategoryManagement.getCounterMgt()/(double)SuperClassEmployee.getCounterId()*100) + "%");
		System.out.println("The percentage of personnel that work in marketing is " + ((double)CategoryMarketing.getCounterMkt()/(double)SuperClassEmployee.getCounterId()*100) + "%");
		System.out.println("The percentage of programmers in the company is " + ((double)CategoryProgrammer.getCounterPro()/(double)SuperClassEmployee.getCounterId()*100) + "%");
		System.out.println("The percentage of testers in the company is " + ((double)CategoryTesters.getCounterTst()/(double)SuperClassEmployee.getCounterId()*100) + "%");
		}
	
	public static double percentageAdmin() {
		double adminPercentage = ((double)CategoryAdmin.getCounterAdmin()/(double)SuperClassEmployee.getCounterId()*100);
		System.out.println("The percentage of personnel in administration is " + adminPercentage + "%");
		return adminPercentage;
	}
	
	public static double percentageManagement() {
		double managementPercentage = ((double)CategoryManagement.getCounterMgt()/(double)SuperClassEmployee.getCounterId()*100);
		System.out.println("The percentage of personnel in management is " + managementPercentage + "%");
		return managementPercentage;
	}
	
	public static double percentageMarketing() {
		double marketingPercentage = ((double)CategoryMarketing.getCounterMkt()/(double)SuperClassEmployee.getCounterId()*100);
		System.out.println("The percentage of personnel in marketing is " + marketingPercentage + "%");
		return marketingPercentage;
	}
	
	public static double percentageProgrammer() {
		double programmerPercentage = ((double)CategoryProgrammer.getCounterPro()/(double)SuperClassEmployee.getCounterId()*100);
		System.out.println("The percentage of programmers in the company is " + programmerPercentage + "%");
		return programmerPercentage;
	}
	
		public static double percentageTester() {
		double testerPercentage = ((double)CategoryTesters.getCounterTst()/(double)SuperClassEmployee.getCounterId()*100);
		System.out.println("The percentage of testers in the company is " + testerPercentage + "%");
		return testerPercentage;
	}
}
