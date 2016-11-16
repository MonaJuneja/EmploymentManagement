package groupworkNamaste;

public class CategoryAdmin extends SuperClassEmployee {

	private static int counterAdmin = 0;
	private int adminId;

	private int fixedValueBonus = 100;

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
