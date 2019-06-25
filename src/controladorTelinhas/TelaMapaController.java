package controladorTelinhas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import warzika.app.Controller;
import warzika.funcs.Jogador;

public class TelaMapaController implements Initializable {

	
	Scene vitoria;
	
	Scene atu;
	
	@FXML
	public Button b22;
	@FXML
	public Label nome1;
	@FXML
	public Label nome2;
	@FXML
	public Label nome3;
	@FXML
	public Label nome4;
	@FXML
	public Label nome5;
	@FXML
	public Label nome6;
	@FXML
	public Label t1;
	@FXML
	public Label t2;
	@FXML
	public Label t3;
	@FXML
	public Label t4;
	@FXML
	public Label t5;
	@FXML
	public Label t6;
	@FXML
	public Label p1;
	@FXML
	public Label p2;
	@FXML
	public Label p3;
	@FXML
	public Label p4;
	@FXML
	public Label p5;
	@FXML
	public Label p6;
	@FXML
	private Label tjogador;
//	@FXML
//	public Button Brasil;
//	public Button Argentina;
//	public Button Venezuela;
//	public Button Peru;
//	public Button Mexico;
//	public Button California;
//	public Button Nova_York;
//	public Button Labrador;
//	public Button Ottawa;
//	public Button Vancouver;
//	public Button Mackenzie;
//	public Button Alaska;
//	public Button Groenlandia;
//	public Button Islandia;
//	public Button Inglaterra;
//	public Button Suecia;
//	public Button Alemanha;
//	public Button Franca;
//	public Button Polonia;
//	public Button Moscou;
//	public Button Argelia;
//	public Button Egito;
//	public Button Congo;
//	public Button Sudao;
//	public Button Madagascar;
//	public Button Africa_do_Sul;
//	public Button Oriente_Medio;
//	public Button Aral;
//	public Button OMSK;
//	public Button Dudinka;
//	public Button Siberia;
//	public Button Tchita;
//	public Button Mongolia;
//	public Button Vladivostok;
//	public Button China;
//	public Button India;
//	public Button Japao;
//	public Button Vietna;
//	public Button Borneo;
//	public Button Sumatra;
//	public Button Nova_Guine;
//	public Button Australia;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		Brasil.setText("Jogador 1");
		try {
			inicio();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void inicio() throws IOException {
		for(int i = 0; i< IniciodoProcesso.quantJog; i++) {
			Jogador jog = IniciodoProcesso.getPlayers(i);
			if(i==0) {
				nome1.setText("Nome:" + jog.nome);
				t1.setText("Exercito:"+Integer.toString(jog.exercito));
				p1.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==1) {
				nome2.setText("Nome:" + jog.nome);
				t2.setText("Exercito:"+Integer.toString(jog.exercito));
				p2.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==2) {
				nome3.setText("Nome:" + jog.nome);
				t3.setText("Exercito:"+Integer.toString(jog.exercito));
				p3.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==3) {
				nome4.setText("Nome:" + jog.nome);
				t4.setText("Exercito:"+Integer.toString(jog.exercito));
				p4.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==4) {
				nome5.setText("Nome:" + jog.nome);
				t5.setText("Exercito:"+Integer.toString(jog.exercito));
				p5.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==5) {
				nome6.setText("Nome:"+ jog.nome);
				t6.setText("Exercito:"+Integer.toString(jog.exercito));
				p6.setText("Paises:" + Integer.toString(jog.quantpais));
			}
		}
		Jogador jog = IniciodoProcesso.controller.players.get(IniciodoProcesso.controller.jogador);
		tjogador.setText("Jogador atual:	Jogador" + jog.id);
	}

	
	@FXML
	protected void atacar(ActionEvent event) throws IOException{//esse vai para a tela atacar sem fechar a anterior
		try {
			
//			Parent atack = FXMLLoader.load(getClass().getResource("../telinha/menu_atacar.fxml"));
//			Stage stage1 = new Stage();
//			Scene scene1 = new Scene(atack);
//			stage1.setScene(scene1);
//			stage1.show();
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../telinha/menu_atacar.fxml"));
			Parent root = loader.load();
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			ControladorAtack controller = loader.<ControladorAtack>getController();
			controller.setBaseController(this);
			stage.show();
			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	@FXML
	protected void trocarTurno(ActionEvent event) throws IOException {
		for(int i =0; i< IniciodoProcesso.controller.numJogInt; i++ ) {
			Jogador jog = IniciodoProcesso.controller.players.get(i);
			if(jog.quantpais == 42) {
				Stage stage = (Stage) nome1.getScene().getWindow();
				Parent dado = FXMLLoader.load(getClass().getResource("../telinha/tela_vitoria.fxml"));
				vitoria= new Scene(dado);
				stage.setScene(vitoria);
				stage.show();
			}
		}
		if(IniciodoProcesso.controller.jogador == (IniciodoProcesso.controller.numJogInt - 1)) {
			IniciodoProcesso.controller.jogador = 0;
			IniciodoProcesso.controller.turno +=1;
			IniciodoProcesso.controller.distribuirTropas();
		}
		else {
		IniciodoProcesso.controller.jogador+=1;
		if(IniciodoProcesso.controller.players.get(IniciodoProcesso.controller.jogador).quantpais == 0) {
			IniciodoProcesso.controller.jogador+=1;
		}
		System.out.println(IniciodoProcesso.controller.jogador);
		}
		mover();
		inicio();
	}
	
	@FXML
	protected void colocarTropas(ActionEvent event)throws IOException {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../telinha/ColocarTropas.fxml"));
			
			Parent root = loader.load();
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			
			ControladorTropas controller = loader.<ControladorTropas>getController();
			controller.setBaseController(this);
			
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void listarPaisestotal(ActionEvent event) {
		try {
			IniciodoProcesso.controller.paisestj = 0;
			Parent root = FXMLLoader.load(getClass().getResource("../telinha/mostrarPaises.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void listaJogador1() {
		try {
			IniciodoProcesso.controller.paisestj = 1;
			Parent root = FXMLLoader.load(getClass().getResource("../telinha/mostrarPaises.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}

	public void listaJogador2() {
		try {
			IniciodoProcesso.controller.paisestj = 2;
			Parent root = FXMLLoader.load(getClass().getResource("../telinha/mostrarPaises.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
		}
	public void listaJogador3() {
		try {
			IniciodoProcesso.controller.paisestj = 3;
			Parent root = FXMLLoader.load(getClass().getResource("../telinha/mostrarPaises.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void listaJogador4() {
		try {
			IniciodoProcesso.controller.paisestj = 3;
			Parent root = FXMLLoader.load(getClass().getResource("../telinha/mostrarPaises.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void listaJogador5() {
		try {
			IniciodoProcesso.controller.paisestj = 3;
			Parent root = FXMLLoader.load(getClass().getResource("../telinha/mostrarPaises.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void listaJogador6() {
		try {
			IniciodoProcesso.controller.paisestj = 3;
			Parent root = FXMLLoader.load(getClass().getResource("../telinha/mostrarPaises.fxml"));
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void dado() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../telinha/menu_rolardado.fxml"));
			
			Parent root = loader.load();
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			
			ControladorDados controller = loader.<ControladorDados>getController();
			controller.setBaseController(this);
			
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public void mover() { // metodo para mover tropas
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../telinha/finalturno.fxml"));
			
			Parent root = loader.load();
			Stage stage = new Stage();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			
			ControladorTropas controller = loader.<ControladorTropas>getController();
			controller.setBaseController(this);
			
			stage.show();

			} catch (IOException e) {
			e.printStackTrace();
			}
	}
}
