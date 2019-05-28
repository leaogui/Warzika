package geo;

import java.util.ArrayList;

public class Pais {
	
	public static String Nome;
	
	public int exercito;
	
	public boolean temJogador;
	
	public int jogadorAtual;
	
	public ArrayList<String> fronteiras = new ArrayList<String>();

	public void add(String linha) {
		Pais.Nome = linha;
	}
	
	public Pais() {
		this.exercito = 0;
		this.temJogador = false;
		
		
	}
	
	
	public void fronteiras(String lpais) {
		Nome = lpais.substring(0, lpais.indexOf('|') + 1);
		String num = lpais.substring(lpais.lastIndexOf('|') + 1, lpais.indexOf('|'));
		System.out.println(num);
		int quant = Integer.parseInt(num);
		if(quant==2) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==3) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==4) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==5) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
		if(quant==8) {
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.indexOf('|') + 1));
			fronteiras.add(lpais.substring(0, lpais.lastIndexOf('|') + 1));
		}
	}

	public void setAtual(int Jogador) {
		temJogador = true;
		this.jogadorAtual = Jogador;
	}
	
	public int getAtual() {
		return jogadorAtual;
    }
	
	public void setTropas(int Tropas) {
		
		this.exercito = Tropas;
		
	}
	
	
	public void addTropas(int numTropas) {
		exercito = exercito + numTropas;
		System.out.println(" Foram adicionadas " + numTropas + " em " + Nome);
	}
	
	public void removerTropas(int numTropas) {
		exercito = exercito - numTropas;
		System.out.println(" Foram retiradas " + numTropas + " de " + Nome);
	}
	
	public int getTropas(){
		
		return exercito;
	}
	
	public ArrayList<String> getFronteiras(){
		
		return fronteiras;
		
	}
	
	public void distribuirPaises(){
		
	}
	
	
//	pais.add(lpais);
//    conti.adicionar(pais);
		// usar o split() com ; para separar fronteiras e nome.
}
