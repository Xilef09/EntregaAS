package Domini;

public class FactoryCtrlCasDus {
	private static FactoryCtrlCasDus instance= null;
	private CtrlConsultaOcupacio ctrlConsultaOcupacio = new CtrlConsultaOcupacio();
	private CtrlConsultaRepresentacions ctrlConsultaRepresentacions = new CtrlConsultaRepresentacions();
	private CtrlComprarEntrada ctrlComprarEntrada = new CtrlComprarEntrada();
	
	private FactoryCtrlCasDus(){
	}
	
	public static FactoryCtrlCasDus getInstance(){
		if(instance == null) {
	         instance = new FactoryCtrlCasDus();
	      }
		return instance;
	}
	
	public CtrlComprarEntrada getCtrlComprarEntrada() {
		return ctrlComprarEntrada;
	}
	
	public CtrlConsultaOcupacio getCtrlConsultaOcupacio(){
		return ctrlConsultaOcupacio;
	}
	
	public CtrlConsultaRepresentacions getCtrlConsultaRepresentacions(){
		return ctrlConsultaRepresentacions;
	}
}
