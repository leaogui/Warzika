package controladorTelinhas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import geo.Pais;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import warzika.funcs.Jogador;

public class ControllerMPaises implements Initializable{

	@FXML
	public Label l1;
	@FXML
	public Label l2;
	@FXML
	public Label l3;
	@FXML
	public Label l4;
	@FXML
	public Label l5;
	@FXML
	public Label l6;
	@FXML
	public Label l7;
	@FXML
	public Label l8;
	@FXML
	public Label l9;
	@FXML
	public Label l10;
	@FXML
	public Label l11;
	@FXML
	public Label l12;
	@FXML
	public Label l13;
	@FXML
	public Label l14;
	@FXML
	public Label l15;
	@FXML
	public Label l16;
	@FXML
	public Label l17;
	@FXML
	public Label l18;
	@FXML
	public Label l19;
	@FXML
	public Label l20;
	@FXML
	public Label l21;
	@FXML
	public Label l22;
	@FXML
	public Label l23;
	@FXML
	public Label l24;
	@FXML
	public Label l25;
	@FXML
	public Label l26;
	@FXML
	public Label l27;
	@FXML
	public Label l28;
	@FXML
	public Label l29;
	@FXML
	public Label l30;
	@FXML
	public Label l31;
	@FXML
	public Label l32;
	@FXML
	public Label l33;
	@FXML
	public Label l34;
	@FXML
	public Label l35;
	@FXML
	public Label l36;
	@FXML
	public Label l37;
	@FXML
	public Label l38;
	@FXML
	public Label l39;
	@FXML
	public Label l40;
	@FXML
	public Label l41;
	@FXML
	public Label l42;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println(IniciodoProcesso.controller.paisestj );
		if(IniciodoProcesso.controller.paisestj == 0) {
			
			total();
		}
		else {
			jogadores();
		}
	}
	
	public void jogadores() {
		Jogador jog = IniciodoProcesso.controller.players.get(IniciodoProcesso.controller.paisestj - 1);
		
		for(int i = 0;i < jog.quantpais || i < IniciodoProcesso.controller.paisrep.size(); i++) {
			if(i == 0) {
				l1.setText("");
			}
			if(i == 1) {
				l2.setText("");
				}
			if(i == 2) {
				l3.setText("");
				}
			if(i == 3) {
				l4.setText("");
				}
			if(i == 4) {
				l5.setText("");
				}
			if(i == 5) {
				l6.setText("");
				}
			if(i == 6) {
				l7.setText("");
				}
			if(i == 7) {
				l8.setText("");
				}
			if(i == 8) {
				l9.setText("");
				}
			if(i == 9) {
				l10.setText("");
				}
			if(i == 10) {
				l11.setText("");
				}
			if(i == 11) {
				l12.setText("");
				}
			if(i == 12) {
				l13.setText("");
				}
			if(i == 13) {
				l14.setText("");
				}
			if(i == 14) {
				l15.setText("");
				}
			if(i == 15) {
				l16.setText("");
				}
			if(i == 16) {
				l17.setText("");
				}
			if(i == 17) {
				l18.setText("");
				}
			if(i == 18) {
				l19.setText("");
				}
			if(i == 19) {
				l20.setText("");
				}
			if(i == 20) {
				l21.setText("");
				}
			if(i == 21) {
				l22.setText("");
				}
			if(i == 22) {
				l23.setText("");
				}
			if(i == 23) {
				l24.setText("");
				}
			if(i == 24) {
				l25.setText("");
				}
			if(i == 25) {
				l26.setText("");
				}
			if(i == 26) {
				l27.setText("");
				}
			if(i == 27) {
				l28.setText("");
				}
			if(i == 28) {
				l29.setText("");
				}
			if(i == 29) {
				l30.setText("");
				}
			if(i == 30) {
				l31.setText("");
				}
			if(i == 31) {
				l32.setText("");
				}
			if(i == 32) {
				l33.setText("");
				}
			if(i == 33) {
				l34.setText("");
				}
			if(i == 34) {
				l35.setText("");
				}
			if(i == 35) {
				l36.setText("");
				}
			if(i == 36) {
				l37.setText("");
				}
			if(i == 37) {
				l38.setText("");
				}
			if(i == 38) {
				l39.setText("");
				}
			if(i == 39) {
				l40.setText("");
				}
			if(i == 40) {
				l41.setText("");
				}
			if(i == 41) {
				l42.setText("");
				}
		}
		for(int cont = 0; cont< IniciodoProcesso.controller.paisrep.size(); cont++) {
			Pais pais = IniciodoProcesso.controller.paisrep.get(cont);
		for(int i =0;i<jog.paises.size();i++) {
			String pais1 = jog.getPaises(i);
			if(pais.Nome.equals(pais1)) {
				if(i == 0) {
					l1.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 1) {
				l2.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 2) {
				l3.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 3) {
				l4.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 4) {
				l5.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 5) {
				l6.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 6) {
				l7.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 7) {
				l8.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 8) {
				l9.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 9) {
				l10.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 10) {
				l11.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 11) {
				l12.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 12) {
				l13.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 13) {
				l14.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 14) {
				l15.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 15) {
				l16.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 16) {
				l17.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 17) {
				l18.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 18) {
				l19.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 19) {
				l20.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 20) {
				l21.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 21) {
				l22.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 22) {
				l23.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 23) {
				l24.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 24) {
				l25.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 25) {
				l26.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 26) {
				l27.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 27) {
				l28.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 28) {
				l29.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 29) {
				l30.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 30) {
				l31.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 31) {
				l32.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 32) {
				l33.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 33) {
				l34.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 34) {
				l35.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 35) {
				l36.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 36) {
				l37.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 37) {
				l38.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 38) {
				l39.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 39) {
				l40.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 40) {
				l41.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
			if(i == 41) {
				l42.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
				}
		}
		}
		}
		}
	
	
	public void total() {
		int quantpais = 0;
			for(int cont = 0; cont< IniciodoProcesso.controller.players.size();cont++) {
				Jogador jog = IniciodoProcesso.controller.players.get(cont);
			for(int a = 0; a < jog.quantpais; a++) {
				for(int i =0;i<IniciodoProcesso.controller.paisrep.size();i++) {
					Pais pais = IniciodoProcesso.controller.paisrep.get(i);
					String npais = jog.getPaises(a);
					if(npais.equals(pais.Nome)){
						if(quantpais == 0) {
							l1.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
					}
						if(quantpais == 1) {
							l2.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 2) {
							l3.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 3) {
							l4.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 4) {
							l5.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 5) {
							l6.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 6) {
							l7.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 7) {
							l8.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 8) {
							l9.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 9) {
							l10.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 10) {
							l11.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 11) {
							l12.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 12) {
							l13.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 13) {
							l14.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 14) {
							l15.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 15) {
							l16.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 16) {
							l17.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 17) {
							l18.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 18) {
							l19.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 19) {
							l20.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 20) {
							l21.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 21) {
							l22.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 22) {
							l23.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 23) {
							l24.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 24) {
							l25.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 25) {
							l26.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 26) {
							l27.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 27) {
							l28.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 28) {
							l29.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 29) {
							l30.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 30) {
							l31.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 31) {
							l32.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 32) {
							l33.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 33) {
							l34.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 34) {
							l35.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 35) {
							l36.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 36) {
							l37.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 37) {
							l38.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 38) {
							l39.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 39) {
							l40.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 40) {
							l41.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
						if(quantpais == 41) {
							l42.setText(pais.Nome + " exercito:" +pais.exercito + " nome:" + jog.nome);
							}
				quantpais++;
				}
		}
	}
			}

	}

	public void Voltar() throws IOException {
		Stage stage = (Stage) l1.getScene().getWindow();
		TelaMapaController isso =  new TelaMapaController();
		stage.close();
	}
}
