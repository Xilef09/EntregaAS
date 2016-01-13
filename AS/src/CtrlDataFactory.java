
public class CtrlDataFactory {
	private static CtrlDataFactory instance= null;
	private ControladorRepresentacio = new ControladorRepresentacio();
	
	protected CtrlDataFactory(){
	}
	
	public static CtrlDataFactory getInstance(){
		if(instance == null) {
	         instance = new CtrlDataFactory();
	      }
		return instance;
	}
	
}
