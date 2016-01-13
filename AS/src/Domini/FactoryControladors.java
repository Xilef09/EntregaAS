package Domini;

public class FactoryControladors {

	private static FactoryControladors instance = null;

	protected FactoryControladors() {}

	public static FactoryControladors getInstance() {
        if (instance == null) {
            instance = new FactoryControladors();
        }
        return instance;
    }

}
