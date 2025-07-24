package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;


public class CSStylingExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Label label = new Label("Label estilizada com CSS");

        label.getStyleClass().add("label-custom"); // Adiciona uma classe de estilo personalizada

        Button button = new Button("Botão estilizado com CSS");

        button.getStyleClass().add("button-custom"); // Adiciona uma classe de estilo personalizada

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, button);
    
        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 400, 300);

        // Adicionando o arquivo CSS à cena
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

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

