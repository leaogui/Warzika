package warzika.app;

import java.io.*;

import javax.swing.JOptionPane;

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
	
	Pais pais = criador.newPais();
	try {   
        FileReader ler = new FileReader("Paises.txt");
        BufferedReader reader = new BufferedReader(ler);  
        String linha;
        while( (linha = reader.readLine()) != null ){
            pais.add(linha);
            System.out.println(linha);
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
	
	
	
	
	
}
	}
