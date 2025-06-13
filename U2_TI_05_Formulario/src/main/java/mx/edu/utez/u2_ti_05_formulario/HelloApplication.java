package mx.edu.utez.u2_ti_05_formulario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label lbl1 = new Label("Label 1");
        Button button = new Button("Aceptar");
        Button button2 = new Button("Cancelar");
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}