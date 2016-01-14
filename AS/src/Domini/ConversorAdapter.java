package Domini;

public class ConversorAdapter implements iConversorAdapter{

	public ConversorAdapter() {
	}

	public float obteConversionRate(String divisa, String moneda) throws Exception {
		ServiceLocator sl = ServiceLocator.getInstance();
		CurrentConvertorService css = (CurrentConvertorService) sl.find("CurrencyConvertorService");
		if (css==null)
			throw new Exception ("Error: serveiNoDisponible\n");
		return css.conversionRate(divisa, moneda);
	}

}
