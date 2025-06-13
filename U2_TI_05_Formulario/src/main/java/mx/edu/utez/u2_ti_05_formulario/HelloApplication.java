package mx.edu.utez.u2_ti_05_formulario;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        //Datos personales
        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido");
        TextField tfApellido = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        ObservableList<String> roles = FXCollections.observableArrayList("Profesor","Estudiante","Admin");
        ComboBox<String> cbRoles = new ComboBox<>(roles);
        Button btnCrear = new Button("Crear");
        Button btnReset = new Button("Reset");
        Label lblResultado = new Label("Resultado");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        btnCrear.setOnAction(e ->{
            if(lblNombre.isEmpty || lblEdad.isEmpty || lblApellido.isEmpty || cbRoles.isEmpty){
                lblResultado.setText("Error, no campos vacios");
            } else{

            }

        });

        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}