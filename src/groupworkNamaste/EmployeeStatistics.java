package groupworkNamaste;

public class EmployeeStatistics {
	//average
	//maximum
	//minimum
	//percentages?
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