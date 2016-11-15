package groupworkNamaste;

public class CategoryProgrammer extends SuperClassEmployee {
	int noOfCompletedProjects;

	public CategoryProgrammer(String name, double salary, int yearOfBirth, EnumCategory category, 
			int noOfCompletedProjects) {
		super(name, salary, yearOfBirth, category);
		this.noOfCompletedProjects = noOfCompletedProjects;
	}

	public int getNoOfCompletedProjects() {
		return noOfCompletedProjects;
	}

	public void setNoOfCompletedProjects(int noOfCompletedProjects) {
		this.noOfCompletedProjects = noOfCompletedProjects;
	}

	@Override
	public double bonusCalculation() {
		double programmerBonus = noOfCompletedProjects * 300;
		return programmerBonus;
	}
	


}
