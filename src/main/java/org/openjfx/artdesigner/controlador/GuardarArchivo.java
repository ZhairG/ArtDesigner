package org.openjfx.artdesigner.controlador;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class GuardarArchivo {
    public static Canvas canvas;

    public GuardarArchivo(Canvas canvas) {
        GuardarArchivo.canvas = canvas;
    }

    public static void Guardar() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Guardar Imagen");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivos PNG", "*.png"));

        // Abrir diálogo de guardado
        File file = fileChooser.showSaveDialog(new Stage());
        if (file != null) {
            try {
                // Capturar el contenido del Canvas
                WritableImage writableImage = new WritableImage((int) canvas.getWidth(), (int) canvas.getHeight());
                canvas.snapshot(null, writableImage);

                // Guardar la imagen en un archivo PNG
                ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null), "png", file);
                System.out.println("Canvas guardado como imagen: " + ((java.io.File) file).getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
