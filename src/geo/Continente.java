package geo;

import java.util.HashSet;
import java.util.Set;

public class Continente {

	public static String Nome;
	
	
	
	Set<Pais> paises = new HashSet<Pais>();
	
	public Continente(String nome, Set<Pais> paises) {
		Continente.Nome = nome;
		this.paises = paises; //adicionando países no construtor ou já fazer com países direto?
	}
	
	public void adicionar(Pais pais) {
		paises.add(pais);
	}
	
	public String getNome() {
		
		return Nome;
	}
}
