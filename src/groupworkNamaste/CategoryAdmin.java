package groupworkNamaste;

public class CategoryAdmin extends SuperClassEmployee {
	//One of the five employee category subclasses 

	//these two variables keep track of how many employees belong to each category
	private static int counterAdmin = 0;
	private int adminId; 

	//people that work in administration receive a fixed, not a variable, bonus
	private int fixedValueBonus = 100;

	//for admin we need to register only the four variables that the superclass needs
	//since the bonus is fixed value there is no need for extra input for the bonus calculation method
	public CategoryAdmin(String name, double salary, int yearOfBirth, EnumCategory category) {
		super(name, salary, yearOfBirth, category);
		counterAdmin++;
		this.adminId = counterAdmin;
	}

	@Override
	public void bonusCalculation() {
		setBonus(100);	
	}
	
	public static int getCounterAdmin() {
		return counterAdmin;
	}


}
