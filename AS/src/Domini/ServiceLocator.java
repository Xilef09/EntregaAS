package Domini;

public class ServiceLocator {

	private static ServiceLocator instance = null;

	protected ServiceLocator() {}

	public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }
	
	public Object find(String name){
		if (name.equals("CurrentConvertorService")) return new CurrentConvertorService();
		return null;
	}
}
