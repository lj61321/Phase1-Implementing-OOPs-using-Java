import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* Program demonstrates the use of a class object named Employee
 * which I created and in which I have written and read data
 * to a file using ObjectOutputStream subclass
 */
public class EmployeeOutputWrite {
	public static void main(String[] args) {
		
		Employee employee = new Employee(1010, "Jacob", "Systems Analyst");
		
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream("empData"));
			stream.writeObject(employee);
			System.out.println("Writing employee object to empData file");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			 }
		}
		
	}
}
