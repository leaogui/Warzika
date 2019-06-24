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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import warzika.funcs.Jogador;

public class ControladorTropas implements Initializable{
	
	Scene mapa;

	@FXML
	private ComboBox<String> comb;
	
	@FXML
	private TextField quantTropas;
	
	@FXML
	private Button colocar;
	
	ObservableList<String> list = FXCollections.observableArrayList();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		valores_choiceBox2();
		
	}
	
	
	public void valores_choiceBox2() {
		list.removeAll();
		int a = IniciodoProcesso.controller.jogador;
		Jogador jog = IniciodoProcesso.controller.players.get(a);
		for(int i = 0; i<jog.quantpais ;i++) {
			list.add(jog.getPaises(i));
		}
		comb.getItems().addAll(list);
	}
	
	public void colocarTropas() throws IOException {
		String npais = comb.getValue();
		int tropas = Integer.parseInt(quantTropas.getText());
		int a = IniciodoProcesso.controller.jogador;
		Jogador jog = IniciodoProcesso.controller.players.get(a);
		if(jog.exercito - tropas < 0) {
			Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("Diálogo de informação");
            dialogoInfo.setHeaderText("Exercito maior do que tem");
            dialogoInfo.showAndWait();
		}
		else {
		for(Pais isso : jog.paises ) {
			if(npais.equals(isso.Nome)) {
				isso.addTropas(tropas);
			}
		}
		jog.exercito = jog.exercito - tropas;
		Stage stage = (Stage) comb.getScene().getWindow();
		telaMapaController isso =  new telaMapaController();
		isso.atualizar();
		stage.close();
		}
	}
	
	

}
