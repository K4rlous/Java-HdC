package secao28_calculadora.Calculadora.src;

import javafx.scene.input.MouseEvent; 
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.application.Application;
import javafx.geometry.Insets;



public class Calculadora extends Application {

    // Componentes da Calculadora
    private Label display = new Label(""); // Exibe o resultado
    private String currentInput = ""; // Entrada atual do usuário
    private String operator = ""; // Operador selecionado
    private double previousValue = 0; // Valor anterior para operações

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Calculadora JavaFX");

        // Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(10)); // Espaçamento interno do layout
        root.setSpacing(10); // Espaçamento entre os componentes

        // Display
        display.setId("display");
        display.setMinSize(250, 50); // Tamanho mínimo do display
        display.setMaxSize(250, 50); // Tamanho máximo do display
        display.setMaxWidth(Double.MAX_VALUE); // Permite que o display ocupe toda a largura disponível
        VBox.setVgrow(display, Priority.NEVER); // Não permite que o display cresça verticalmente
        root.getChildren().add(display);

        // Painel de botões
        GridPane grid = new GridPane();
        grid.setHgap(10); // Espaçamento horizontal entre os botões
        grid.setVgap(10); // Espaçamento vertical entre os botões
        grid.setPadding(new Insets(10)); // Espaçamento interno do painel

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int row = 0;
        int col = 0;
        for(String text : buttons) {
            Button button = new Button(text);
            button.setMinSize(50, 50); // Tamanho mínimo dos botões
            button.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> handleButtonPress(text));
            grid.add(button, col, row); // Adiciona o botão na grade
            col++; 
            if(col > 3) {
                col = 0;
                row++; 
            }
            
        }
        root.getChildren().add(grid);

        // Cena
        Scene scene = new Scene(root, 300, 400);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm()); // Adiciona o CSS
        primaryStage.setScene(scene);
        primaryStage.show();

    
    }

    // Logica da Calculadora
    private void handleButtonPress(String value) {
        switch (value) {
            case "C" -> {
                currentInput = ""; // Limpa a entrada atual
                operator = ""; // Limpa o operador
                previousValue = 0; // Reseta o valor anterior
                display.setText(""); // Limpa o display
            }
            case "=" -> {
                if(!currentInput.isEmpty() && !operator.isEmpty()) {
                    double currentValue = Double.parseDouble(currentInput); // Converte a entrada atual para double
                    double result = calculate(previousValue, currentValue, operator); // Realiza o cálculo
                    display.setText(String.valueOf(result)); // Exibe o resultado
                    currentInput = String.valueOf(result); // Atualiza a entrada atual com o resultado
                    operator = ""; // Limpa o operador
                }
            }
            case "+", "-", "*", "/" -> {
                if(!currentInput.isEmpty()) {
                    operator = value; // Define o operador
                    previousValue = Double.parseDouble(currentInput); // Converte a entrada atual para double
                    currentInput = ""; // Limpa a entrada atual para o próximo número
                }
            }
            default -> {
                currentInput += value; // Adiciona o valor ao input atual
                display.setText(currentInput); // Atualiza o display
            }
        }
        
    }

    // Realizar o cálculo quando o usuário pressionar "="
    private double calculate(double a, double b, String op) {
       switch (op) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                if (b != 0) {
                    return a / b;
                } else {
                    display.setText("Erro: Divisão por zero");
                    return 0; // Retorna 0 em caso de erro
                }
            }
            default -> {
                return 0; // Retorna 0 se o operador não for reconhecido
            }
        }
    }
  
    public static void main(String[] args) {
        launch(args);
    }

}

  