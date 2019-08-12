package curso_map;

public class Singleton {
	
	static Singleton unicaInstancia;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstacia() {
		if(unicaInstancia == null)
			unicaInstancia = new Singleton();
		return unicaInstancia;
			
	}

}
