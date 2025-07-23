package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonLabelExampleextends extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        // Criando uma Label
        Label label = new Label("Olá, Mundo!");

        Button button = new Button("Clique Aqui");

        // Evento no botão
        button.setOnAction(event -> {
            label.setText("Botão foi clicado!");
        });

        // Vamos usar um layout VBox para organizar os componentes verticalmente
        VBox vbox = new VBox();
        vbox.getChildren().addAll(label, button);

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 400, 300);

        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
