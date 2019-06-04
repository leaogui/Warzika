package warzika.app;

public class App {
	
	
	
	
	public static void main(String[] args) {
		
		
	Creator criador = new Creator();
	
	
	
	
	Controller control = criador.newControl();
	
	control.comeco();
	
	control.territorios();
		
	control.distribuirPaises();
	
	control.escolherordem();
	
	control.mostrarseuspaises();
	
	}

}
