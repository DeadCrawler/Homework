import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {

    private JButton button = new JButton("Execute");
    private JTextField input1 = new JTextField("", 5);

    private JTextField input2 = new JTextField("", 6);
    private JLabel label1 = new JLabel("Input x:");
    private JLabel label2 = new JLabel("Input y:");
    private JRadioButton radio1 = new JRadioButton("+");
    private JRadioButton radio2 = new JRadioButton("-");
    private JRadioButton radio3 = new JRadioButton("*");
    private JRadioButton radio4 = new JRadioButton("/");
    private JRadioButton radio5 = new JRadioButton("%");


    public Calc(){
        super("Calculator");
        this.setBounds(150,200,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 4, 2,2));
        container.add(label1);
        container.add(label2);
        container.add(input1);
        container.add(input2);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);

        radio1.setSelected(true);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        group.add(radio5);

        container.add(radio1);
        container.add(radio2);
        container.add(radio3);
        container.add(radio4);
        container.add(radio5);

        button.addActionListener(new ButtonEventListener());
        container.add(button);

    }
    //    JTextField f1 = new JTextField("-5");
//    String text = f1.getText();
//    int xaxis1 = Integer.parseInt(text);
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "You've reached the button\n";
            message += "The true answer is" + calculate() +"\n";
            message += "I hope you've enjoyed it =)";
            JOptionPane.showMessageDialog(null, message,"Result",JOptionPane.PLAIN_MESSAGE);
        }
        public int calculate() {
            String text1 = input1.getText();
            int x = Integer.parseInt(text1);
            String text2 = input2.getText();
            int y = Integer.parseInt(text2);

            if (radio1.isSelected()) {
                return x + y;
            } else if (radio2.isSelected()) {
                return x - y;
            } else if (radio3.isSelected()) {
                return x * y;
            } else if (radio4.isSelected()) {
                return x / y;
            } else if (radio5.isSelected()) {
                return x % y;
            }else return 0;
        }
    }
}
