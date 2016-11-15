package groupworkNamaste;

public abstract class SuperClassEmployee {
	private String name;
	private double salary;
	private int yearOfBirth;
	private String department;
	private int employmentId;
	private static int counterId = 0;
//	private double bonus;
	

	public SuperClassEmployee(String name, double salary, int yearOfBirth, String department) {

		counterId++;
		this.employmentId = counterId;
		this.name = name;
		this.salary = salary;
		this.yearOfBirth = yearOfBirth;
		this.department = department;

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public abstract double bonusCalculation();


	public static int getCounterId() {
		return counterId;
	}

	public int getEmploymentId() {
		return employmentId;
	}




}
