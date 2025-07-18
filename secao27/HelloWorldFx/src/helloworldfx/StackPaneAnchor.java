package helloworldfx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StackPaneAnchor extends Application {
     @Override
    public void start(Stage primaryStage) throws Exception{

        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");
        Button button4 = new Button("Botão 4");
        Button button5 = new Button("Botão 5");
        Button button6 = new Button("Botão 6");

        // Criar o staclePane
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(button1, button2);
      
        Scene stackScene = new Scene(stackPane, 400, 300);

        // Criar o anchorPane
        AnchorPane anchorPane = new AnchorPane();

        AnchorPane.setTopAnchor(button3, 10.0);
        AnchorPane.setRightAnchor(button3, 10.0);

        anchorPane.getChildren().add(button3);

        Scene anchorScene = new Scene(anchorPane, 400, 300);


        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(stackScene);
        primaryStage.show();

        // mudar a cena para o anchorPane após 2 segundos
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                Platform.runLater(() -> {
                    primaryStage.setScene(anchorScene);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
