package geo;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	
	public static String Nome;
	
	public int exercito;
	
	public int joadorAtual;
	
	List<String> fronteiras = new ArrayList<String>();

	public void add(String linha) {
		Pais.Nome = linha;
		
	}
	

	
		// usar o split() com ; para separar fronteiras e nome.
}
