package controladorTelinhas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class tela2Controller implements Initializable{
	
	
	Scene nome;
	Scene pritela;
	@FXML
	public ChoiceBox<String> choice1;
	public Label label1;
	
	ObservableList<String> list = FXCollections.observableArrayList();	
	
	public void valores_choiceBox() {
		list.removeAll();
		String a = "3";
		String b = "4";
		String c = "5";
		String d = "6";
		list.addAll(a,b,c,d);
		choice1.getItems().addAll(list);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		valores_choiceBox();
		choice1.setValue("3");
	}

	
	public void TrocaEvent(ActionEvent event)throws IOException{
		Stage stage = (Stage) choice1.getScene().getWindow();
		IniciodoProcesso.quantJog = Integer.parseInt(choice1.getValue());
		Parent nomeJog = FXMLLoader.load(getClass().getResource("../telinha/NomeJogador.fxml"));
		nome = new Scene(nomeJog);
		stage.setScene(nome);
		stage.show();
		
	}
	
	public void voltar(ActionEvent event) throws IOException {
		Stage stage = (Stage) choice1.getScene().getWindow();
		Parent main = FXMLLoader.load(getClass().getResource("../telinha/tela_inicial.fxml"));
		IniciodoProcesso.ChangeScreen("pritela",main);
		pritela = new Scene(main);
		stage.setScene(pritela);
		stage.show();

	}


}
