package groupworkNamaste;

public class CategoryTesters extends SuperClassEmployee {
	int noOfTestedProjects;
	
		public CategoryTesters(String name, double salary, int yearOfBirth, String department, int noOfTestedProjects) {
		super(name, salary, yearOfBirth, department);
		this.noOfTestedProjects = noOfTestedProjects;
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
	
	

}
