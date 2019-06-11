package controladorTelinhas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class tela2Controller implements Initializable{
	
	@FXML
	public ChoiceBox<String> choice1;
	public Label label1;
	
	static ObservableList<String> list = FXCollections.observableArrayList();	
	
	public static void valores_choiceBox() {
		//ChoiceBox<String> choicebox = new Choicebox<>;
		list.removeAll();
		String a = "3";
		String b = "4";
		String c = "5";
		String d = "6";
		list.addAll(a,b,c,d);
		choice1.getItems().addAll(list);
	}

	public void confirmar() {
		IniciodoProcesso.ChangeScreen("nome");
		String a = choice1.getValue();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		valores_choiceBox();
		choice1.setValue("3");
	}

	public String pegarDados() {
		return choice1.getValue();
	}
	



}
