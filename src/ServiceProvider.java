/*Name: Thien Nguyen
 * ID: 903324444*/
public class ServiceProvider {
	private static ServiceProvider instance;
	
	private ServiceProvider(){}
	
	public static synchronized ServiceProvider getInstance() {
		if(instance == null){
			System.out.print("Creating Service Provider\n");
			instance = new ServiceProvider();
		}
		else {
			System.out.print("Instance already exists\n");
		}
		return instance;
	}
	
	public static void main(String[] args) {
		ServiceProvider sp = new ServiceProvider();
		sp.getInstance();
		sp.getInstance();
		sp.getInstance();
	}

}
