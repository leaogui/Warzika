package controladorTelinhas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import warzika.app.Controller;
import warzika.funcs.Jogador;

public class tela_nomesController implements Initializable {

	Controller controller = new Controller();
	
	public int i;
	int cont = 1;
	Scene mapas;
	@FXML
	TextField text1;
	
	public void confirmar() throws IOException {
		Jogador jog = new Jogador(text1.getText(),cont);
		IniciodoProcesso.controller.numJogInt = i;
		IniciodoProcesso.controller.players.add(jog);
		System.out.println(jog.nome);
		text1.clear();
		if(cont == i) {
			Stage stage = (Stage) text1.getScene().getWindow();
			//System.out.println(i);
			if(i == 3) {
				IniciodoProcesso.controller.comeco();
				Parent mapa3 = FXMLLoader.load(getClass().getResource("../telinha/tela_3jogadores.fxml"));
				mapas = new Scene(mapa3);
				stage.setScene(mapas);
				stage.show();
				//FXMLLoader loader  = new FXMLLoader();
//				Parent tres = loader.load(getClass().getResource("../telinha/tela_3jogadores.fxml").openStream());
//				telaMapaController mapa = (telaMapaController)loader.getController();
//				mapa.control = control;
//				mapa.quantJog = i;
//				Scene scene = new Scene(tres);
//				stage.setScene(scene);
//				stage.setResizable(false);
//				stage.show();
			}
			if(i == 4) {
//				IniciodoProcesso.controller.comeco();
//				FXMLLoader loader  = new FXMLLoader();
//				Parent quart = loader.load(getClass().getResource("../telinha/tela_4jogadores.fxml").openStream());
//				telaMapaController mapa = (telaMapaController)loader.getController();
//				mapa.control = IniciodoProcesso.controller;
//				mapa.quantJog = i;
//				Scene scene = new Scene(quart);
//				stage.setScene(scene);
//				stage.setResizable(false);
//				stage.show();
			}
			if(i == 5) {
//				IniciodoProcesso.controller.comeco();
//				FXMLLoader loader  = new FXMLLoader();
//				Parent cinco = loader.load(getClass().getResource("../telinha/tela_5jogadores.fxml").openStream());
//				telaMapaController mapa = (telaMapaController)loader.getController();
//				mapa.control = IniciodoProcesso.controller;
//				mapa.quantJog = i;
//				Scene scene = new Scene(cinco);
//				stage.setScene(scene);
//				stage.setResizable(false);
//				stage.show();
			}
			if(i==6) {
//				IniciodoProcesso.control.comeco();
//				FXMLLoader loader  = new FXMLLoader();
//				Parent seis = loader.load(getClass().getResource("../telinha/tela_6jogadores.fxml").openStream());
//				telaMapaController mapa = (telaMapaController)loader.getController();
//				mapa.control = IniciodoProcesso.control;
//				mapa.quantJog = i;
//				Scene scene = new Scene(seis);
//				stage.setScene(scene);
//				stage.setResizable(false);
//				stage.show();
			}
			//IniciodoProcesso.ChangeScreen("");//tem que fazer mais telas
		}
		cont++;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		i = IniciodoProcesso.quantJog;
	}
	
	public void voltar() throws IOException {
		Stage stage = (Stage) text1.getScene().getWindow();
		Parent voltar = FXMLLoader.load(getClass().getResource("../telinha/quantidade_players.fxml"));
		Scene scene = new Scene(voltar);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
	}
	}

