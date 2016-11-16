package groupworkNamaste;

public class XElissaTestingMain {

	public static void main(String[] args) {

		EmployeeStatistics.sizeOfArrayList();
		EmployeeStatistics.calculateTotalSalary();
		EmployeeStatistics.calculateTotalBonus();
		EmployeeStatistics.calculateTotalWages();
		EmployeeStatistics.calculateAverageWage();
		
		
//		EmployeeStatistics.sizeOfArrayList();
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
