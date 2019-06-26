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
	
	public int exercito;
	
	public String nome;
	
	public int ordem; 
	
	public int quantpais;
	
	public Jogador(String Nome, int id){
		
		this.id = id;
		this.nome = Nome;
	}
	
	
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
	
	
	
	public void retirarPais(Pais pais){
		
		int x=0;
		
		for(Pais i: paises) {
			
			if (i.equals(pais)){
				
	//			paises.remove(x);
				
			}
			
			x++;
		} 
		
		
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

	
	
}
