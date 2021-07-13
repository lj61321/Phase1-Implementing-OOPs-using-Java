
public class PersonMain2 {

	public static void main(String[] args) {
		
		/* syntax for creating an object of a specific clas
		 * ClassName objectName = new ClassName();
		 */
		Person2 person1 = new Person2();
		person1.setName("Raymon");
		person1.setAge(25);
		person1.setAddress("123 Main St");
		
		Person2 person2 = new Person2();
		person2.setName("Michael");
		person2.setAge(35);
		person2.setAddress("456 Wrong Way");
		
		//System.out.println("person1 name is " + person1.getName());
		//System.out.println("person1 age is " + person1.getAge());
		//System.out.println("person1 address is " + person1.getAddress());
		//System.out.println("person2 name is " + person2.getName());
		//System.out.println("person2 age is " + person2.getAge());
		//System.out.println("person2 address is " + person2.getAddress());
		
		// Use the @Override method in the Person2 class 
		// to generate output as seen above
		System.out.println(person1);
		System.out.println(person2);
	}
}
	
