package mx.edu.utez.u2_ti_04_apunte;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Label lbl1 = new Label("Label 1");
        Button button = new Button("Aceptar");
        Button button2 = new Button("Cancelar");

        button.setOnAction(e -> {
            lbl1.setText("Aceptado!");
        });

        button2.setOnAction(e -> {

            lbl1.setText("Cancelado!");
        });

        VBox vbox = new VBox(20,lbl1, button, button2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);

        stage.setTitle("Apunte");

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/image/jack.png")));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}