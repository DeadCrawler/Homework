package logic;

public class Math {
    public int calculate(Throwable ex) {
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
            (y == 0) ? textArea.setText(ex.getMessage()) : return x / y;
        } else if (radio5.isSelected()) {
            return x % y;
        }else return 0;
    }
}
