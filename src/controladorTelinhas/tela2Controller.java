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
		// TODO Auto-generated method stub
		valores_choiceBox();
		choice1.setValue("3");
	}

	
	public void TrocaEvent(ActionEvent event)throws IOException{
		Stage stage = (Stage) choice1.getScene().getWindow();
		FXMLLoader loader  = new FXMLLoader();
		Pane root = loader.load(getClass().getResource("../telinha/NomeJogador.fxml").openStream());
		tela_nomesController nome = (tela_nomesController)loader.getController();
		nome.i = Integer.parseInt(choice1.getValue());
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	public void voltar(ActionEvent event) throws IOException {
		Stage stage = (Stage) choice1.getScene().getWindow();
		Parent voltar = FXMLLoader.load(getClass().getResource("../telinha/tela_inicial.fxml"));
		Scene scene = new Scene(voltar);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}


}
