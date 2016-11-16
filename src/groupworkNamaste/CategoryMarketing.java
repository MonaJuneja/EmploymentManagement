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
	public void bonusCalculation() {
		setBonus(noOfNewCustomers * 20);
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
