import java.io.Serializable;

public class Employee implements Serializable {
	private int empID;
	private String empName;
	private String designation;
	
	//create constructor
	public Employee(int empID, String empName, String designation) {
		//super();
		this.empID = empID;
		this.empName = empName;
		this.designation = designation;
	}
	//generate setters and getters
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	//generate toString override
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", designation=" + designation + "]";
	}
	
	
	
}
