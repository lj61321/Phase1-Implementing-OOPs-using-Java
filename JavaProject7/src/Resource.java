
public class Resource {
	// synchronized places a lock on a resource until thread
	// has finished
	 public synchronized void PrintMsg(String msg) {
	 
		System.out.print(" [ " + msg); //user has logged in
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" ] ");//user has logged out	
	}
}

