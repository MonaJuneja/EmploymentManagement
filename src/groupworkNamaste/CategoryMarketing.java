package groupworkNamaste;

public class CategoryMarketing extends SuperClassEmployee {
	private static int counterMkt = 0;
	private int mktId;
	private int noOfNewCustomers;

	public CategoryMarketing(String name, double salary, int yearOfBirth, EnumCategory category, int noOfNewCustomers) {
		super(name, salary, yearOfBirth, category);
		this.noOfNewCustomers = noOfNewCustomers;
		counterMkt++;
		this.mktId = counterMkt;

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

	public static int getCounterMkt() {
		return counterMkt;
	}

	
	
}
