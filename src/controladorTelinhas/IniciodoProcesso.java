package controladorTelinhas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import warzika.app.Controller;
import warzika.funcs.Jogador;

public class IniciodoProcesso extends Application{
	
	public static int quantJog;
	public static Controller controller = new Controller();

	private static Stage stage;
	
	private static Scene pritela;
	private static Scene quantijog;
	private static Scene nome;
	private static Scene sobre;
	private static Scene mapas;
	
	public void addPlayer(Jogador jog){
		controller.players.add(jog);
	}
	
	public static Jogador getPlayers(int cont) {
		Jogador jog = controller.players.get(cont);
		return jog;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = primaryStage;
		
		primaryStage.setTitle("Warzika");
		
		Parent inicio = FXMLLoader.load(getClass().getResource("../telinha/tela_inicial.fxml"));
		pritela = new Scene(inicio);
		
		Parent sobre1 = FXMLLoader.load(getClass().getResource("../telinha/tela_sobre.fxml"));
		sobre = new Scene(sobre1);
		
		Parent jog = FXMLLoader.load(getClass().getResource("../telinha/quantidade_players.fxml"));
		
		quantijog = new Scene(jog);
		
		FXMLLoader loader = new FXMLLoader();
		
		primaryStage.setScene(pritela);
		primaryStage.show();	
	}
	
	public static void ChangeScreen(String scr,Parent scene) {
		switch (scr) {
			case "main":
				stage.setScene(pritela);
				break;
			case "quant":
				stage.setScene(quantijog);
				break;
			case "nome":
				nome = new Scene(scene);
				stage.setScene(nome);
				break;
			case "sobre":
				stage.setScene(sobre);
				break;
			case "mapas":
				mapas = new Scene(scene);
				stage.setScene(mapas);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		FXMLLoader loader  = new FXMLLoader();
		telaMapaController isso = (telaMapaController)loader.getController(); 
	}

	public static void Fechar() {
		stage.close();
		//primaryStage.close();
	}
	
}
