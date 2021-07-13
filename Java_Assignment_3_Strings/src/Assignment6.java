
public class Assignment6 {

	public static void main(String[] args) {
		// Class finds the index of the 2nd space character and prints this number
		
		String b = "Hello My Name is Java";
		int i1 = b.indexOf(" ", b.indexOf(" ") + 1);
		
		System.out.println("second index is " + i1);

	}

}
