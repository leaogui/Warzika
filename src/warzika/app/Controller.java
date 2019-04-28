package warzika.app;

import java.io.*;

import javax.swing.JOptionPane;

import geo.Continente;
import geo.Pais;
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
	
	try {   
		FileReader arq1 = new FileReader("Continentes.txt");
        FileReader arq2 = new FileReader("Paises.txt");
        BufferedReader leitor1 = new BufferedReader(arq1);
        BufferedReader leitor2 = new BufferedReader(arq2);
        String lconti;
        String lpais = leitor2.readLine();
        while( (lconti = leitor1.readLine()) != null ){
        	int x = 0;
        	Continente conti = criador.newContinente();
        	String nome = lconti.substring(0, lconti.indexOf('|'));
        	String num = lconti.substring(lconti.lastIndexOf('|') + 1, lconti.length());
        	int quant = Integer.parseInt(num);
        	System.out.println(nome+quant);
	        do{
	        	Pais pais = criador.newPais();
	            pais.add(lpais);
	            System.out.println(lpais);
	            x++;
        }while( (lpais = leitor2.readLine()) != null  && x < quant);
	        }

    } catch (IOException e) {
        e.printStackTrace();
    }
	
	
	
	
	
}
	}
