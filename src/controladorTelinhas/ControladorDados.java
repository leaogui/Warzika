package controladorTelinhas;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import geo.Pais;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import warzika.funcs.Jogador;

public class ControladorDados implements Initializable{
	
	int rolarataque = 0;
	
	int rolardefesa = 0;
	
	int[] dado2;
	
	int[] dado1;
	
	private TelaMapaController controller;
	
	public void setBaseController(TelaMapaController controller) {
		this.controller = controller;
	}
	
	@FXML
	public Label dadoataque;
	
	@FXML
	public Label dadodefesa;
	
	@FXML
	public Label dadoataque1;
	
	@FXML
	public Label dadodefesa1;
	
	@FXML
	public Label dadoataque2;
	
	@FXML
	public Label dadodefesa2;
	
	@FXML
	public Button bt1;
	
	@FXML
	public Button bt2;
	
	@FXML
	public Button finalizar;
	
	@FXML
	private Label atacaxdef;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println(IniciodoProcesso.controller.arrumar);
		if(IniciodoProcesso.controller.arrumar == 1) {
			System.out.println("oi");
		String jogatack = null, jogdefesa = null;
		for(int cont = 0; cont< IniciodoProcesso.quantJog ; cont++) {
			Jogador jog = IniciodoProcesso.controller.players.get(cont);
			for(int i = 0; i < jog.paises.size(); i++ ) {
				for(Pais pais: jog.paises) {
					if(IniciodoProcesso.controller.paisorigin.equals(pais)) {
						jogatack = jog.nome;
					}
					if(IniciodoProcesso.controller.paisdest.equals(pais.Nome)) {
						jogdefesa = jog.nome;
						IniciodoProcesso.controller.dado2 = pais.exercito;
					}
				}
			}
		}
		atacaxdef.setText(jogatack+" est� atacando o jogador "+ jogdefesa);
		IniciodoProcesso.controller.arrumar = 0;
		}

		
	}
	
	public void rolar(ActionEvent event) {
		if(rolarataque == 1) {
			
			}
		else {
			dado1 = new int [3];
			Random rand = new Random();
			for(int i = 0; i < IniciodoProcesso.controller.dado1; i++) {
				dado1[i] = rand.nextInt(6) + 1;
			}
			
				for(int cont = 0; cont < 2; cont++) {
					for (int i = dado1.length; i >= 1; i--) {
			            for (int j = 1; j < i; j++) {
			                if (dado1[j - 1] < dado1[j]) {
			                    int aux = dado1[j];
			                    dado1[j] = dado1[j - 1];
			                    dado1[j - 1] = aux;
			                }
			            }
			        }
				}
				for(int i = 0; i < IniciodoProcesso.controller.dado1; i++) {
					if(i==0) {
						dadoataque.setText(Integer.toString(dado1[i]));
					}
					if(i==1) {
						dadoataque1.setText(Integer.toString(dado1[i]));
					}
					if(i==2) {
						dadoataque2.setText(Integer.toString(dado1[i]));
					}
				}
				rolarataque = 1;
		}
	}
	
	public void rolar1(ActionEvent event) {
		if(rolardefesa == 1) {
			
		}
		else {
			dado2 = new int [3];
			Random rand = new Random();
			for(int i = 0; i < IniciodoProcesso.controller.dado2; i++) {
				dado2[i] = rand.nextInt(6) + 1;
			}
			
			for(int cont = 0; cont< 2; cont++) {
			for (int i = dado2.length; i >= 1; i--) {
	            for (int j = 1; j < i; j++) {
	                if (dado2[j - 1] < dado2[j]) {
	                    int aux = dado2[j];
	                    dado2[j] = dado2[j - 1];
	                    dado2[j - 1] = aux;
	                }
	            }
	        }
			}
			for(int i = 0; i < IniciodoProcesso.controller.dado2; i++) {
				if(i==0) {
					dadodefesa.setText(Integer.toString(dado2[i]));
				}
				if(i==1) {
					dadodefesa1.setText(Integer.toString(dado2[i]));
				}
				if(i==2) {
					dadodefesa2.setText(Integer.toString(dado2[i]));
				}
			}
				rolardefesa = 1;
			}
	}
	
	public void concluir() throws IOException {
		int win = 0, defeat = 0, quantperdida = 0;
		if(IniciodoProcesso.controller.dado1 == IniciodoProcesso.controller.dado2) {
			for(int cont = 0; cont <IniciodoProcesso.controller.dado2 ; cont++) {
				
				if(dado1[cont] <= dado2[cont] && cont == 0) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont] && cont == 0) {
					win++;
				}
				if(dado1[cont] <= dado2[cont] && cont == 1) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont] && cont == 1) {
					win++;
				}
				if(dado1[cont] <= dado2[cont]&& cont == 2) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont]&& cont == 2) {
					win++;
				}
			}
			
			if(defeat!=0) {
				quantperdida = win - defeat;
			}
		}
		
		if(IniciodoProcesso.controller.dado1 < IniciodoProcesso.controller.dado2) {
			for(int cont = 0; cont <IniciodoProcesso.controller.dado2 ; cont++) {
				
				if(dado1[cont] <= dado2[cont] && cont == 0) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont] && cont == 0) {
					win++;
				}
				if(dado1[cont] <= dado2[cont] && cont == 1) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont] && cont == 1) {
					win++;
				}
				if(dado1[cont] <= dado2[cont]&& cont == 2) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont]&& cont == 2) {
					win++;
				}
			}
			
			if(defeat!=0) {
				quantperdida = win - defeat;
			}
		}
		
		if(IniciodoProcesso.controller.dado1 > IniciodoProcesso.controller.dado2) {
			for(int cont = 0; cont <IniciodoProcesso.controller.dado2 ; cont++) {
				
				if(dado1[cont] <= dado2[cont] && cont == 0) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont] && cont == 0) {
					win++;
				}
				if(dado1[cont] <= dado2[cont] && cont == 1) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont] && cont == 1) {
					win++;
				}
				if(dado1[cont] <= dado2[cont]&& cont == 2) {
					defeat++;
				}
				if(dado1[cont] > dado2[cont]&& cont == 2) {
					win++;
				}
			}
			
			if(defeat!=0 && win> defeat) {
				quantperdida = win - defeat;
				Pais pais = IniciodoProcesso.controller.paisorigin;
				pais.exercito = pais.exercito - IniciodoProcesso.controller.dado1;
			}
		}
		if(win>defeat) {
			for(int i = 0; i< IniciodoProcesso.quantJog;i++) {
				Jogador jog = IniciodoProcesso.controller.players.get(i);
				for(Pais pais: jog.paises) {
					if(pais.Nome.equals(IniciodoProcesso.controller.paisdest)) {
						jog.retirarPais(pais);
						Jogador jog1 =IniciodoProcesso.controller.players.get(IniciodoProcesso.controller.jogador);
						jog1.adicionarPais(pais);
					}
				}
			}
			
		}
		if(win == 0) {
			Pais pais = IniciodoProcesso.controller.paisorigin;
			pais.exercito = pais.exercito - IniciodoProcesso.controller.dado1;
		}
		Stage stage = (Stage) dadoataque.getScene().getWindow();
		stage.close();
		controller.inicio();
	}

}
