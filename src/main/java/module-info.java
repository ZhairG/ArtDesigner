module org.openjfx.artdesigner {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.openjfx.artdesigner to javafx.fxml;
    exports org.openjfx.artdesigner;
    exports org.openjfx.artdesigner.modelo;
    opens org.openjfx.artdesigner.modelo to javafx.fxml;
    exports org.openjfx.artdesigner.controlador;
    opens org.openjfx.artdesigner.controlador to javafx.fxml;
}