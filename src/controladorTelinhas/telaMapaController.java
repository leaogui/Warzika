package controladorTelinhas;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import warzika.app.Controller;
import warzika.funcs.Jogador;

public class telaMapaController extends Application {

	Controller control;
	public int quantJog;
	
	@FXML
	AnchorPane anchoPane;
	private Label nome1;
	private Label nome2;
	private Label nome3;
	private Label nome4;
	private Label nome5;
	private Label nome6;
	private Label t1;
	private Label t2;
	private Label t3;
	private Label t4;
	private Label t5;
	private Label t6;
	private Label p1;
	private Label p2;
	private Label p3;
	private Label p4;
	private Label p5;
	private Label p6;
	public Button Brasil;
	public Button Argentina;
	public Button Venezuela;
	public Button Peru;
	public Button Mexico;
	public Button California;
	public Button Nova_York;
	public Button Labrador;
	public Button Ottawa;
	public Button Vancouver;
	public Button Mackenzie;
	public Button Alaska;
	public Button Groenlandia;
	public Button Islandia;
	public Button Inglaterra;
	public Button Suecia;
	public Button Alemanha;
	public Button Franca;
	public Button Polonia;
	public Button Moscou;
	public Button Argelia;
	public Button Egito;
	public Button Congo;
	public Button Sudao;
	public Button Madagascar;
	public Button Africa_do_Sul;
	public Button Oriente_Medio;
	public Button Aral;
	public Button OMSK;
	public Button Dudinka;
	public Button Siberia;
	public Button Tchita;
	public Button Mongolia;
	public Button Vladivostok;
	public Button China;
	public Button India;
	public Button Japao;
	public Button Vietna;
	public Button Borneo;
	public Button Sumatra;
	public Button Nova_Guine;
	public Button Australia;
	
	@Override
	public void start(Stage arg0) throws Exception {
			
		for(int i = 1; i< quantJog; i++) {
			Jogador jog = control.players.get(i);
			if(i==1) {
				nome1.setText("Nome:" + jog.nome);
				t1.setText("Exercito:"+Integer.toString(jog.exercito));
				p1.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==2) {
				nome2.setText("Nome:" + jog.nome);
				t2.setText("Exercito:"+Integer.toString(jog.exercito));
				p2.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==3) {
				nome3.setText("Nome:" + jog.nome);
				t3.setText("Exercito:"+Integer.toString(jog.exercito));
				p3.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==4) {
				nome4.setText("Nome:" + jog.nome);
				t4.setText("Exercito:"+Integer.toString(jog.exercito));
				p4.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==5) {
				nome5.setText("Nome:" + jog.nome);
				t5.setText("Exercito:"+Integer.toString(jog.exercito));
				p5.setText("Paises:" + Integer.toString(jog.quantpais));
			}
			if(i==6) {
				nome6.setText("Nome:"+ jog.nome);
				t6.setText("Exercito:"+Integer.toString(jog.exercito));
				p6.setText("Paises:" + Integer.toString(jog.quantpais));
			}
		}
		while(true) {
			
		}
	}
	
	@FXML
	public void atacar(ActionEvent event) throws IOException{//esse vai para a tela atavar sem fechar a anterior
		try {
	        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../telinha/menu_atacar.fxml"));
	        fxmlLoader.setController(this);
	        Node n = (Node) fxmlLoader.load();
	        anchoPane.getChildren().add(n);
	    } catch (Exception ex) {
	    }
	}

}
