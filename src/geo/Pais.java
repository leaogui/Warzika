package geo;

import java.util.ArrayList;

public class Pais {
	
	public String Nome;
	
	public int exercito;
	
	public boolean temJogador;
	
	public int jogadorAtual;
	
	ArrayList<String> fronteiras = new ArrayList<String>();

	
	public Pais() {
		this.exercito = 0;
		this.temJogador = false;
	}
	
	
	public void fronteiras(String lpais) {	// falar as fronteiras que tem em cada pais
		
		String[] array = lpais.split("[|]");
	    String Nome = array[0];
	    String num = array[1];
	    int quant = Integer.parseInt(num);
	    if(quant == 2) {
	    	fronteiras.add(array[2]);
	    	fronteiras.add(array[3]);
	    }
	    
	    if(quant == 3) {
	    	fronteiras.add(array[2]);
	    	fronteiras.add(array[3]);
	    	fronteiras.add(array[4]);
	    }
	    
	    if(quant == 4) {
	    	fronteiras.add(array[2]);
	    	fronteiras.add(array[3]);
	    	fronteiras.add(array[4]);
	    	fronteiras.add(array[5]);
	    }
	    
	    if(quant == 5) {
	    	fronteiras.add(array[2]);
	    	fronteiras.add(array[3]);
	    	fronteiras.add(array[4]);
	    	fronteiras.add(array[5]);
	    	fronteiras.add(array[6]);
	    }
	    
	    if(quant == 8) {
	    	fronteiras.add(array[2]);
	    	fronteiras.add(array[3]);
	    	fronteiras.add(array[4]);
	    	fronteiras.add(array[5]);
	    	fronteiras.add(array[6]);
	    	fronteiras.add(array[7]);
	    	fronteiras.add(array[8]);
	    	fronteiras.add(array[9]);
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
