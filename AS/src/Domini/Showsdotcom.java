package Domini;

public class Showsdotcom {
	private static Showsdotcom instance= null;
	
	private Showsdotcom(){
	}
	
	public static Showsdotcom getInstance(){
		if(instance == null) {
	         instance = new Showsdotcom();
	      }
		return instance;
	}
	
}
