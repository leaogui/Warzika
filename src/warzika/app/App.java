package warzika.app;

public class App {
	
	
	
	
	public static void main(String[] args) {
		
		
	Creator criador = new Creator();
	
	
	
	
	Controller control = criador.newControl();
	
	int numJog = control.comeco();
	
	control.territorios();
		
	// control.distribuirPaises(numJog);
	
	}

}
