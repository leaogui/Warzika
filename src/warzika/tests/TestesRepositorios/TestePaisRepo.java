package warzika.tests.TestesRepositorios;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import geo.Pais;
import repositories.PaisesRepository;

public class TestePaisRepo {
	
	
	@Test
	public void devoConseguirAdicionarPais() {
		
		
		PaisesRepository repo = new PaisesRepository();
		Pais pais = new Pais();
		int num = 1;
		
		
		repo.listaPaises.add(pais);
		
		assertEquals(1,repo.getPaises().size());
		
	}

}
