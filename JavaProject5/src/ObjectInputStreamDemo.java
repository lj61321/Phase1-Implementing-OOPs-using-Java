import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) {
		ObjectInputStream stream = null;
		
		try {
			stream = new ObjectInputStream(new FileInputStream("objectIO"));
			String s = (String) stream.readObject(); //here we are down casting
			System.out.println(s);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		}
		
	}
}
