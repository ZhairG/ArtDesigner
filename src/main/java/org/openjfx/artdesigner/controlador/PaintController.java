package org.openjfx.artdesigner.controlador;

import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PaintController {

    @FXML
    private Canvas Lienzo;

    @FXML
    private ListView<?> listafiguras;

    @FXML
    private SplitMenuButton selectTribu;

    @FXML
    private ColorPicker color;

    @FXML
    private ComboBox<?> selectpatron;

    Image imagenOriginal = new Image("file:src/main/resources/org/openjfx/artdesigner/images/Img prueba.jpg");

    int filas = 3;
    int columnas = 5;

    double nuevoAncho = imagenOriginal.getWidth() * columnas;
    double nuevoAlto = imagenOriginal.getHeight() * filas;
    BufferedImage imagenDuplicada = new BufferedImage((int)nuevoAncho, (int)nuevoAlto, BufferedImage.TYPE_INT_ARGB);

    @FXML
    void Exportar(ActionEvent event) {
        GuardarArchivo archivo = new GuardarArchivo(Lienzo);
        GuardarArchivo.Guardar();
    }

    @FXML
    void Generar(ActionEvent event) {
        GraphicsContext g = Lienzo.getGraphicsContext2D();
        for (int y = 0; y < filas; y++) {
            for (double x = 0; x < columnas; x++) {
                g.drawImage(imagenOriginal, x * imagenOriginal.getWidth(), y * imagenOriginal.getHeight());
            }
        }
    }

    @FXML
    void MoreInfo(ActionEvent event) {

    }

    @FXML
    void selecciondecolor(ActionEvent event) {
        color.hashCode();
    }

}
