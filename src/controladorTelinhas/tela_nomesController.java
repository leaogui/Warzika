package controladorTelinhas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class tela_nomesController implements Initializable {

	int i = 0;
	
	@FXML
	TextField text1;
	
	public void confirmar() {
		tela2Controller dado = new tela2Controller();
		String oi = dado.pegarDados();
		int a = Integer.parseInt(oi);
		while(i < a) {
			text1.clear();
		if(i == a) {
			IniciodoProcesso.ChangeScreen("");//tem que fazer mais telas
			break;
		}
	}
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
