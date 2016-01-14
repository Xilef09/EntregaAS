package Domini;

public class CurrentConvertorService {

	public CurrentConvertorService() {}
	
	public float conversionRate(String divisa, String moneda){
		if (moneda.equals("USD")) return (float)1.2;
		if (moneda.equals("EUR")) return (float)0.8;
		return (float) 0.5;	}
}
