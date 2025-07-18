package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
     @Override
    public void start(Stage primaryStage) throws Exception{

        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");
        Button button4 = new Button("Botão 4");
        Button button5 = new Button("Botão 5");
        Button button6 = new Button("Botão 6");

       // Criando o BorderPane
       BorderPane borderPane = new BorderPane();

        borderPane.setTop(button1); // Adiciona o botão na parte superior
        borderPane.setBottom(button2); // Adiciona o botão na parte inferior
        borderPane.setLeft(button3); // Adiciona o botão na parte esquerda
        borderPane.setRight(button4); // Adiciona o botão na parte direita
        borderPane.setCenter(button5); // Adiciona o botão no centro
        borderPane.setTop(button6); // Adiciona outro botão na parte superior, sobrepondo o primeiro


        // Criando uma cena com o layout
        Scene scene = new Scene(borderPane, 400, 300);

        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
    

