package helloworldfx;

import javafx.scene.paint.Color;        
import javafx.scene.shape.*;    
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShapeDrawingExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Retangulo
        Rectangle rectangle = new Rectangle(200, 100);
        rectangle.setFill(Color.CHOCOLATE);
        rectangle.setStroke(Color.AQUA);
        rectangle.setStrokeWidth(4);

        // circulo
        Circle circle = new Circle(50);
        circle.setFill(Color.CHOCOLATE);
        circle.setStroke(Color.AQUA);
        circle.setStrokeWidth(4);

        // elipse
        Ellipse ellipse = new Ellipse(80, 50);
        ellipse.setFill(Color.CHOCOLATE);
        ellipse.setStroke(Color.AQUA);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(rectangle, circle, ellipse);

        Scene scene = new Scene(vBox, 500, 500);

        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
