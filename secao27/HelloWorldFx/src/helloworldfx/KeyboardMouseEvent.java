package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class KeyboardMouseEvent extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Label label = new Label("Interaja com o seu teclado");
     
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Capturar eventos de teclado
        root.setOnKeyPressed(event -> {
            String key = event.getCode().toString();
            label.setText("Tecla pressionada: " + key);
        });

        // Evento de mouse
        root.setOnMouseClicked(event -> {
            label.setText("Mouse clicado na posição: " + event.getX() + ", " + event.getY());
        });


        // Criando uma cena com o layout
        Scene scene = new Scene(root, 400, 300);
        // Configurar o foco para receber eventos de teclado
        scene.setOnKeyPressed(root.getOnKeyPressed());

        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void updateCheckboxLabel(CheckBox checkbox1, CheckBox checkbox2, Label label) {
        String selected = "Selecione uma opção: ";
        if(checkbox1.isSelected()) selected += checkbox1.getText() + " ";
        if(checkbox2.isSelected()) selected += checkbox2.getText() + " ";
        label.setText(selected);
        // Atualiza o texto do label com as opções selecionadas
    }

    public static void main(String[] args) {
        launch(args);
    }

}
