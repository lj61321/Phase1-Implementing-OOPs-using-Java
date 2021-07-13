// Reference Java.io documentation for this particular class

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream stream = null;
		
				
		try { //note that the file is created in the project folder
			//and you can specify a specific folder if so desired
			//right click on the project and we will see the data written
			stream = new FileOutputStream("fileio", true); //adding true allows us to append data to the file
			String str = "Welcome to Java \n";
			//strings can be converted to bytes
			byte[] b = str.getBytes();
			stream.write(b);
			System.out.println("Data written to file");
		} catch (IOException e) {
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
