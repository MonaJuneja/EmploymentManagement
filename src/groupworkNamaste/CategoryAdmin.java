package groupworkNamaste;

public class CategoryAdmin extends SuperClassEmployee {

	private int fixedValueBonus = 100;

	public CategoryAdmin(String name, double salary, int yearOfBirth, String department) {
		super(name, salary, yearOfBirth, department);
	}

	@Override
	public double bonusCalculation() {
		return 100;
	}

}
