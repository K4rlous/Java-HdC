package helloworldfx;

import javafx.scene.paint.Color;        
import javafx.scene.shape.*;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SmoothAnimationExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Animando um circulo
        Circle circle = new Circle(50, Color.BLUE); // Cria um círculo azul com raio 50
        circle.setTranslateX(-200); // Define a posição inicial do círculo

        Timeline timeline = new Timeline(); // Cria uma linha do tempo para animação

        KeyFrame keyFrame = new KeyFrame(Duration.seconds(2), 
            new KeyValue(circle.translateXProperty(), 200)); // Anima o círculo para a posição X 200 em 2 segundos

        timeline.getKeyFrames().add(keyFrame); // Adiciona o KeyFrame à linha do tempo
        timeline.setCycleCount(Timeline.INDEFINITE); // Define a contagem de ciclos da animação como indefinida
        timeline.setAutoReverse(true); // Permite que a animação reverta após completar
        timeline.play(); // Inicia a animação

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(circle); // Adiciona o círculo ao StackPane

        Scene scene = new Scene(stackPane, 500, 500);

        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    

    public static void main(String[] args) {
        launch(args);
    }
}

