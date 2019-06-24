package repositories;

import java.util.HashSet;
import java.util.Set;

import geo.Continente;

public class ContinentesRepository {
	
	public Set<Continente> listaConti = new HashSet<Continente>();

	
	public Set<Continente> getContinentes() {
		return listaConti;
	}
}
