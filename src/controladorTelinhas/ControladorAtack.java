package controladorTelinhas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import geo.Pais;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import warzika.funcs.Jogador;

public class ControladorAtack implements Initializable{

	Scene dados;
	
	@FXML
	private ComboBox<String> choice1;
	@FXML
	private ComboBox<String> choice2;
	@FXML
	private TextField quantTropas;
	
	ObservableList<String> list = FXCollections.observableArrayList();
	
	ObservableList<String> list1 = FXCollections.observableArrayList();
	
	public void valores_choiceBox1() {
		list.removeAll();
		int a = IniciodoProcesso.controller.jogador;
		Jogador jog = IniciodoProcesso.controller.players.get(a);
		for(int i = 0; i<jog.quantpais ;i++) {
			list.add(jog.getPaises(i));
		}
		choice1.getItems().addAll(list);
		
	}
	
	public void valores_choiceBox2() {
		choice2.getItems().clear();
		list1.removeAll(list1);
		String pais = choice1.getValue();
		int a = IniciodoProcesso.controller.jogador;
		Jogador jog = IniciodoProcesso.controller.players.get(a);
		for(Pais isso : jog.paises ) {
			if(pais.equals(isso.Nome)) {
				for(int cont = 0; cont< isso.fronteiras.size();cont++) {
					list1.add(isso.getFronteiras(cont));
				}
			}
		}
		choice2.getItems().addAll(list1);
		}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		valores_choiceBox1();
		for(int i = 0; i < 13 ; i++) {
		Pais pai = IniciodoProcesso.controller.paisrep.get(i);
		System.out.println(pai.Nome);
		
	}
	}
	@FXML
	private void ataque()throws IOException { // ataque so pode ter 3 pe�as
		if(Integer.parseInt(quantTropas.getText()) > 3) {
			Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("Di�logo de informa��o");
            dialogoInfo.setHeaderText("S� pode atacar tr�s tropas por vez");
            dialogoInfo.showAndWait();
		}
		else {
		IniciodoProcesso.controller.dado1 = Integer.parseInt(quantTropas.getText());
		String paisori = choice1.getValue();
		int jogAtual = IniciodoProcesso.controller.jogador;
		Jogador jog = IniciodoProcesso.controller.players.get(jogAtual);
		//String paisdes = choice2.getValue();
		for(Pais isso : jog.paises ) {
			if(paisori.equals(isso.Nome)) {
				IniciodoProcesso.controller.pais = isso;
				int trop = isso.getTropas();
				break;
			}
		}
		Stage stage = (Stage) choice2.getScene().getWindow();
		Parent dado = FXMLLoader.load(getClass().getResource("../telinha/menu_rolardado.fxml"));
		dados = new Scene(dado);
		stage.setScene(dados);
		stage.show();
		}
//		try {
//			event.consume();
//			Stage stage = (Stage) choice1.getScene().getWindow();
//			Parent root = FXMLLoader.load(getClass().getResource("../telinha/menu_rolardado.fxml"));
//			Stage stage1 = new Stage();
//			Scene scene = new Scene(root);
//			stage1.setScene(scene);
//			Platform.exit();
//			stage1.show();
//			stage.close();
//
//		} catch (IOException e) {
//		e.printStackTrace();
//		}
//		
	}
	

}