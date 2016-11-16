package groupworkNamaste;

public abstract class SuperClassEmployee {

	//variables used to keep track of employees in personnel system
	private String name;
	private double salary;
	private int yearOfBirth;
	private EnumCategory category;
	private int employmentId;
	//tracker to keep track of number of employees
	private static int counterId = 0;
	//variable used for the bonus calculations
	private double bonus;
	
	//CONSTRUCTOR
	//all these variables are common to all personnel categories
	//user needs to input all but counter
	//data will be handled by super class as indicated in the constructor
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
	
	//overriding toString method
	@Override
	public String toString() {
		return "[name=" + name + ", salary=" + salary + ", yearOfBirth=" + yearOfBirth
				+ ", category=" + category + ", employmentId=" + employmentId + "]";
	}
	//TODO: få fram employment ID
	
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

	public double getSalary(){
		return salary;
	}
	
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}




}
