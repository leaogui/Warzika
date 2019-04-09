package warzika.app;

import warzika.funcs.Dados;

public class Controller {

	
	
	
	
	
	
	
	
	
	
	public void comeco() {
	
	Creator criador = new Creator();
		
	System.out.println("Bem vindo ao Warzika");	
		
	Dados dado = criador.newDado();	
	
	for(int i = 0; i < 6; i++) {
		
		dado.rolar();
		
		System.out.println(dado.valor);
		
	}
	
	
	
	}
	
	
	
	
	
}
