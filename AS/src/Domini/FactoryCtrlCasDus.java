package Domini;

public class FactoryCtrlCasDus {
	private static FactoryCtrlCasDus instance= null;
	private CtrlConsultaOcupacio ctrlConsultaOcupacio = new CtrlConsultaOcupacio();
	private CtrlConsultaRepresentacions ctrlConsultaRepresentacions = new CtrlConsultaRepresentacions();
	
	protected FactoryCtrlCasDus(){
	}
	
	public static FactoryCtrlCasDus getInstance(){
		if(instance == null) {
	         instance = new FactoryCtrlCasDus();
	      }
		return instance;
	}
	
	public CtrlConsultaOcupacio getCtrlConsultaOcupacio(){
		return ctrlConsultaOcupacio;
	}
	
	public CtrlConsultaRepresentacions getCtrlConsultaRepresentacions(){
		return ctrlConsultaRepresentacions;
	}
}
