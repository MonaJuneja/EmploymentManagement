package groupworkNamaste;

public class CategoryManagement extends SuperClassEmployee {
		//One of the five employee category subclasses 
	
	//these two variables keep track of how many employees belong to each category
	private static int counterMgt = 0;
	private int mgtId;
	private int yearsOfExperience;
	//last variable is used for bonus calculation
	

	//CONSTRUCTOR
	//we register all variables that the superclass needs + one additional variable for the bonus calculation
	//the counter is tracked automatically - no user input necessary
	public CategoryManagement(String name, double salary, int yearOfBirth, EnumCategory category, int yearsOfExperience) {
		super(name, salary, yearOfBirth, category);
		this.yearsOfExperience = yearsOfExperience;
		counterMgt++;
		this.mgtId = counterMgt;
	}

	@Override	//this method overrides the abstract method from the superclass
	public void bonusCalculation() {
		setBonus(yearsOfExperience * 100);
		//setBonus is used to change the private variable in the super class
		}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	//this method is used when we need the number of personnel in this category
	public static int getCounterMgt() {
		return counterMgt;
	}
}
