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
	
	
//	EmployeeDataBase.addEmployees();
//	XElissastestingMethods.printAdmin();
//	EmployeeManagement.enterEmployee();
//	
//	if (XElissastestingMethods.checkIfArrayIsEmpty()){
//		XElissastestingMethods.printArrayList();
//	} else {
//		System.out.println("The array is empty.");
//	}
	
//	//the main menu is the point of entry into our program
////	EmployeeDataBase.addEmployees();
////	XElissastestingMethods.printAdmin();
//	EmployeeManagement.enterEmployee();
//	
//	if (XElissastestingMethods.checkIfArrayIsEmpty()){
//		XElissastestingMethods.printArrayList();
//	} else {
//		System.out.println("The array is empty.");
//	}
//
	

//	CategoryProgrammer programmer= new CategoryProgrammer("Mona", 123456789.1,1986,"Programmer",456,45);
//	CategoryProgrammer programmer2= new CategoryProgrammer("Maria", 12345,1990,"Programmer",456,45);
//	CategoryTesters tester= new CategoryTesters("priya", 2, 11000, 14,"Radio", 100, 10, "Jenkins");
	//Admin admin= new Admin("sara", 3, 12000, 16,"humanResorce", 200 );
//	System.out.println(programmer.getCounterId());
//	System.out.println(programmer2.getCounterId());
//	System.out.println(programmer.getEmploymentId());
//	System.out.println(programmer2.getEmploymentId());
	
}
