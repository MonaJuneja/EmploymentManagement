package groupworkNamaste;

public class CategoryProgrammer extends SuperClassEmployee {
		//One of the five employee category subclasses 
	
	//these two variables keep track of how many employees belong to each category
	private static int counterPro = 0;
	private int proId;
	int noOfCompletedProjects;
	//last variable is used for bonus calculation

	//we register all variables that the superclass needs + one additional variable for the bonus calculation
	//the counter is tracked automatically - no user input necessary
	public CategoryProgrammer(String name, double salary, int yearOfBirth, EnumCategory category, 
			int noOfCompletedProjects) {
		super(name, salary, yearOfBirth, category);
		this.noOfCompletedProjects = noOfCompletedProjects;
		counterPro++;
		this.proId = counterPro;
	}

	public int getNoOfCompletedProjects() {
		return noOfCompletedProjects;
	}

	public void setNoOfCompletedProjects(int noOfCompletedProjects) {
		this.noOfCompletedProjects = noOfCompletedProjects;
	}

	@Override	//this method overrides the abstract method from the superclass
	public void bonusCalculation() {
		setBonus(noOfCompletedProjects * 300);
		//setBonus is used to change the private variable in the super class
	}

	//this method is used when we need the number of personnel in this category
	public static int getCounterPro() {
		return counterPro;
	}
	


}
