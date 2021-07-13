
public class Assignment2 {

	public static void main(String[] args) {
		// Class compares two strings to determine if they are equal
		
		String one = "abc";
		String two = "ABC";
		String three = one.toUpperCase();
		
		if( three == two) 
		{
			System.out.println("the strings are equal using '=='");
		}
		else
		{
			System.out.println("why not?");
		}

		if (three.contentEquals(two))
		{
			System.out.println("the two strings are equal using '.equals'");
		}
	}

}
