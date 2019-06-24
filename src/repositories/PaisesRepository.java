package repositories;

import java.util.HashSet;
import java.util.Set;

import geo.Continente;
import geo.Pais;

public class PaisesRepository {
	
	
	 public Set<Pais> listaPaises = new HashSet<Pais>();

	 
//	 public void addPaises(Pais pais) {
//		listaPaises.add(pais);
//	 }
	 
	 public Set<Pais> getPaises() {
			return listaPaises;
		}
	 
}
