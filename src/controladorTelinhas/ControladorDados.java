package controladorTelinhas;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import geo.Pais;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import warzika.funcs.Jogador;

public class ControladorDados implements Initializable{
	
	int rolarataque;
	
	int rolardefesa;
	
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void rolar(ActionEvent event) {
		if(rolarataque == 1) {
			
			}
		else {
			int n = 3, flag, salve = 0;
			int[] dado1;
			dado1 = new int [3];
				Random rand = new Random();
				
				for(int i = 0; i < IniciodoProcesso.controller.dado1; i++) {
					dado1[i] = rand.nextInt(6) + 1;
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
				for(int i=0;i<n-1;i++){
					flag = 0;
					for(int j=0;j<n-1-i;j++){
						if(dado1[j]<dado1[j+1]){
							flag = 1;
							salve = dado1[j];
							dado1[j] = dado1[j+1];
							dado1[j+1] = salve;
						}
					}
				if(flag==0){
					break;
					}
				}
				rolarataque = 1;
		}
	}
	
	public void rolar1(ActionEvent event) {
		if(rolardefesa == 1) {
			
		}
		else {
			int n = 3, flag, salve = 0;
			int[] dado1;
			dado1 = new int [3];
				
				Random rand = new Random();
			
				for(int i = 0; i < IniciodoProcesso.controller.dado2; i++) {
					dado1[i] = rand.nextInt(6) + 1;
					if(i==0) {
						dadodefesa.setText(Integer.toString(dado1[i]));
					}
					if(i==1) {
						dadodefesa1.setText(Integer.toString(dado1[i]));
					}
					if(i==2) {
						dadodefesa2.setText(Integer.toString(dado1[i]));
					}
				}
				for(int i=0;i<n-1;i++){
					flag = 0;
					for(int j=0;j<n-1-i;j++){
						if(dado1[j]<dado1[j+1]){
							flag = 1;
							salve = dado1[j];
							dado1[j] = dado1[j+1];
							dado1[j+1] = salve;
						}
					}
				if(flag==0){
					break;
					}
				}
				rolardefesa = 1;
			}
	}
	
	public void concluir() {
		int win = 0, defeat = 0;
		if(Integer.getInteger(dadodefesa.getText()) < Integer.getInteger(dadoataque.getText())) {
			defeat++;
		}
		else {
			win++;
		}
		if(Integer.getInteger(dadodefesa1.getText()) < Integer.getInteger(dadoataque1.getText())) {
			defeat++;
		}
		else {
			win++;
		}
		if(Integer.getInteger(dadodefesa2.getText()) < Integer.getInteger(dadoataque2.getText())) {
			defeat++;
		}
		else {
			win++;
		}
		if(defeat!=0) {
			win = win - defeat;
		}
		if(win>defeat) {
			for(int i = 0; i< IniciodoProcesso.controller.numJogInt;i++) {
				Jogador jog = IniciodoProcesso.controller.players.get(IniciodoProcesso.controller.jogador);
				for(Pais isso: jog.paises) {
					if(isso.Nome.equals(IniciodoProcesso.controller.pais.Nome)) {
						jog.retirarPais(isso);
						Jogador jog1 = IniciodoProcesso.controller.players.get(IniciodoProcesso.controller.jogador);
						jog1.adicionarPais(isso);
					}
				}
			}
			
			//jog.adicionarPais(IniciodoProcesso.controller.pais);
		}
	}

}
