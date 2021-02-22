package ui;

import listeners.Container;

import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;


public class MyCanvas extends JPanel {
    BufferedImage image;
    JLabel censure;
    Container container;

    public MyCanvas(Container container) {
        this.container = container;
    }

    public void paintComponent(Graphics g) {
        if (image == null) {
            image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D d2 = (Graphics2D) image.createGraphics();
            d2.setColor(Color.white);
            d2.fillRect(0, 0, this.getWidth(), getHeight());
        }
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
//        container.setImage(image);
    }
}

