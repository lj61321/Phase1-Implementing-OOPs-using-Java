//Note - we cannot have private classes in Java
public class PersonMain {
	public static void main(String[] args) {
		/* syntax for creating an object of a specific clas
		 * ClassName objectName = new ClassName();
		 */
		Person person1 = new Person();
		person1.setName("Raymon");
		person1.setAge(25);
		person1.setAddress("123 Main St");
		
		Person person2 = new Person();
		person2.setName("Michael");
		person2.setAge(35);
		person2.setAddress("456 Wrong Way");
		
		System.out.println("person1 name is " + person1.getName());
		System.out.println("person1 age is " + person1.getAge());
		System.out.println("person1 address is " + person1.getAddress());
		System.out.println("person2 name is " + person2.getName());
		System.out.println("person2 age is " + person2.getAge());
		System.out.println("person2 address is " + person2.getAddress());
		
	}
}
