/* Program demonstrates the use of constructors within a class
 * such as StudentOvrride
 */
public class StudentOvrrideMain {
	public static void main(String[] args) {
		//Constructor using parameters
		StudentOvrride student2 = new StudentOvrride(20, "Jyoti", 'A', "ABC");
		//call using default constructor
		StudentOvrride student1 = new StudentOvrride();
		student1.setRollNo(10);
		student1.setName("Raymon");
		student1.setGrade('B');
		student1.setClgName("Roosevelt HS");
		//Use of String toString method to print outputs
		System.out.println(student1);
		System.out.println(student2);
	}
}

