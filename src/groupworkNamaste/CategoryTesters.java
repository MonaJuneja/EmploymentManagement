package groupworkNamaste;

public class CategoryTesters extends SuperClassEmployee {
		//One of the five employee category subclasses 

	//these two variables keep track of how many employees belong to each category
	private static int counterTst = 0;
	private int tstId;
	int noOfTestedProjects;
	//last variable is used for bonus calculation
	
	//we register all variables that the superclass needs + one additional variable for the bonus calculation
	//the counter is tracked automatically - no user input necessary
	public CategoryTesters(String name, double salary, int yearOfBirth, EnumCategory category, int noOfTestedProjects) {
	 	super(name, salary, yearOfBirth, category); //all these variables are required by and sent to the super class
		this.noOfTestedProjects = noOfTestedProjects; //additional variable necessary for the bonus calculatione
		counterTst++;
		this.tstId = counterTst;
		}
		
	public int getYearOfExperince() {
		return noOfTestedProjects;
	}
	public void setYearOfExperince(int yearOfExperince) {
		this.noOfTestedProjects = yearOfExperince;
	}

	@Override	//this method overrides the abstract method from the superclass
	public void bonusCalculation(){
		setBonus(noOfTestedProjects * 150);
		//setBonus is used to change the private variable in the super class
	}

	//this method is used when we need the number of personnel in this category
	public static int getCounterTst() {
		return counterTst;
	}
	
	

}
