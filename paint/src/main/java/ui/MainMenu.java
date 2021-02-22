package ui;

import listeners.Container;
import listeners.MouseListener;

import javax.swing.*;


import java.awt.*;

import static java.awt.Color.*;

public class MainMenu {
    MyFrame frame;
    MyCanvas myCanvas;
    ColorChooser cc;
    ToolBar toolBar;
    MouseListener mouseListener;
    Container container;

    public MainMenu(){
        frame = new MyFrame("My paint example");
        container = new Container();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myCanvas = new MyCanvas(container);
        myCanvas.setBounds(30,30,550,540);
        myCanvas.setBackground(white);
        myCanvas.setOpaque(true);
        mouseListener = new MouseListener(container, myCanvas);
        myCanvas.addMouseMotionListener(mouseListener);
        myCanvas.addMouseListener(mouseListener);



        cc = new ColorChooser(container);
        cc.setBounds(600, 40, 180, 50);
        cc.add(cc.black);
        cc.add(cc.red);
        cc.add(cc.green);
        cc.add(cc.blue);

        toolBar = new ToolBar(container);
        toolBar.setBounds(600, 100,180,50);
        toolBar.add(toolBar.pen);
        toolBar.add(toolBar.brush);
        toolBar.add(toolBar.eraser);


        frame.setBounds(0,0, 800,600);

        frame.add(myCanvas);
        frame.add(cc);
        frame.add(toolBar);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    static class MyFrame extends JFrame
    {
        public void paint(Graphics g)
        {
            super.paint(g);
        }
        public MyFrame(String title)
        {
            super(title);
        }
    }
}
