import java.util.Comparator;

public class EmployeeIDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		Integer empId1 = emp1.getEmpID();
		Integer empId2 = emp2.getEmpID();
		return empId1.compareTo(empId2);
	}
	
}
