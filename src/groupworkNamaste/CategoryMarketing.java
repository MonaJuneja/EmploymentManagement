package groupworkNamaste;

public class CategoryMarketing extends SuperClassEmployee {
		//One of the five employee category subclasses 
	
	//these two variables keep track of how many employees belong to each category
	private static int counterMkt = 0;
	private int mktId;
	private int noOfNewCustomers;
	//last variable is used for bonus calculation

	//we register all variables that the superclass needs + one additional variable for the bonus calculation
	//the counter is tracked automatically - no user input necessary
	public CategoryMarketing(String name, double salary, int yearOfBirth, EnumCategory category, int noOfNewCustomers) {
		super(name, salary, yearOfBirth, category);
		this.noOfNewCustomers = noOfNewCustomers;
		counterMkt++;
		this.mktId = counterMkt;

	}

	@Override	//this method overrides the abstract method from the superclass
	public void bonusCalculation() {
		setBonus(noOfNewCustomers * 20);
		//setBonus is used to change the private variable in the super class
		}

	public int getNoOfNewCustomers() {
		return noOfNewCustomers;
	}

	public void setNoOfNewCustomers(int noOfNewCustomers) {
		this.noOfNewCustomers = noOfNewCustomers;
	}
	//this method is used when we need the number of personnel in this category
	public static int getCounterMkt() {
		return counterMkt;
	}

	
	
}
