package groupworkNamaste;

public class CategoryTesters extends SuperClassEmployee {
	private static int counterTst = 0;
	private int tstId;
	int noOfTestedProjects;
	
		public CategoryTesters(String name, double salary, int yearOfBirth, EnumCategory category, int noOfTestedProjects) {
		super(name, salary, yearOfBirth, category);
		this.noOfTestedProjects = noOfTestedProjects;
		counterTst++;
		this.tstId = counterTst;
		}
		
	public int getYearOfExperince() {
		return noOfTestedProjects;
	}
	public void setYearOfExperince(int yearOfExperince) {
		this.noOfTestedProjects = yearOfExperince;
	}


	public double bonusCalculation(){
		double testerBonus = noOfTestedProjects * 150;
		return testerBonus;
	}

	public static int getCounterTst() {
		return counterTst;
	}
	
	

}
