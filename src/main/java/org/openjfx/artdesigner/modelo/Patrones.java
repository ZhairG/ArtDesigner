package org.openjfx.artdesigner.modelo;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

import java.awt.image.BufferedImage;

public abstract class Patrones implements ImplementarPatrones{
    private String nombre_grupo_indigena;
    private Color color;

    @Override
    public void setColor(Color color) {

    }

    @Override
    public Color getFillColor() {
        return null;
    }

    @Override
    public void Posicionar(Point2D posicion) {

    }

    @Override
    public void addshape(BufferedImage image) {

    }
}
