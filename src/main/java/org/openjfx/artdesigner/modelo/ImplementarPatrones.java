package org.openjfx.artdesigner.modelo;

import java.awt.image.BufferedImage;

public interface ImplementarPatrones {
    // Metodos para cambiar los colores de un patron
    public void setColor(javafx.scene.paint.Color color);
    public javafx.scene.paint.Color getFillColor();

    public void Posicionar(javafx.geometry.Point2D posicion);
    public void addshape(BufferedImage image);
}
