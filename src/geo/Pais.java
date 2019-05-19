package geo;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	
	public static String Nome;
	
	public int exercito;
	
	public int joadorAtual;
	
	public List<String> fronteiras = new ArrayList<String>();

	public void add(String linha) {
		Pais.Nome = linha;
	}
	
	
	public void fronteiras(String lpais) {
		Nome = lpais.substring(0, lpais.indexOf('|'));
		String num = lpais.substring(0, lpais.indexOf('|') + 1);
		int quant = Integer.parseInt(num);
		if(quant==2) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==3) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==4) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==5) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==8) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
	}

//	pais.add(lpais);
//    conti.adicionar(pais);
		// usar o split() com ; para separar fronteiras e nome.
}
