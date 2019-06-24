package warzika.tests.geoTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import geo.Pais;

public class TestePais {
	
	
	@Test
	public void devoConseguirCriarPais() {
		
		int num = 0;
		
		Pais pais = new Pais();
		
		assertEquals(num, pais.getTropas());
		
		
	}

}
