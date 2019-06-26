package controladorTelinhas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class tela_inicialController implements Initializable {

	
	@FXML
	protected void button1Action(ActionEvent event) throws IOException{	
		Parent quant = FXMLLoader.load(getClass().getResource("../telinha/quantidade_players.fxml"));
		IniciodoProcesso.ChangeScreen("quant",quant);
	}
	
	@FXML
	private void button2Action(ActionEvent event) throws IOException {
		Parent sobre = FXMLLoader.load(getClass().getResource("../telinha/tela_sobre.fxml"));
		IniciodoProcesso.ChangeScreen("sobre",sobre);
	}
	
	@FXML
	private void button3Action(ActionEvent event) {
		IniciodoProcesso.Fechar();
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
	
	

}
