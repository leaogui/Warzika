package warzika.app;

import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

import geo.Continente;
import geo.Pais;
import repositories.PaisesRepository;
import warzika.funcs.Dados;
import warzika.funcs.Jogador;

public class Controller {

	public int numJogInt = 0;
	public String numJog;
	public String Nome = null;
	
	public ArrayList<Jogador> players = new ArrayList<Jogador>();
	Creator criador = new Creator();
	public ArrayList<Pais> paisrep = new ArrayList<Pais>();
	//PaisesRepository paisrep = criador.newPaisesRepositorios();
	
	public int comeco() {
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
		Jogador player = criador.newJogador(Nome, i);
		System.out.println("Jogador "+i+" criado, nome: "+Nome);
		players.add(player);
		Nome = null;
	}
	
	return numJogInt;
	}
		
	/*Dados dado = criador.newDado();	
	
	for(int i = 0; i < 6; i++) {
		
		dado.rolar(5);
		
		System.out.println(dado.valor);
		
	}*/ // teste fora do lugar
	
	
	// dividi os dois por não terem nada um haver com o outro
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
        	//System.out.println(nome+quant);
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
	
	public void distribuirPaises(int idJoga){ // esse metodo ira receber o numero de jogadores e distribuir igualmente os paises a todos
		int a = 24/idJoga; // esse 24 representa a quantidade total de paises que tem q ter no jogo, eu acho q é essa quantidade
		int cont1 = 0;
		Collections.shuffle(paisrep); // lista de paises foi embaralhada
		for(int i=0;i<idJoga;i++) {
			
			for(int cont = 0; cont < a; cont++) {
				
				cont1++;
			}
		}
		if(cont1 != 24) { // quando não der para dividir igualmente os paises para os players vai ser feito isso
			
		}
	}
	
	
	}
