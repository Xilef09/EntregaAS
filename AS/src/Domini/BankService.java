package Domini;

import java.util.Random;

public class BankService {

	public BankService() {}

	public Boolean autoritza(String dni, Integer codiB, String numCompte, Integer codiBS, String numCompteS) {
			Random random = new Random();
			Integer i = random.nextInt(15);
			if (i==5) return false;
			return true;
	}
	

	
}
