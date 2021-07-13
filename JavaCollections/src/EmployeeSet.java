import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {
	public static void main(String[] args) {
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(10, "Smith", "Developer"));
		empSet.add(new Employee(80, "Jane", "Developer"));
		empSet.add(new Employee(25, "James", "Tester"));
		empSet.add(new Employee(300, "Mary", "Manager"));
		
		//generates random output since it is a HashSet
		for(Employee employee: empSet) {
			System.out.println(employee);
		}
		
		//a LinkedHashSet maintains entry order
		Set<Employee> empSet2 = new LinkedHashSet<>();
		empSet2.add(new Employee(10, "Smith", "Developer"));
		empSet2.add(new Employee(80, "Jane", "Developer"));
		empSet2.add(new Employee(25, "James", "Tester"));
		empSet2.add(new Employee(300, "Mary", "Manager"));
		
		System.out.println("-------------LinkedHashSet------------");
		for(Employee employee: empSet2) {
			System.out.println(employee);
		}
		
		//a TreeSet maintains entry order
		//note we had to create a class (EmployeeIDComparator) to specify
		//how we wanted to sequence our data
		//then by extending TreeSet<> we were able so sort the data
		//based on the empID
		Set<Employee> empSet3 = new TreeSet<>(new EmployeeIDComparator());
		empSet3.add(new Employee(10, "Smith", "Developer"));
		empSet3.add(new Employee(80, "Jane", "Developer"));
		empSet3.add(new Employee(25, "James", "Tester"));
		empSet3.add(new Employee(300, "Mary", "Manager"));
		
		System.out.println("-------------TreeSet ID Comparator------------");
		for(Employee employee: empSet3) {
			System.out.println(employee);
		}
		
		//now we will also compare the EmpName
		Set<Employee> empSet4 = new TreeSet<>(new EmployeeNameComparator());
		empSet4.add(new Employee(10, "Smith", "Developer"));
		empSet4.add(new Employee(80, "Jane", "Developer"));
		empSet4.add(new Employee(25, "James", "Tester"));
		empSet4.add(new Employee(300, "Mary", "Manager"));
		
		System.out.println("-------------TreeSet Name Comparator------------");
		for(Employee employee: empSet4) {
			System.out.println(employee);
		}
	}
}
