
public class Assignment5 {

	public static void main(String[] args) {
		// Class demonstrates use of substring method
		
		String test = "Hello My Name is Java";
		int testLen = test.length();
		String sub = test.substring(testLen-5,testLen);
		
		System.out.println("substring is" + sub);

	}

}
