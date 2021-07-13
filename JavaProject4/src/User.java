//how to use the user defined exception
//note how line 10 was changed to int a vs int age
//same technique can be used for any of the setters methods
//also note use of throw keyword
public class User {
	private int age;

	public int getAge() {
		return age;
	}
//this one approach in handling the exception
//public void setAge(int a) {
//	if (a < 18) { //exception can be handed in the called method
	//	try {
		//	throw new AgeException("Age can not be lower than 18");
		//} catch (AgeException e) {
		//	e.printStackTrace();
		//}
		//
//	}else {
//			age = a;
//	}
//}
// in this example the called method throws the exception back
// back to the calling or main method using the throws keyword
// this method is suggested by my compiler.
// termed exception propagation
	
public void setAge(int a) throws AgeException {
	if (a < 18) {
		throw new AgeException("Age can not be lower than 18");
	} else {
		age = a;
	}	
	
}


	public static void main(String[] args) {
		User user = new User();
		try {
			user.setAge(25);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user.getAge());
		
	}
}
