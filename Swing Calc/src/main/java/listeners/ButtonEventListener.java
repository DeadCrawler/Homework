package listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonEventListener implements ActionListener {
    Math math = new Math();
    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "You've reached the button\n";
        message += "The true answer is" + calculate() +"\n";
        message += "I hope you've enjoyed it =)";
        JOptionPane.showMessageDialog(null, message,"Result",JOptionPane.PLAIN_MESSAGE);
    }

}