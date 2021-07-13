
public class Assignment3 {

	public static void main(String[] args) {
		// class creates two strings. one uses a literal statement and the other uses
		// the new keyword. the two strings are compared to see if they are equal
		
		String one = "one";
		String two = new String("one");
		
		if (one.contentEquals(two))
		{
			System.out.println(" string one is equal to string two");
		}
		else
		{
			System.out.println("the two strings are not equal");
		}
	}

}
