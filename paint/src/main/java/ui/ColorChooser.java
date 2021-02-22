package ui;

import listeners.Container;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JToolBar {
    private Color mainColor;
    protected JButton black;
    protected JButton red;
    protected JButton green;
    protected JButton blue;
    private final Container container;


    public ColorChooser(Container container){
        this.container = container;

        black = new JButton();
        black.setBackground(Color.black);
        mainColor = Color.black;

        red = new JButton();
        red.setBackground(Color.red);
        red.setBounds(600, 45, 15, 15);



        green = new JButton();
        green.setBackground(Color.green);
        green.setBounds(616, 45, 15, 15);



        blue = new JButton();
        blue.setBackground(Color.blue);
        blue.setBounds(632, 45, 15, 15);

        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainColor = Color.black;
                container.setMainColor(mainColor);
                System.out.println("black");
            }
        });

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainColor = Color.red;
                container.setMainColor(mainColor);
                System.out.println("red");
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainColor = Color.green;
                container.setMainColor(mainColor);
                System.out.println("green");
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainColor = Color.blue;
                container.setMainColor(mainColor);
                System.out.println("blue");
            }
        });

    }
}
