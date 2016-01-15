package Domini;

public class FactoryCtrlCasDus {
	private static FactoryCtrlCasDus instance= new FactoryCtrlCasDus();
	private CtrlConsultaOcupacio ctrlConsultaOcupacio;
	private CtrlConsultaRepresentacions ctrlConsultaRepresentacions;
	private CtrlComprarEntrada ctrlComprarEntrada;
	
	private FactoryCtrlCasDus(){
		ctrlConsultaOcupacio = new CtrlConsultaOcupacio();
		ctrlConsultaRepresentacions = new CtrlConsultaRepresentacions();
		ctrlComprarEntrada = new CtrlComprarEntrada();
	}
	
	public static FactoryCtrlCasDus getInstance(){
		if(instance == null) {
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
