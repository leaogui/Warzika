package controladorTelinhas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IniciodoProcesso extends Application{

	private static Stage stage;
	
	private static Scene pritela;
	private static Scene quantijog;
	private static Scene nome;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		
		primaryStage.setTitle("Warzika");
		
		Parent inicio = FXMLLoader.load(getClass().getResource("../telinha/tela_inicial.fxml"));
		pritela = new Scene(inicio);
		
		Parent jog = FXMLLoader.load(getClass().getResource("../telinha/quantidade_players.fxml"));
		
		quantijog = new Scene(jog);
		
		FXMLLoader loader = new FXMLLoader();
		Parent nomePlayer = FXMLLoader.load(getClass().getResource("../telinha/Nome Jogador.fxml").openStream());
		tela_nomesController nomeController = (tela_nomesController)loader.getController();
		nome = new Scene(nomePlayer);
		
		primaryStage.setScene(pritela);
		primaryStage.show();	
		
	}
	
	public static void ChangeScreen(String scr) {
		switch (scr) {
			case "main":
				stage.setScene(pritela);
				break;
			case "quant":
				stage.setScene(quantijog);
				break;
			case "nome":
				stage.setScene(nome);
				break;
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	public static void Fechar() {
		stage.close();
		//primaryStage.close();
	}
}
