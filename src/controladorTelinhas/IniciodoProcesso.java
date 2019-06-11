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
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		
		primaryStage.setTitle("Warzika");
		
		Parent inicio = FXMLLoader.load(getClass().getResource("../telinha/tela_inicial.fxml"));
		pritela = new Scene(inicio);
		
		Parent jog = FXMLLoader.load(getClass().getResource("../telinha/quantidade_players.fxml"));
		quantijog = new Scene(jog);
		
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
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
