package secao29_Cronometro.Cronometro.src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;



public class Cronometro extends Application {

    // Componentes do cronômetro
    private Label timeLabel = new Label("00:00:00");
    private int secondsElapsed = 0;
    private Timeline timeline;



    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Cronometro JavaFX");

        // Layout principal
        VBox root = new VBox();
        root.setPadding(new Insets(10)); // Espaçamento interno do layout
        root.setSpacing(10); // Espaçamento entre os componentes

        // Configuração do display do cronômetro
        timeLabel.setId("timeLabel");
        root.getChildren().add(timeLabel);

        // Layout dos botões
        HBox hbox = new HBox();
        hbox.setSpacing(10); // Espaçamento entre os botões

        Button startButton = new Button("Iniciar");
        startButton.setMinSize(100, 50);
        startButton.setId("startButton");
        startButton.setOnAction(e -> {
            startTimer(); // Inicia o cronômetro ao clicar no botão
        });

        Button pauseButton = new Button("Pausar");
        pauseButton.setMinSize(100, 50);
        pauseButton.setId("pauseButton");
        pauseButton.setOnAction(e -> {
            pauseTimer(); // Pausa o cronômetro ao clicar no botão
        });

        Button resetButton = new Button("Reiniciar");
        resetButton.setMinSize(100, 50);
        resetButton.setId("resetButton");
        resetButton.setOnAction(e -> {
            resetTimer(); // Reinicia o cronômetro ao clicar no botão
        });

        hbox.getChildren().addAll(startButton, pauseButton, resetButton);
        root.getChildren().add(hbox);


      
        // Cena
        Scene scene = new Scene(root, 400, 200);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm()); // Adiciona o CSS
        primaryStage.setScene(scene);
        primaryStage.show();

    
    }
    // Inicia o cronômetro
    private void startTimer(){
        if(timeline == null || timeline.getStatus() != Timeline.Status.RUNNING){
            timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> updateTimer()));
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        }
    }

    // Pausa o cronômetro
    private void pauseTimer(){
        if(timeline != null && timeline.getStatus() == Timeline.Status.RUNNING){
            timeline.pause();
        }
    }

    // Reinicia o cronômetro
    private void resetTimer(){
        if(timeline != null){
            timeline.stop();
        }
        secondsElapsed = 0;
        updateTimerDisplay();
    }


    // Atualiza o display do cronômetro
    private void updateTimer(){
        secondsElapsed++;
        updateTimerDisplay();
    }

    private void updateTimerDisplay(){
        int hours = secondsElapsed / 3600; 
        int minutes = (secondsElapsed % 3600) / 60;
        int seconds = secondsElapsed % 60;
        timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
    
  
    public static void main(String[] args) {
        launch(args);
    }

}


  