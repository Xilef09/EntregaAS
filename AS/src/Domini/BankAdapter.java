package Domini;

public class BankAdapter implements iBankAdapter{

	ServiceLocator myServiceLocator = ServiceLocator.getInstance();
	@Override
	public Boolean autoritza(String dni, Integer codiB, String numCompte, Integer codiBS, String numCompteS,
			String g) throws Exception {
			BankService bs = (BankService)myServiceLocator.find("BankService");
			if (bs == null)
				throw new Exception ("Servei no disponible");
			return bs.autoritza(dni,codiB,numCompte,codiBS,numCompteS);
			
	}

}
