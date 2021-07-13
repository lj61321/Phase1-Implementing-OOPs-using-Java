import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		
		BufferedOutputStream stream = null;
		
		try {
			stream = new BufferedOutputStream(new FileOutputStream("bufferIO"));
			String s = "This is written to the buffered IO";
			stream.write(s.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			 }
		}
		
	}
}
