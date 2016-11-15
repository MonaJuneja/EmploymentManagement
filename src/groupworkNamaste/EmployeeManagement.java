package groupworkNamaste;

import java.util.ArrayList;
 
public class EmployeeManagement {

	
	 //ArrayList of employees (includes all kinds of employees of all categories)
	ArrayList<SuperClassEmployee> employeeList = new ArrayList<>();
	

   
   //METHOD FOR ADDING NEW EMPLOYEES
	
	public void enterEmployee(){
		System.out.print("Please enter the data related to the new employee.\n"
				+ "Name:");
		String inputName = MainMenu.ourScanner.nextLine();
		System.out.print("Salary:");
		double inputSalary = MainMenu.ourScanner.nextDouble();
		System.out.print("Year of birth:");
		int inputYearOfBirth = MainMenu.ourScanner.nextInt();
		System.out.print("Category (1 for Management, 2 for Programmers, 3 for Testers, 4 for Admin 5 for Marketing)");
		int inputCategoryName = MainMenu.ourScanner.nextInt();
		
		//TODO: CONTINUE WITH SWITCH
		
		switch(inputCategoryName){
			case 1: System.out.print("Years of experience:");
				int inputYearsOfExperience = MainMenu.ourScanner.nextInt();
				CategoryManagement cm = new CategoryManagement(inputName, inputSalary, inputYearOfBirth, inputCategoryName, inputYearsOfExperience);
				employeeList.add(cm);
				break;
		}
		
	}
	
   
   //METHOD FOR DELETING EMPLOYEES
   
   
   //THE NESTED CLASS INSIDE THIS CLASS EmployeeManagement
   class EmployeeUpdate {
       
       
   }//end class EmployeeUpdate

   
   
   
}
