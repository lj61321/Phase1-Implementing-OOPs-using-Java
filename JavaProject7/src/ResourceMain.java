//Concept of synchronization of resource usage
public class ResourceMain {

	public static void main(String[] args) {
		Resource resource = new Resource();
		ResourceThread John = new ResourceThread(resource, "John is using the account");
		ResourceThread Sam = new ResourceThread(resource, "Sam is using the account");	

	}

}
