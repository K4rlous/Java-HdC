package helloworldfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class ComboboxListviewExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        // Criando o combobox
        ComboBox<String> comboBox = new ComboBox<>();

        // Adicionando itens ao combobox
        comboBox.getItems().addAll("Item 1", "Item 2", "Item 3");

        comboBox.setPromptText("Selecione um item");

        Label comboBoxLabel = new Label("Selecione uma opção do combobox:");

        comboBox.setOnAction(event -> {
            String selected = comboBox.getSelectionModel().getSelectedItem();
            comboBoxLabel.setText("Você selecionou: " + selected);
            // Atualiza o texto do label com a opção selecionada
        });

        // Criando a listView
        ObservableList<String> itens = FXCollections.observableArrayList("Item A", "Item B", "Item C", "Item D"); // Lista de itens para a ListView

        ListView<String> listView = new ListView<>(itens); // Cria a ListView com os itens

        listView.setPrefHeight(150); // Define a altura preferencial da ListView

        Label listViewLabel = new Label("Selecione uma opção do List View:");

        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String selected = listView.getSelectionModel().getSelectedItem();
            listViewLabel.setText("Você selecionou: " + newValue);
            // Atualiza o texto do label com a opção selecionada
        });

        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); // Define o modo de seleção para multipla

        VBox vbox = new VBox(10, comboBox, comboBoxLabel, listView, listViewLabel);

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
