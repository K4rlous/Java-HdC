package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
     @Override
    public void start(Stage primaryStage) throws Exception{

        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");
        Button button4 = new Button("Botão 4");
        Button button5 = new Button("Botão 5");
        Button button6 = new Button("Botão 6");

        // Criar o gridPane
        GridPane gridPane = new GridPane();
        gridPane.add(button1, 0, 0); // Adiciona o botão na posição (0, 0)
        gridPane.add(button2, 0, 1); // Adiciona o botão na posição (0, 1)
        gridPane.add(button3, 1, 0); // Adiciona o botão na posição (1, 0)
        gridPane.add(button4, 1, 1); // Adiciona o botão na posição (1, 1)
        gridPane.add(button5, 2, 2); // Adiciona o botão na posição (2, 2)
        gridPane.add(button6, 2, 1); // Adiciona o botão na posição (2, 1)

        gridPane.setHgap(10); // Espaçamento horizontal entre as colunas
        gridPane.setVgap(10); // Espaçamento vertical entre as linhas

      


        // Criando uma cena com o layout
        Scene scene = new Scene(gridPane, 400, 300);

        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
    
