package groupworkNamaste;

public class EmployeeStatistics {
	//average
	//maximum
	//minimum
	//percentages?
	public static void sizeOfArrayList() {
		EmployeeDataBase.employeesDataBase();
		System.out.println("Size of list: " + EmployeeManagement.employeeList.size());
	}

	// total
	public static double calculateTotalSalary(){
		double totalSalary = 0;
		for (SuperClassEmployee IndexPosition : EmployeeManagement.employeeList) {
			totalSalary += IndexPosition.getSalary();
		}
		System.out.println("Total salary is " + totalSalary);
		return totalSalary;
	}
	
	public static double calculateTotalBonus(){
		double totalBonus = 0;
		for (SuperClassEmployee indexPosition : EmployeeManagement.employeeList) {
			indexPosition.bonusCalculation();
			totalBonus += indexPosition.getBonus();
		}
		System.out.println("Total bonus is " + totalBonus);
		return totalBonus;
	}
	
	public static double calculateTotalWages(){
		double totalWages = 0;
		for (SuperClassEmployee IndexPosition : EmployeeManagement.employeeList) {
			totalWages += IndexPosition.getSalary() + IndexPosition.getSalary();;
		}
		System.out.println("Total wages is " + totalWages);
		return totalWages;
	}

	public static double calculateAverageWage(){
		double totalWages = 0;
		for (SuperClassEmployee IndexPosition : EmployeeManagement.employeeList) {
			totalWages += IndexPosition.getSalary() + IndexPosition.getSalary();;
		}
		System.out.println("Average wage is " + totalWages/EmployeeManagement.employeeList.size());
		return totalWages;
	}
	
}