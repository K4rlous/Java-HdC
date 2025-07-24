package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class ButtonClickExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Label label = new Label("Clique no botão para ver o resultado");
        Button button = new Button("Clique aqui");

        button.setOnAction(event -> {
            label.setText("Botão clicado!");
            // Aqui você pode adicionar mais lógica para o que acontece quando o botão é clicado
        });


        VBox vbox = new VBox(10, label, button);

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 400, 300);

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
