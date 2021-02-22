package ui;

import listeners.Container;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static utils.Constants.*;

public class ToolBar extends JToolBar {
    protected JButton pen;
    protected JButton brush;
    protected JButton eraser;
    private int mode;
    private Container container;

    public ToolBar(Container container){
        this.container = container;

        pen = new JButton(new ImageIcon(PENCIL_URL));

        brush = new JButton(new ImageIcon(BRUSH_URL));
        brush.setBounds(0,0,15,15);

        eraser = new JButton(new ImageIcon(ERASER_URL));

        pen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode = 1;
                System.out.println("pencil");
                container.setMode(mode);
            }
        });
        brush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode = 2;
                System.out.println("brush");
                container.setMode(mode);
            }
        });
        eraser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode = 3;
                System.out.println("eraser");
                container.setMode(mode);
            }
        });

    }
}
