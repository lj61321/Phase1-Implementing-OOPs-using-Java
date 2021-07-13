
public class StudentOvrride {
	private String name;
	private char grade;
	private String clgName;
	private int rollNo;
	
	
	public StudentOvrride(int rollNo, String name, char grade, String clgName) {
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.clgName = clgName;
	}
	
	public StudentOvrride() {
		
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + ", clgName=" + clgName + "]";
	}
	
}

