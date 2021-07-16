
public class ThreadDemo extends Thread{
	//create a constructor and invoke the start() method
	//this addresses the question of not knowing how many threads we should start
	public ThreadDemo(String name, int priority) {
		setName(name); //here we want to assign name to the thread, instead of system defined name
		setPriority(priority);
		start();
	}
		
	
	@Override
	public void run() {
		//3. Running - thread is in execution
		for(int i=0; i<10; i++) {
			//print thread name to console
			//getPriority() is a method to see a thread's priority
			System.out.println(getName() + " : " + getPriority() + " : " + i);
		}
		
		//4. Pause State - thread execution may/may not be paused
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
		//5. Dead State - thread execution is over
	
	public static void main(String[] args) {
		//1. New born state- the thread is created
		//and we assign names to each thread
		//assign priority to each thread - 10 highest, 1 lowest, 5 is the default
		ThreadDemo demo1 = new ThreadDemo("One", 9);
		ThreadDemo demo2 = new ThreadDemo("Two", 3);
		ThreadDemo demo3 = new ThreadDemo("Three", 6);
		
		//initially this was a system assigned thread name
//		System.out.println(demo1);
//		System.out.println(demo2);
//		System.out.println(demo3);
		
		//2. Ready to run - thread is added to thread pool
		// thread is now under the control of the processor
		//thread start method is passed to ThreadDemo constructor
//		demo1.start();
//		demo2.start();
//		demo3.start();
		
		
	}
	

}
