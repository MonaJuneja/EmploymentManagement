package groupworkNamaste;

import java.util.Scanner;

public class MainMenu {

	public static Scanner ourScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//the main menu is the point of entry into our program
//		EmployeeDataBase.addEmployees();
//		XElissastestingMethods.printAdmin();
		EmployeeManagement.enterEmployee();
		
		if (XElissastestingMethods.checkIfArrayIsEmpty()){
			XElissastestingMethods.printArrayList();
		} else {
			System.out.println("The array is empty.");
		}
		
		ourScanner.close();
		}

}


