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
	
	public void comeco() {
	
		
	System.out.println("Bem vindo ao Warzika");	
	

	this.criarJog();
	
	this.territorios();
	
	this.distribuirPaises();
	
	this.escolherordem();
	
	this.mostrarseuspaises();
	
	}
		
	
	public void criarJog() {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {	
			System.out.println("Número de jogadores: ");
			
			
			numJog = sc.nextLine();
			if(/*"2".equals(numJog) ||*/ "3".equals(numJog) || "4".equals(numJog) || "5".equals(numJog) || "6".equals(numJog)) { // tem que ser de no minimo 3 e no máximo 6
			
				
				break;
						
				}
			else {
				System.out.println("Só podem existir 6 jogadores, e devem existir no mínimo 3.");
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
		
		
	}
	
	
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
	
	public void distribuirPaises(){ // esse metodo ira receber o numero de jogadores e distribuir igualmente os paises a todos
		int a = 42/numJogInt; // esse 24 representa a quantidade total de paises que tem q ter no jogo, eu acho q é essa quantidade
		int cont1 = 0;
		Collections.shuffle(paisrep); // lista de paises foi embaralhada
		for(int i=0;i<numJogInt;i++) {
			Jogador jog = players.get(i);
			for(int cont = 0; cont < a; cont++) {
				Pais pais = paisrep.get(cont1);
				jog.adicionarPais(pais);
				cont1++;
			}
		}
		if(cont1 != 42) { // quando não der para dividir igualmente os paises para os players vai ser feito isso
			System.out.println("vai ter"+ (cont1 - 42) + "de paises sem ser dado para os jogadores");
		}
	}
	
	public void escolherordem() { // saber quem será q vai jogar primeiro
		Dados dado = criador.newDado();
		int[] a; // valor do dado
		a = new int[6];
		int []b;
		b = new int[6]; //ordem de jogada
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
//			System.out.println(a[cont]);
//			System.out.println(b[cont]);
		}
	}
	
	public void mostrarseuspaises() {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		Jogador jog = players.get(cont);
		while(true) {
			jog.getPaises();
		
			int a = sc.nextInt();
			if(a == 1) {
				break;
			}
		}
	}
	
	
	}
