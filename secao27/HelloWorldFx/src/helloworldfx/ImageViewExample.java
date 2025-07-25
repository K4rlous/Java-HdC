package helloworldfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ImageViewExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Image image = new Image
        // Note o uso de file: antes do caminho do arquivo!
        ("file:C:\\Users\\Carlos\\Desktop\\Programação 2024 e Redes\\Java HdC\\secao27\\HelloWorldFx\\src\\helloworldfx\\loro.jpg");

        ImageView imageView = new ImageView(image);

        imageView.setFitHeight(300);
        imageView.setFitWidth(200);
        imageView.setPreserveRatio(true);

        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(imageView);

        Scene scene = new Scene(vBox, 500, 500);

        primaryStage.setTitle("Exemplo Stage e Scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
