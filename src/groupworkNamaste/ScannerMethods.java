package groupworkNamaste;

public class ScannerMethods {

	public static String scannerString(String printString){
		System.out.print(printString);
		String inputName = MainMenu.ourScanner.nextLine();
		System.out.println();
		return inputName;
	}
	
	public static int scannerInt(String printString){
		System.out.print(printString);
		int inputInt = MainMenu.ourScanner.nextInt();
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
