package groupworkNamaste;

// used to capture data in different parts of the program
public class ScannerMethods {

	// for capturing user input in format: String
	public static String scannerString(String printString){
		System.out.println(printString);
		String inputName = MainMenu.ourScanner.nextLine();
		return inputName;
	}
	
	// for capturing user input in format: double
	public static double scannerDouble(String printString){
		System.out.println(printString);
		double inputDouble = MainMenu.ourScanner.nextDouble();
		return inputDouble;
	}
	
	// for capturing user input in format: int
	//adding extra line to deal with scanner bug
	public static int scannerInt(String printString){
		System.out.print(printString);
		int inputInt = MainMenu.ourScanner.nextInt();
		MainMenu.ourScanner.nextLine(); //after capturing an "int" we need to clean the input by capturing the "enter" (scanner bug)
		return inputInt;
	}

}
