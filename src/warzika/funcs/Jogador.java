package warzika.funcs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import geo.Pais;
import geo.Pais;
import warzika.app.Creator;

public class Jogador {
	
	public ArrayList<Pais> paises = new ArrayList<Pais>();
	
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
	
	public Pais getPais(int i) {
		int cont = 0;
		Pais[] pais1 = new Pais [42];
		for(Pais a : paises) {
			pais1[cont] = a;
			cont++;
		}
		return pais1[i];
	}
	
	
	// metodo para retirar e adicionar um país dele
	public void retirarPais(Pais npais) {
		
		int i = 0;
		
	//	for(Pais o: paises){ //Pais a: paises
			
			if(o.equals(npais)) {
			
			paises.remove(i);
				
			}
			
			i++;
//		}
		
		quantpais-=1;
		
			}
	
	public void adicionarPais(Pais pais) {
		paises.add(pais);
		quantpais +=1;
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
