
public class Assignment7 {

	public static void main(String[] args) {
		// Class prints the token from a given string
		
		String token = "http://example.com?access_token=EFEc8328h29jndjd02h12$3829&ds98d";
		int index = token.indexOf("=");
		
		String substr = token.substring(index+1, token.length());
		System.out.println(substr);
		
		/* note that println will display everything in string until eol is reached
		 * 
		 */
		
		String substr2 = token.substring(index+1);
		System.out.println(substr2);
	}

}
