package listeners;


import ui.MyCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Container {
    Color mainColor;
    int mode;
    BufferedImage image;

    public Container() {

    }


    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public int getMode() {
        return mode;
    }

    public void setMainColor(Color mainColor) {
        this.mainColor = mainColor;
    }

    public Color getMainColor() {
        return mainColor;
    }
}
