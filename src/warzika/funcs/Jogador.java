package warzika.funcs;

import java.util.HashSet;
import java.util.Set;

import geo.Pais;
import warzika.app.Creator;

public class Jogador {
	
	Set<Pais> paises = new HashSet<Pais>();
	
	Creator criador = new Creator();
	
	public Jogador(){
		
		Pais pais = criador.newPais();
		
		paises.add(pais);
	}
}
