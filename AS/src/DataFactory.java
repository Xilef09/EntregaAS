
public class DataFactory {
	
	private static DataFactory instance = null;

	protected DataFactory() {}

	public static DataFactory getInstance() {
        if (instance == null) {
            instance = new DataFactory();
        }
        return instance;
    }
	
}
