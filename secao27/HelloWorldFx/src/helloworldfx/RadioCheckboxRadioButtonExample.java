package helloworldfx;

import java.awt.Checkbox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;

public class RadioCheckboxRadioButtonExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        // Criando o checkbox
        CheckBox checkbox1 = new CheckBox("Opção 1");
        CheckBox checkbox2 = new CheckBox("Opção 2");
        
        Label checkboxLabel = new Label("Selecione uma opção:");
        // Adicionando ação ao checkbox
        // Quando o checkbox for selecionado, atualiza o texto do label
        checkbox1.setOnAction(e -> updateCheckboxLabel(checkbox1, checkbox2, checkboxLabel));
        checkbox2.setOnAction(e -> updateCheckboxLabel(checkbox1, checkbox2, checkboxLabel));

        // Radio buttons 
        RadioButton radioButton1 = new RadioButton("Opção A");
        RadioButton radioButton2 = new RadioButton("Opção B");
        // Agrupando os radio buttons
        // Apenas um radio button pode ser selecionado por vez
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);

        Label radioButtonLabel = new Label("Selecione uma opção de radio button:");

        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
                radioButtonLabel.setText("Opção selecionada: " + selectedRadioButton.getText());
            }
        });

        VBox vbox = new VBox(10, checkbox1, checkbox2, checkboxLabel, 
                              radioButton1, radioButton2, radioButtonLabel);

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