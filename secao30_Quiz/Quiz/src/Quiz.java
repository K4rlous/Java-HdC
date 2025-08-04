package secao30_Quiz.Quiz.src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;



public class Quiz extends Application {

    private int currenteQuestion = 0; // Índice da pergunta atual
    private int score = 0; // Pontuação do jogador

    // Perguntas e Respostas
    private String[] questions = {
    "Qual é a capital da França?",
    "Quem escreveu 'Dom Quixote'?",
    "Qual é o maior planeta do sistema solar?"
    };

    private String[][] options = {
    {"Paris", "Londres", "Roma", "Berlim"},
    {"Miguel de Cervantes", "William Shakespeare", "Mark Twain", "Jorge Amado"},
    {"Terra", "Marte", "Júpiter", "Saturno"}
    };  

    private int[] correctAnswers = {0, 3, 1}; // Índices das respostas corretas

    private Label questionLabel;
    private ToggleGroup toggleGroup;
    private VBox root;



    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Quiz JavaFX");

        // Layout principal
        root = new VBox();
        root.setPadding(new Insets(10)); // Espaçamento interno do layout
        root.setSpacing(10); // Espaçamento entre os componentes

        // Mostrar a pergunta atual
        questionLabel = new Label(questions[currenteQuestion]);
        questionLabel.getStyleClass().add("label"); // Adiciona estilo CSS
        root.getChildren().add(questionLabel);

        // Grupo de botões de opção
        toggleGroup = new ToggleGroup();
        for (String option : options[currenteQuestion]) {
            RadioButton radioButton = new RadioButton(option);
            radioButton.setToggleGroup(toggleGroup);
            radioButton.getStyleClass().add("radio-button"); // Adiciona estilo CSS
            root.getChildren().add(radioButton);
        }

        // Botão de próxima pergunta
        Button nextButton = new Button("Próxima Pergunta");
        nextButton.getStyleClass().add("button"); // Adiciona estilo CSS
        root.getChildren().add(nextButton);
        nextButton.setOnAction(event -> handleNextQuestion()); // Ação do botão

      
        // Cena
        Scene scene = new Scene(root, 400, 450);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm()); // Adiciona o CSS
        primaryStage.setScene(scene);
        primaryStage.show();

    
}

    private void handleNextQuestion(){
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        if (selectedRadioButton != null) {
            int selectedIndex = getSelectedIndex();
            if (selectedIndex == correctAnswers[currenteQuestion]) {
                score++; // Incrementa a pontuação se a resposta estiver correta
            }
            currenteQuestion++; // Avança para a próxima pergunta
            if (currenteQuestion < questions.length) {
                updateQuestion(); // Atualiza a pergunta e as opções
            } else {
                showScore(); // Exibe a pontuação final se não houver mais perguntas
            }
        }
    }

    private void updateQuestion(){
        questionLabel.setText(questions[currenteQuestion]); // Atualiza o texto da pergunta
        root.getChildren().removeIf(node -> node instanceof RadioButton); // Remove os botões de opção antigos
        toggleGroup = new ToggleGroup();
        for (String option : options[currenteQuestion]) {
            RadioButton radioButton = new RadioButton(option);
            radioButton.setToggleGroup(toggleGroup);
            radioButton.getStyleClass().add("radio-button"); // Adiciona estilo CSS
            root.getChildren().add(1, radioButton); // Adiciona os novos botões de opção após o Label da pergunta, label tem índice 0
        }

        
    }

    private void showScore(){
        root.getChildren().clear(); // Limpa o layout
        Label scoreLabel = new Label("Pontuação Final: " + score + "/" + questions.length);
        root.getChildren().add(scoreLabel); // Adiciona a pontuação final
    }

    private int getSelectedIndex() {
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        return root.getChildren().indexOf(selectedRadioButton) - 1; // -1 para ignorar o Label da pergunta
    }
 
    public static void main(String[] args) {
        launch(args);
    }

}


  
