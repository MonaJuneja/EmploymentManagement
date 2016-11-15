package groupworkNamaste;

public class CategoryMarketing extends SuperClassEmployee {

	private int noOfNewCustomers;

	public CategoryMarketing(String name, double salary, int yearOfBirth, String department, int noOfNewCustomers) {
		super(name, salary, yearOfBirth, department);
		this.noOfNewCustomers = noOfNewCustomers;

	}

	@Override
	public double bonusCalculation() {
		double marketingBonus = noOfNewCustomers * 20;
		return marketingBonus;
	}

	public int getNoOfNewCustomers() {
		return noOfNewCustomers;
	}

	public void setNoOfNewCustomers(int noOfNewCustomers) {
		this.noOfNewCustomers = noOfNewCustomers;
	}

	
	
}
