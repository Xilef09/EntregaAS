package Domini;

public class FactoryAdapters {
	
	private static FactoryAdapters instance = null;
	private ConversorAdapter ca;
	private BankAdapter ba;
	
	private FactoryAdapters() {}
	
	public ConversorAdapter getConversorAdapter(){
		return ca;
	}
	
	public BankAdapter getBankAdapter(){
		return ba;
	}

	public static FactoryAdapters getInstance() {
		if(instance == null) {
	         instance = new FactoryAdapters();
	      }
		return instance;
	}

}
