package groupworkNamaste;

public class CategoryManagement extends SuperClassEmployee {
		//One of the five employee category subclasses 

	private static int counterMgt = 0;
	private int mgtId;
	
	private int yearsOfExperience;
	

	//CONSTRUCTOR
	public CategoryManagement(String name, double salary, int yearOfBirth, EnumCategory category, int yearsOfExperience) {
		super(name, salary, yearOfBirth, category);
		this.yearsOfExperience = yearsOfExperience;
		counterMgt++;
		this.mgtId = counterMgt;
	}

	@Override
	public void bonusCalculation() {
		setBonus(yearsOfExperience * 500);
		}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public static int getCounterMgt() {
		return counterMgt;
	}



}
