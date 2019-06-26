package warzika.app;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

import geo.Continente;
import geo.Pais;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import repositories.PaisesRepository;
import warzika.funcs.Dados;
import warzika.funcs.Jogador;

public class Controller {

	public int jogador = 0;
	public int numJogInt = 0;
	public String numJog;
	public int turno = 1;
	public int dado1;
	public int dado2;
	public Pais paisorigin;
	public String paisdest;
	public int paisestj = 0;
	public int jogadorp;
	public int arrumar;
	
	public Stage stage;
	
	public ArrayList<Jogador> players = new ArrayList<Jogador>();
	Creator criador = new Creator();
	public ArrayList<Pais> paisrep = new ArrayList<Pais>();
	
	public void comeco() {
	
		
	System.out.println("Bem vindo ao Warzika");	
	
	
	this.territorios();
	
	this.distribuirPaises();
	
	this.distribuirTropas();
	
	
	}
	
	
	public void territorios() {
	
	try {
		FileReader arq1 = new FileReader("Continentes.txt");
        FileReader arq2 = new FileReader("Paises.txt");
        BufferedReader leitor1 = new BufferedReader(arq1);
        BufferedReader leitor2 = new BufferedReader(arq2);
        String lconti;
        String lpais = leitor2.readLine();
        while( (lconti = leitor1.readLine()) != null ){
        	int x = 0;      	
        	String nome = lconti.substring(0, lconti.indexOf('|'));
        	String num = lconti.substring(lconti.lastIndexOf('|') + 1, lconti.length());
        	Continente conti = criador.newContinente(nome);
        	int quant = Integer.parseInt(num);
	        do{
	        	Pais pais = criador.newPais();
	            pais.fronteiras(lpais);
	            conti.adicionar(pais);
	            paisrep.add(pais);
	            x++;
        }while( (lpais = leitor2.readLine()) != null  && x < quant);
      }

    } catch (IOException e) {
        e.printStackTrace();
    }
}
	
	public void distribuirPaises(){ 
		int a = 42/numJogInt;
		int cont1 = 0;
		Collections.shuffle(paisrep);
		for(int i=0;i<numJogInt;i++) {
			Jogador jog = players.get(i);
			for(int cont = 0; cont < a; cont++) {
				Pais pais = paisrep.get(cont1);
				pais.exercito +=1;
				jog.adicionarPais(pais);
				jog.quantpais = cont + 1;
				cont1++;
			}
		}
		if(cont1 < 42) { 
			System.out.println("vai ter "+ (cont1 - 42) + " de paises sem ser dado para os jogadores");
			int nigual = cont1;
			for(int cont = 0; cont < (nigual-42); cont++) {
				Pais pais = paisrep.get(cont1);
				pais.exercito +=10;
				cont1++;
			}
		}
	}
	
	public void escolherordem() { 
		Dados dado = criador.newDado();
		int[] a; 
		a = new int[6];
		int []b;
		b = new int[6]; 
		a = dado.rolar(numJogInt);
		
		for(int cont = 0;cont < numJogInt; cont++) {
			
			for(int cont1 = cont; cont1 < numJogInt; cont1++) {
				b[cont] = cont + 1;
				if(a[cont]< a[cont1]) {
					b[cont] = b[cont] + 1;
				}
			}
		}
		for(int cont = 0;cont < numJogInt; cont++) {
			Jogador jog = players.get(cont);
			jog.ordem = a[cont];		

		}
	}
	
	public void distribuirTropas() {
		if(turno == 1) {
			for(int i = 0; i < numJogInt; i++) {
				Jogador jog = players.get(i);
				jog.exercito = jog.exercito + jog.quantpais/2;
			}
		}
		else {
			for(int i = 0; i < numJogInt; i++) {
				Jogador jog = players.get(i);
				jog.exercito = jog.exercito + jog.quantpais/2;
			}
		}
	}
	
	
	
	}
