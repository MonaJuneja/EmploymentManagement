package groupworkNamaste;

public class EmployeeDataBase {

	public static void addEmployees() {

		CategoryManagement cm1 = new CategoryManagement("Mona", 456789, 1986, EnumCategory.MT, 23);
		EmployeeManagement.employeeList.add(cm1);

		CategoryProgrammer cp1 = new CategoryProgrammer("Mina", 456789, 1986, EnumCategory.MT, 56);
		EmployeeManagement.employeeList.add(cp1);

//		CategoryTesters ct = new CategoryTesters(inputName, inputSalary, inputYearOfBirth, category,
//				noOfTestedProjects);
//		(inputName, inputSalary, inputYearOfBirth, category,
//				noOfTestedProjects);
//		employeeList.add(ct);

		// CategoryAdmin ca = new CategoryAdmin(inputName, inputSalary,
		// inputYearOfBirth, category);
		// employeeList.add(ca);
		// CategoryMarketing cg = new CategoryMarketing(inputName, inputSalary,
		// inputYearOfBirth, category, noOfNewCustomers);
		// employeeList.add(ca);
		//
	}
}