module mx.edu.utez.u2_ti_04_apunte {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.u2_ti_04_apunte to javafx.fxml;
    exports mx.edu.utez.u2_ti_04_apunte;
}