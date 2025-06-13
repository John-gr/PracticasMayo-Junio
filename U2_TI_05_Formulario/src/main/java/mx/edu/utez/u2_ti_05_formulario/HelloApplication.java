package mx.edu.utez.u2_ti_05_formulario;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Datos personales
        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido");
        TextField tfApellido = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        ObservableList<String> roles = FXCollections.observableArrayList("Profesor","Estudiante","Admin");
        ComboBox<String> cbRoles = new ComboBox<>(roles);



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