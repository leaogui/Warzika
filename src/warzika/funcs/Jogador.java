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
	
	public int exercito; // todo jogador come�a com o mesmo n�mero de tropas? -- teria que come�ar com o mesmo numero e escolher aonde colocar, em quais paises
	
	public String nome;
	
	public int ordem; 
	
	public int quantpais;
	
	public Jogador(String Nome, int id){
		
		this.id = id;
		this.nome = Nome;
	}
	
	

	
	// metodo para retornar os pa�ses que ele possui
	
	public  String getPaises(int i) {
		int cont = 0;
		String[] pais = new String [42];
		for(Pais a : paises) {
			pais[cont] = a.Nome;
			cont++;
		}
		return pais[i];
	}
	
	
	// metodo para retirar e adicionar um pa�s dele
	public void retirarPais(String npais) {
		for(Pais pais: paises){
			if(pais.Nome.equals(npais)) {
				System.out.println("PQPQPQPQPQPPQQPPQQPQPQQP");
				paises.remove(pais);
			}
		}
		quantpais-=1;
		// para se retirar seria um pais seria necessario algo parecido com isso
			}
	
	public void adicionarPais(Pais pais) {
		paises.add(pais);
	}
	
	public String getNome() {
		
		return this.nome;
	}
	
	public int getId() {
		
		
		return this.id;
	}
	
	// metodo para adicionar varios paises (sobrecarga)
	
	// provavelmente passar de set para hashmap, provavelmente ajudaria a transpor (provavelmente = talvez)
	
	
	
}
