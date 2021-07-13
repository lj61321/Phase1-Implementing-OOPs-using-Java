
public class ExceptionDemo {
	public static void main(String[] args) {
		
		int a, b, c;
		a = 20;
		b = 2;
		//division by zero will cause abrupt interruption of program due to arithmetic exception
		//therefore, we place code in a try block
				
		try {
			c = a/b;
			//System.out.println("c is: " + c);
			String str = "Hello";
			System.out.println(str.charAt(20));
		} catch(ArithmeticException e) { //AritnmeticException is a class name
			System.out.println("Value of b cannot be zero");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid string index");
		} catch(Exception e) { //default super class for exceptions
				System.out.println("Error"); //place all known exception prior to this general exception
			} finally {
				//we can use finally block to execute after the exception has been thrown
				//use finally block to execute statements that must be executed such as closing certain files
				System.out.println("Finally block");
			}
		// now we have a graceful termination of the program
		//e is a reference of this particular class
		
		
	}
}
