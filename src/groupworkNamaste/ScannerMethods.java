package groupworkNamaste;

// used to capture data in different parts of the program
public class ScannerMethods {

	// for capturing user input in format: String
	public static String scannerString(String printString){
		System.out.println(printString);
		String inputName = MainMenu.ourScanner.nextLine();
		MainMenu.ourScanner.nextLine();
		return inputName;
	}
	
	// for capturing user input in format: double
	public static double scannerDouble(String printString){
		System.out.println(printString);
		double inputDouble = MainMenu.ourScanner.nextDouble();
		MainMenu.ourScanner.nextLine();
		return inputDouble;
	}
	
	// for capturing user input in format: int
	public static int scannerInt(String printString){
		System.out.print(printString);
		int inputInt = MainMenu.ourScanner.nextInt();
		MainMenu.ourScanner.nextLine();
		return inputInt;
	}
	

	
//	System.out.print("Salary:");
//	double inputSalary = MainMenu.ourScanner.nextDouble();
//	System.out.print("Year of birth:");
//	int inputYearOfBirth = MainMenu.ourScanner.nextInt();
//	MainMenu.ourScanner.nextLine();
//	System.out.println(
//			"Employee category: \n(MT for Management, PR for Programmers, TE for Testers, AD for Admin MG for Marketing)");
//
//	String inputCategoryName = MainMenu.ourScanner.nextLine();
	// TODO: CONTINUE WITH SWITCH

}
