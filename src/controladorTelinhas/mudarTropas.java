package controladorTelinhas;

import java.net.URL;
import java.util.ResourceBundle;

import geo.Pais;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import warzika.funcs.Jogador;

public class mudarTropas implements Initializable{

	private TelaMapaController controller;
	
	@FXML
	public ComboBox choice1;
	@FXML
	public ComboBox choice2;
	@FXML
	public Button mover;
	@FXML
	public Button finalizar;
	@FXML
	private TextField quantTropas;
	
	ObservableList<String> list = FXCollections.observableArrayList();
	ObservableList<String> list1 = FXCollections.observableArrayList();
	
	public void setBaseController(TelaMapaController controller) {
		this.controller = controller;
	}
	
	public void mover() {
		Pais origin = null, dest = null;
		if(choice1.getValue().equals(null) || choice2.getValue().equals(null)) {
			Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("Diálogo de informação");
            dialogoInfo.setHeaderText("Selecione um pais para pegar as tropas ou para colocar");
            dialogoInfo.showAndWait();
		}
		else {
			for(Pais pais : IniciodoProcesso.controller.paisrep) {
				if(pais.Nome.equals(choice1.getValue())) {
					origin = pais;
				}
				if(pais.Nome.equals(choice2.getValue())) {
					dest = pais;
				}
			}
			int tropas = Integer.parseInt(quantTropas.getText());
			dest.exercito = dest.exercito + tropas;
			origin.exercito = origin.exercito - tropas;
		}
	}
	
	public void finalizar() {
		Stage stage = (Stage) choice1.getScene().getWindow();
		TelaMapaController isso =  new TelaMapaController();
		stage.close();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		choice1colocar();
		
	}
	
	public void choice1colocar() {
		list.removeAll();
		int a = IniciodoProcesso.controller.jogador;
		Jogador jog = IniciodoProcesso.controller.players.get(a - 1);
		for(int i = 0; i<jog.quantpais ;i++) {
			list.add(jog.getPaises(i));
		}
		choice1.getItems().addAll(list);
	}
	
	public void choice2colocar() {
		choice2.getItems().clear();
		list1.removeAll(list1);
		int a = IniciodoProcesso.controller.jogador;
		Jogador jog = IniciodoProcesso.controller.players.get(a- 1);
		for(int i = 0; i<jog.quantpais ;i++) {
			list1.add(jog.getPaises(i));
			Pais pais = jog.getPais(i);
			if(choice1.getValue().equals(pais.Nome)) {
				list1.remove(i);
			}
		}
		choice2.getItems().addAll(list1);
	}

}
