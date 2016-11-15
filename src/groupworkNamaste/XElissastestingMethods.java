package groupworkNamaste;

public class XElissastestingMethods {

	public void printArrayList() {
		for (SuperClassEmployee IndexPosition : EmployeeManagement.employeeList) {
			System.out.println(IndexPosition);
		}
	}
	
	public boolean checkIfArrayIsEmpty(){
		if (EmployeeManagement.employeeList.size() == 0){
			return true;
		} return false;
	}

}
