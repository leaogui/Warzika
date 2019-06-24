package warzika.tests.geoTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import geo.Continente;

public class TesteContinente {
	
	@Test
	public void DevoConseguirCriarContinente() {
		
		String nome = "Africa";
		
		Continente cont = new Continente("Africa");
		
		
		assertEquals(nome, cont.getNome());
		
		
		
	}

}
