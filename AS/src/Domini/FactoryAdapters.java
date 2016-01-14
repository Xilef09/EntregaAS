package Domini;

public class FactoryAdapters {

	private ConversorAdapter ca;
	private BankAdapter ba;
	
	protected FactoryAdapters() {}
	
	public ConversorAdapter getConversorAdapter(){
		return ca;
	}
	
	public BankAdapter getBankAdapter(){
		return ba;
	}

}
