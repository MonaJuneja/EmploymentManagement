package groupworkNamaste;

public abstract class SuperClassEmployee {

	private String name;
	private double salary;
	private int yearOfBirth;
	private EnumCategory category;
	private int employmentId;
	private static int counterId = 0;
	private double bonus;
	
	//CONSTRUCTOR
	public SuperClassEmployee(String name, double salary, int yearOfBirth, EnumCategory category) {

		counterId++;
		this.employmentId = counterId;
		this.name = name;
		this.salary = salary;
		this.yearOfBirth = yearOfBirth;
		this.category = category;
	}

	//ABSTRACT METHOD - enforcing every subclass to implement this method 
	public abstract void bonusCalculation();
	
	
	@Override
	public String toString() {
		return "[name=" + name + ", salary=" + salary + ", yearOfBirth=" + yearOfBirth
				+ ", category=" + category + ", employmentId=" + employmentId + "]";
	}
	
	//GETTERS AND SETTERS
	public EnumCategory getCategory() {
		return category;
	}

	public void setCategory(EnumCategory category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public int getemploymentId() {
		return getEmploymentId();
	}

	public int getPersonelNumber() {
		return yearOfBirth;
	}

	public static int getCounterId() {
		return counterId;
	}

	public int getEmploymentId() {
		return employmentId;
	}

	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getSalary() {
		return salary;
	}



}
