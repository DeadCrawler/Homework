package listeners;

import ui.MyCanvas;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class MouseListener extends MouseAdapter {
    protected Container container;
    private int xPad;
    private int yPad;
    private int xf;
    private int yf;
    private MyCanvas myCanvas;

    private BufferedImage image;
    private boolean pressed = false;

    public MouseListener(Container container, MyCanvas myCanvas){
        this.container = container;
        this.myCanvas = myCanvas;
        image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
    }


    @Override
    public void mouseDragged(MouseEvent e){
        xPad = e.getX();
        yPad = e.getY();
        Graphics g = image.createGraphics();
        g.clipRect(xPad,yPad,10,10);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(container.getMainColor());
        switch (container.getMode()){
            case 1:
                g2.drawLine(xPad, yPad, e.getX(), e.getY());
                break;
            case 2:
                g2.setStroke(new BasicStroke(3.0f));
                g2.drawLine(xPad, yPad, e.getX(), e.getY());
                break;
            case 3:
                g2.setStroke(new BasicStroke(3.0f));
                g2.setColor(Color.white);
                g2.drawLine(xPad, yPad, e.getX(), e.getY());
                break;
        }
        myCanvas.repaint();
    }
//    @Override
//    public void mouseDragged(MouseEvent e) {
//        if(pressed==true){
//            Graphics g = image.getGraphics();
//            Graphics2D g2 = (Graphics2D)g;
//            g2.setColor(container.getMainColor());
//            switch (container.getMode()){
//                case 1:
//                    g2.drawLine(xPad, yPad, e.getX(), e.getY());
//                    break;
//                case 2:
//                    g2.setStroke(new BasicStroke(3.0f));
//                    g2.drawLine(xPad, yPad, e.getX(), e.getY());
//                    break;
//                case 3:
//                    g2.setStroke(new BasicStroke(3.0f));
//                    g2.setColor(Color.white);
//                    g2.drawLine(xPad, yPad, e.getX(), e.getY());
//            }
//            xPad=e.getX();
//            yPad=e.getY();
//        }
//        System.out.println("mouseMoved");
//        myCanvas.repaint();
//
//    }
//
//    @Override
//    public void mouseClicked(MouseEvent e){
//        Graphics g = image.getGraphics();
//        Graphics2D g2 = (Graphics2D) g;
//
//        g2.setColor(container.getMainColor());
//        switch (container.getMode()){
//            case 1:
//                g2.drawLine(xPad, yPad, e.getX(), e.getY());
//                break;
//            case 2:
//                g2.setStroke(new BasicStroke(3.0f));
//                g2.drawLine(xPad, yPad, e.getX(), e.getY());
//                break;
//            case 3:
//                g2.setStroke(new BasicStroke(3.0f));
//                g2.setColor(Color.white);
//                g2.drawLine(xPad, yPad, e.getX(), e.getY());
//        }
//        xPad = e.getX();
//        yPad = e.getY();
//
//        pressed = true;
//        System.out.println("mouseClicked");
//        myCanvas.repaint();
//    }
//    public void mousePressed(MouseEvent e) {
//        xPad=e.getX();
//        yPad=e.getY();
//        xf=e.getX();
//        yf=e.getY();
//        System.out.println("mousePressed");
//        pressed=true;
//    }
//
//    public void mouseReleased(MouseEvent e) {
//
//        Graphics g = image.getGraphics();
//        Graphics2D g2 = (Graphics2D) g;
//        // установка цвета
//        g2.setColor(container.getMainColor());
//        // Общие рассчеты для овала и прямоугольника
//        int x1 = xf, x2 = xPad, y1 = yf, y2 = yPad;
//        if (xf > xPad) {
//            x2 = xf;
//            x1 = xPad;
//        }
//        if (yf > yPad) {
//            y2 = yf;
//            y1 = yPad;
//        }
//        xf=0; yf=0;
//        pressed = false;
//        System.out.println("mouseReleased");
//        myCanvas.repaint();
//    }


    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
