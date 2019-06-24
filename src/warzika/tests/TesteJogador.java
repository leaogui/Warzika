package warzika.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warzika.funcs.Jogador;

public class TesteJogador {

	
	
	
	
	@Test
	public void JogadorPodeSerCriado() {
		
		
		String nome = "Klebin";
		int id = 1;
		
		
		Jogador jog = new Jogador("Klebin",1);
		
		
		assertEquals(id, jog.getId());
		assertEquals(nome, jog.getNome());
		
		
	}
	
	
	
	
	
}
