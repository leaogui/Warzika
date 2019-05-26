package warzika.funcs;

import java.util.Random;

public class Dados{
	
	public int valor;
	

	
	
	
	public void rolar(int numDados) {
	
		for(int i = 0;i == numDados;i++) {
		
		Random rand = new Random();
		
		this.valor = rand.nextInt(6) + 1;
		
		}
	}
	
	
}