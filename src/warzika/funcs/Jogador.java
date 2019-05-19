package warzika.funcs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import geo.Pais;
import geo.Pais;
import warzika.app.Creator;

public class Jogador {
	
	Set<Pais> paises = new HashSet<Pais>();
	
	Creator criador = new Creator();
	
	public Jogador(){
		
		Pais pais = criador.newPais();
		
		paises.add(pais);
	}
	
	public void atacarPais(Pais pais, Scanner scan, Dados dado) {
		System.out.println("Quantas tropas ir�o atacar");
		int ntropas = scan.nextInt();
		if(ntropas < pais.exercito) {
			// vai dar algum erro
		}
		System.out.println("Escolha aonde deseja atacar:");
		// ver como vai ser visto as fronteiras para o jogador
		
		pais.exercito = pais.exercito - ntropas;
		for(int cont = 0; ntropas < cont; cont++) {
			dado.rolar();
		}
	}
}
