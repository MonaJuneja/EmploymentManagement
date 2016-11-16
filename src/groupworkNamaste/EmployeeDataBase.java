package groupworkNamaste;

public class EmployeeDataBase {
	
	public static void deleteEmployee(String employeeName){
		EmployeeManagement.employeeList.remove(findEmployee(employeeName));
	}
	
	public static SuperClassEmployee findEmployee(String wantedName){
		for (SuperClassEmployee sce : EmployeeManagement.employeeList) {
			if (sce.getName().equals(wantedName)){
//				System.out.println(sce);
//				System.out.println(sce.getName());
				return sce;
			}
		} return null;
		
	}

	public static void printArrayList() {
		for (SuperClassEmployee IndexPosition : EmployeeManagement.employeeList) {
			System.out.println(IndexPosition);
		}
	}
	public static void employeesDataBase() {

		// category management employees
		CategoryManagement cm1 = new CategoryManagement("Monika", 56789, 1986, EnumCategory.MT, 23);
		EmployeeManagement.employeeList.add(cm1);

		// category programmer employees
		CategoryProgrammer cp1 = new CategoryProgrammer("Amanda", 58789, 1986, EnumCategory.PR, 56);
		EmployeeManagement.employeeList.add(cp1);
		CategoryProgrammer cp2 = new CategoryProgrammer("Parisa", 59789, 1986, EnumCategory.PR, 56);
		EmployeeManagement.employeeList.add(cp2);
		CategoryProgrammer cp3 = new CategoryProgrammer("Nina", 60789, 1986, EnumCategory.PR, 56);
		EmployeeManagement.employeeList.add(cp3);
		CategoryProgrammer cp4 = new CategoryProgrammer("Emmi", 61789, 1986, EnumCategory.PR, 56);
		EmployeeManagement.employeeList.add(cp4);
		CategoryProgrammer cp5 = new CategoryProgrammer("Elissa", 80000, 1986, EnumCategory.PR, 100);
		EmployeeManagement.employeeList.add(cp5);
		CategoryProgrammer cp6 = new CategoryProgrammer("Mona", 80000, 1986, EnumCategory.PR, 100);
		EmployeeManagement.employeeList.add(cp6);
		CategoryProgrammer cp7 = new CategoryProgrammer("Stella", 76789, 1986, EnumCategory.PR, 56);
		EmployeeManagement.employeeList.add(cp7);
		CategoryProgrammer cp8 = new CategoryProgrammer("AnnSofie", 80000, 1986, EnumCategory.PR, 100);
		EmployeeManagement.employeeList.add(cp8);
		CategoryProgrammer cp9 = new CategoryProgrammer("Maria", 80000, 1986, EnumCategory.PR, 100);
		EmployeeManagement.employeeList.add(cp9);
		CategoryProgrammer cp10 = new CategoryProgrammer("Alma", 57789, 1986, EnumCategory.PR, 56);
		EmployeeManagement.employeeList.add(cp10);
		CategoryProgrammer cp11 = new CategoryProgrammer("Viola", 57789, 1986, EnumCategory.PR, 56);
		EmployeeManagement.employeeList.add(cp11);
		CategoryProgrammer cp12 = new CategoryProgrammer("Bita", 80000, 1986, EnumCategory.PR, 100);
		EmployeeManagement.employeeList.add(cp12);
		
		
		

		// category tester employees
		CategoryTesters ct1 = new CategoryTesters("Elis", 25000, 1979, EnumCategory.TE, 78);
		EmployeeManagement.employeeList.add(ct1);
		CategoryTesters ct2 = new CategoryTesters("Sara", 26430, 1979, EnumCategory.TE, 85);
		EmployeeManagement.employeeList.add(ct2);
		CategoryTesters ct3 = new CategoryTesters("Johanna", 30000, 1979, EnumCategory.TE, 73);
		EmployeeManagement.employeeList.add(ct3);
		CategoryTesters ct4 = new CategoryTesters("Diya", 28500, 1979, EnumCategory.TE, 62);
		EmployeeManagement.employeeList.add(ct4);
		CategoryTesters ct5 = new CategoryTesters("Hema", 27000, 1979, EnumCategory.TE, 89);
		EmployeeManagement.employeeList.add(ct5);

		// category admin employees
		CategoryAdmin ca1 = new CategoryAdmin("Mark", 12000, 1990, EnumCategory.AD);
		EmployeeManagement.employeeList.add(ca1);
		CategoryAdmin ca2 = new CategoryAdmin("Marko", 15000, 1980, EnumCategory.AD);
		EmployeeManagement.employeeList.add(ca2);
		CategoryAdmin ca3 = new CategoryAdmin("Addo", 18000, 1983, EnumCategory.AD);
		EmployeeManagement.employeeList.add(ca3);
		CategoryAdmin ca4 = new CategoryAdmin("David", 14000, 1985, EnumCategory.AD);
		EmployeeManagement.employeeList.add(ca4);

		// category marketing employees
		CategoryMarketing cg1 = new CategoryMarketing("Elis", 40000, 456, EnumCategory.MG, 8900);
		EmployeeManagement.employeeList.add(cg1);
		CategoryMarketing cg2 = new CategoryMarketing("Mary", 45000, 1978, EnumCategory.MG, 8800);
		EmployeeManagement.employeeList.add(cg2);
		CategoryMarketing cg3 = new CategoryMarketing("Mariya", 42500, 1988, EnumCategory.MG, 4500);
		EmployeeManagement.employeeList.add(cg3);

	}
}