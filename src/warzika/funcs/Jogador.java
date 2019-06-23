package warzika.funcs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import geo.Pais;
import geo.Pais;
import warzika.app.Creator;

public class Jogador {
	
	public Set<Pais> paises = new HashSet<Pais>();
	
	Creator criador = new Creator();
	
	public int id;
	
	public int exercito; // todo jogador começa com o mesmo número de tropas? -- teria que começar com o mesmo numero e escolher aonde colocar, em quais paises
	
	public String nome;
	
	public int ordem; 
	
	public int quantpais;
	
	public Jogador(String Nome, int id){
		
		this.id = id;
		this.nome = Nome;
	}
	
	
	public void atacarPais(Pais pais, Scanner scan, Dados dado) {
		System.out.println("Quantas tropas irão atacar");
		int ntropas = scan.nextInt();
		if(ntropas < pais.exercito) {
			// vai dar algum erro
		}
		System.out.println("Escolha aonde deseja atacar:");
		// ver como vai ser visto as fronteiras para o jogador
		
		pais.exercito = pais.exercito - ntropas;
			dado.rolar(ntropas); // dúvidas se é melhor fazer desse jeito ou como implementei nos dados
		
	}
	
	// metodo para retornar os países que ele possui
	
	public  String getPaises(int i) {
		int cont = 0;
		String[] pais = new String [42];
		for(Pais a : paises) {
			pais[cont] = a.Nome;
			cont++;
		}
		return pais[i];
	}
	
	
	// metodo para retirar e adicionar um país dele
	public void retirarPais(Pais pais) {
		for(Pais a : paises) {
			if(a.equals(pais)) {
				paises.remove(a); // para se retirar seria um pais seria necessario algo parecido com isso
			}
		}
	}
	
	public void adicionarPais(Pais pais) {
		paises.add(pais);
	}
	
	
	// metodo para adicionar varios paises (sobrecarga)
	
	// provavelmente passar de set para hashmap, provavelmente ajudaria a transpor (provavelmente = talvez)
	
	
	
}
