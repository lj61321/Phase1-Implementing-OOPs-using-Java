import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDdmo {
	public static void main(String[] args) {
		DataOutputStream stream = null;
		
		try {
			stream = new DataOutputStream(new FileOutputStream("dataIO"));
			stream.writeInt(10);
			stream.writeFloat(123.45f);
			stream.writeChar('V');
			stream.writeBoolean(true);
			System.out.println("Primitives written in the file");
			
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

