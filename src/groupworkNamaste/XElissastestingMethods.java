package groupworkNamaste;

public class XElissastestingMethods {

	public static void printArrayList() {
		for (SuperClassEmployee IndexPosition : EmployeeManagement.employeeList) {
			System.out.println(IndexPosition);
		}
	}
	
	public static boolean checkIfArrayIsEmpty(){
		if (EmployeeManagement.employeeList.size() != 0){
			return true;
		} return false;
	}

}
