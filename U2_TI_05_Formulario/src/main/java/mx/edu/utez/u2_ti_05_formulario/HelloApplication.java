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
        Label lblResultado = new Label("");
        Label lblRol = new Label("Rol");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.add(lblNombre, 0, 0);
        root.add(tfNombre, 1, 0);
        root.add(lblApellido, 0, 1);
        root.add(tfApellido, 1, 1);
        root.add(lblEdad, 0, 2);
        root.add(tfEdad, 1, 2);
        root.add(lblRol, 0, 3);
        root.add(cbRoles, 1, 3);
        root.add(btnCrear, 1, 4);
        root.add(btnReset, 2, 4);
        root.add(lblResultado, 0, 6);

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String edad = tfEdad.getText();
            String rol = cbRoles.getSelectionModel().getSelectedItem();

            if(nombre.isEmpty() || apellido.isEmpty()|| edad.isEmpty()){
                lblResultado.setText("Error, no campos vacios");
                lblResultado.setStyle("-fx-text-fill: red;");
            } else {
                lblResultado.setText("Su nombre es: " + nombre+"Apellido es: "+apellido+"edad es: "+edad+"Rol:"+rol);
                lblResultado.setStyle("-fx-background-color: lightblue");
                root.setStyle("-fx-background-color: lightgreen");
            }

        });


        btnReset.setOnAction(e->{
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cbRoles.getSelectionModel().clearSelection();
            cbRoles.getItems().clear();
            root.setStyle("-fx-background-color: white");
            lblResultado.setText("");
        });
        Scene scene = new Scene(root,600,550);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}