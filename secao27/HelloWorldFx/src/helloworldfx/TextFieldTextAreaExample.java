package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFieldTextAreaExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        // Criando um textfield e um textarea
        TextField textField = new TextField();
        textField.setPromptText("Digite algo aqui...");

        TextField textField2 = new TextField();
        textField2.setPromptText("Digite algo aqui...");

        // Limitando os caracteres do textfield
        textField2.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 3) {
                textField2.setText(oldValue);
            }
        });

        // Textarea
        TextArea textArea = new TextArea();
        textArea.setPromptText("Digite algo aqui...");

        // Limitar as linhas do textarea
        textArea.setPrefRowCount(5); // Definindo o número de linhas visíveis

        Label label = new Label("Texto digitado: ");

        textArea.textProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Texto digitado: " + newValue); // Atualiza o label com o texto do textarea
        });

        VBox vbox = new VBox(10, textField, textField2, textArea, label);

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
