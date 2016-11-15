package groupworkNamaste;

public class CategoryProgrammer extends SuperClassEmployee {
	private static int counterPro = 0;
	private int proId;
	int noOfCompletedProjects;

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

	@Override
	public double bonusCalculation() {
		double programmerBonus = noOfCompletedProjects * 300;
		return programmerBonus;
	}

	public static int getCounterPro() {
		return counterPro;
	}
	


}
