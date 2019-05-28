package warzika.app;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

import geo.Continente;
import geo.Pais;
import warzika.funcs.Dados;

public class Controller {

	public int numJogInt = 0;
	public String numJog;
	public String Nome = null;
	
	public void comeco() {
	
		
		
	Creator criador = new Creator();
	
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
		
	System.out.println("Bem vindo ao Warzika");	
	

	while(true) {	
	System.out.println("Número de jogadores: ");
	
	
	numJog = sc.nextLine();
	if("2".equals(numJog) || "3".equals(numJog) || "4".equals(numJog) || "5".equals(numJog) || "6".equals(numJog)) {
	
		
		break;
				
		}
	else {
		System.out.println("Só podem existir 6 jogadores, e devem existir no mínimo 2.");
	}
	
	}
	
	
	numJogInt = Integer.parseInt(numJog);
	
	for(int i=1;i<=numJogInt;i++) {
		System.out.println("Digite o nome do jogador: ");
		Nome = sc1.nextLine();
		criador.newJogador(Nome, i);
		System.out.println("Jogador "+i+" criado, nome: "+Nome);
		Nome = null;
	}
	
		
	/*Dados dado = criador.newDado();	
	
	for(int i = 0; i < 6; i++) {
		
		dado.rolar(5);
		
		System.out.println(dado.valor);
		
	}*/ // teste fora do lugar

	
	
	try {   
		FileReader arq1 = new FileReader("Continentes.txt");
        FileReader arq2 = new FileReader("Paises.txt");
        BufferedReader leitor1 = new BufferedReader(arq1);
        BufferedReader leitor2 = new BufferedReader(arq2);
        String lconti;
        String lpais = leitor2.readLine();
        while( (lconti = leitor1.readLine()) != null ){
        	int x = 0;
        	String[] nome = lconti.split( "|");
        	System.out.println(nome[0]);
//        	
//        	String nome = lconti.substring(0, lconti.indexOf('|'));
//        	String num = lconti.substring(lconti.lastIndexOf('|') + 1, lconti.length());
//        	Continente conti = criador.newContinente(nome);
//        	int quant = Integer.parseInt(num);
//        	System.out.println(nome+quant);
//	        do{
//	        	Pais pais = criador.newPais();
//	            pais.fronteiras(lpais);
//	            conti.adicionar(pais);
//	            x++;
//        }while( (lpais = leitor2.readLine()) != null  && x < quant);
      }

    } catch (IOException e) {
        e.printStackTrace();
    }
}
	
	public void distribuirPaises(int idJoga){
		
	}
	
	
	}
