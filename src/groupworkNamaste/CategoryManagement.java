package groupworkNamaste;

public class CategoryManagement extends SuperClassEmployee {
	private int yearsOfExperience;

	public CategoryManagement(String name, double salary, int yearOfBirth, String department, int yearsOfExperience) {
		super(name, salary, yearOfBirth, department);
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public double bonusCalculation() {
		double managementBonus = yearsOfExperience * 500;
		return managementBonus;
		}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

}
