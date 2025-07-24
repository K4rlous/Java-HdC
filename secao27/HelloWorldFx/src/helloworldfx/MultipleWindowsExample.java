package helloworldfx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;


public class MultipleWindowsExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Button button = new Button("Abrir nova janela");
        button.setOnAction(event -> openSecondaryWindow());

        StackPane primaryLayout = new StackPane();
        primaryLayout.getChildren().addAll(button);

        Scene primaryScene = new Scene(primaryLayout, 300, 300);
    

        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }

    // Função para nova janela
    public void openSecondaryWindow(){
        Stage secondaryStage = new Stage();
        Label label = new Label("Janela secundária");
        StackPane secondaryLayout = new StackPane();
        secondaryLayout.getChildren().addAll(label);
        Scene secondaryScene = new Scene(secondaryLayout, 400, 400);
        secondaryStage.setTitle("Janela secundária");
        secondaryStage.setScene(secondaryScene);
        secondaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
