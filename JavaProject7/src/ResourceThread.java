
public class ResourceThread extends Thread {
	private Resource resource; //needed to access Resource
	private String msg; //used to pass message
	
	public ResourceThread(Resource resource, String msg ) {
		this.resource = resource;
		this.msg = msg;
		start();
	}
		@Override
		public void run() {
			resource.PrintMsg(msg);
		}
}
	