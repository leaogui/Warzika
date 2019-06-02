package warzika.funcs;

import java.util.Random;

public class Dados{
	
	public int valor;
	

	
	
	
	public int[] rolar(int numDados) {
		
		int a[] = new int[6];
	
		for(int i = 0;i < numDados;i++) {
		
			Random rand = new Random();
		
			a[i] = rand.nextInt(6) + 1;
		}
		return a;
	}
	
	
}