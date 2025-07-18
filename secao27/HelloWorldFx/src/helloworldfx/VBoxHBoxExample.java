package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class VBoxHBoxExample extends Application {
     @Override
    public void start(Stage primaryStage) throws Exception{

       // Criar alguns botões vbox
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");

        VBox vbox = new VBox(15); // Espaçamento de 15 pixels
        vbox.getChildren().addAll(btn1, btn2, btn3); // Adiciona os botões ao vbox
        
        // Criar alguns botões hbox
        Button btn4 = new Button("Botão A");
        Button btn5 = new Button("Botão B");
        Button btn6 = new Button("Botão C");

        HBox hbox = new HBox(25); // Espaçamento de 15 pixels
        hbox.getChildren().addAll(btn4, btn5, btn6);

        VBox root = new VBox(20); // Espaçamento de 10 pixels
        root.getChildren().addAll(vbox, hbox); // Adiciona o vbox e o hbox ao root

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
