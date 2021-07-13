
	// Note - we cannot have private classes in Java
	public class Person2 {
		//global variables also know as instance variable
		// Encapsulation states that these variable cannot be accessible outside this class
		// Therefore, use the 'private' modifier
		private String name;
		private int age;
		private String address;
		
		//use setter and getter methods to access instances of these variable
		
		public void setName(String name) {
			//use keyword 'this' to indicate this specific instance of the variable
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		//use the shortcut - right click/source, select generate setters/getters to select the remaining setters and getters
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		 // right click-select source-->Generate toSring method
		
		@Override
		public String toString() {
			return "Person2 [name=" + name + ", age=" + age + ", address=" + address + "]";
		}
			

	}	
