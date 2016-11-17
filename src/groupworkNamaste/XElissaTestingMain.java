package groupworkNamaste;

public class XElissaTestingMain {

	public static void main(String[] args) {

		EmployeeDataBase.employeesDataBase(); //create list
//		EmployeeStatistics.sizeOfArrayList(); 
		
//		EmployeeStatistics.findMinimumSalary();
//		EmployeeStatistics.findMaximumSalary();
//			
//		EmployeeStatistics.sizeOfArrayList();
//		EmployeeStatistics.printAll();
//		EmployeeStatistics.printMkt();
//		
//		XElissastestingMethods.printArrayList();
//		SuperClassEmployee a = EmployeeDataBase.findEmployee("Mona");
//		System.out.println(a);
//		System.out.println("sssssssssssssss");
//		EmployeeStatistics.sizeOfArrayList();
//		EmployeeDataBase.deleteEmployee("Emmi");
//		EmployeeStatistics.sizeOfArrayList();
//		
//		EmployeeStatistics.calculateTotalSalary();
//		EmployeeStatistics.calculateTotalBonus();
//		EmployeeStatistics.calculateTotalWages();
//		EmployeeStatistics.calculateAverageWage();
//		EmployeeStatistics.sizeOfArrayList();
		
		EmployeeStatistics.printPercentages();
		EmployeeStatistics.percentageAdmin();
		
		
//		EmployeeDataBase.deleteEmployee("Nina");
//		EmployeeStatistics.sizeOfArrayList();

		// System.out.println(EmployeeManagement.enterEmployee());

		// XElissastestingMethods.printArrayList();

	}

	public static void deleteEmployee(String employeeName) {
		EmployeeDataBase.findEmployee("wantedName");
		EmployeeManagement.employeeList.remove("wantedName");
	}

}
