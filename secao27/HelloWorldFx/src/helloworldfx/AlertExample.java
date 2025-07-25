package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;


public class AlertExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Button buttonInfo = new Button("Alerta de informação");
        Button buttonWarning = new Button("Alerta de perigo");
        Button buttonError = new Button("Alerta de erro");
        Button buttonConfirmation = new Button("Alerta de confirmação");

        buttonInfo.setOnAction(event -> showAlert(AlertType.INFORMATION, "Informação", "Alerta de informação"));

        buttonWarning.setOnAction(event -> showAlert(AlertType.WARNING, "Perigo", "Alerta de perigo"));

        buttonError.setOnAction(event -> showAlert(AlertType.ERROR, "Erro", "Alerta de erro"));

        buttonConfirmation.setOnAction(event -> showAlert(AlertType.CONFIRMATION, "Confirmação", "Alerta de confirmação"));

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(buttonInfo, buttonWarning, buttonError, buttonConfirmation);

        Scene scene = new Scene(vBox, 500, 500);

        // Configurar o palco (Stage)
        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
  
    // Função para gerar alertas dinâmicos
    private void showAlert(AlertType alertType, String title, String message){

        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
