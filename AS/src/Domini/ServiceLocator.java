package Domini;

public class ServiceLocator {

	private static ServiceLocator instance = null;

	private ServiceLocator() {}

	public static ServiceLocator getInstance() {
        if (instance == null) {
            instance = new ServiceLocator();
        }
        return instance;
    }
	
	public Object find(String name){
		if (name.equals("CurrentConvertorService")) return new CurrentConvertorService();
		if (name.equals("BankService")) return new BankService();
		return null;
	}
}
