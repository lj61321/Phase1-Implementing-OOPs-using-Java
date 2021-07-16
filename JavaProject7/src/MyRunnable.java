
public class MyRunnable implements Runnable {
	
	private Thread thread;
	
	public MyRunnable(String name, int priority) {
		thread = new Thread(this); //refers to the current object
		thread.setName(name);
		thread.setPriority(priority);
		thread.start();
		
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			//print thread name to console
			//getPriority() is a method to see a thread's priority
			System.out.println(thread.getName() + " : " + thread.getPriority() + " : " + i);
			
		}
		//4. Pause State - thread execution may/may not be paused
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}
	
	public static void main(String[] args) {
		
		MyRunnable myRunnable1 = new MyRunnable("ONE", 3);
		MyRunnable myRunnable2 = new MyRunnable("TWO", 2);
		MyRunnable myRunnable3 = new MyRunnable("THREE", 5);
	}
}
