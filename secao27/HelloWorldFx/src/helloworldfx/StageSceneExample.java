package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StageSceneExample extends Application {
     @Override
    public void start(Stage primaryStage) throws Exception{

        // Criar botão
        Button btn = new Button("Clique aqui");

        // Criar layout e adicionar o botão
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Criando uma cena com o layout
        Scene scene = new Scene(root, 400, 300);

        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
