package helloworldfx;

import javafx.scene.paint.Color;        
import javafx.scene.shape.*;    
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CanvasExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Desenhar o canvas
        drawShapes(gc);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(canvas);

        Scene scene = new Scene(vBox, 500, 500);

        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Métodos do canvas
    private void drawShapes(GraphicsContext gc){
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(2);
        gc.strokeLine(50, 50, 350, 50);
        gc.setFill(Color.BLUE);
        gc.fillRect(100, 100, 250, 150);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
