package warzika.tests.TestesRepositorios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import geo.Continente;
import repositories.ContinentesRepository;

public class TesteContinenteRepo {

	
	@Test
	public void DevoConseguirAddUmContinente() {
		
		ContinentesRepository contrep = new ContinentesRepository();
		Continente cont = new Continente("africa");
		int num = 1;
		
		contrep.listaConti.add(cont);
		
		assertEquals(num, contrep.getContinentes().size());
		
		
	}
	
	
	
}
