package warzika.app;

import geo.Continente;
import geo.Pais;
import warzika.funcs.Dados;

public class Creator {

	
	
	
	public Controller newControl() {
		
		
	Controller control = new Controller();
		
		return control;
	}
	
	
	public Dados newDado() {
		
		Dados dado = new Dados();
			
		
		return dado;
	}
		
	public Pais newPais() {
		Pais pais = new Pais();
		return pais;
	}
	
	public Continente newContinente() {
		Continente conti = new Continente();
		return conti;
	}
	
}
