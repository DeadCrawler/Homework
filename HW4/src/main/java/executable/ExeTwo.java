package executable;
import static utils.Utils.*;

public class ExeTwo {
    public String intToString(int num){
        stringBuilder = new StringBuilder();
        int curr;
        boolean boo = true;
        if (num<0){
            boo = false;
        }
        do{
            curr = Math.abs(num % 10);
            num = Math.abs(num / 10);
            stringBuilder.append(curr);
        }while (num != 0);
        if(boo == false){
            stringBuilder.append("-");
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public String realToString(double num){
        stringBuilder = new StringBuilder();
        stringBuilder.append(num);
        return stringBuilder.toString();
    }

    public int stringToInt(String string){
        stringBuilder = new StringBuilder(string);
        int num = 0;
        int j = 0;
        int reverse = 1;
        if(stringBuilder.indexOf("-") == 0){
            reverse = -1;
            stringBuilder.deleteCharAt(0);
        }
        for(int i = stringBuilder.length() - 1; i >= 0; i--) {
            int xD = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
            int cur = xD * (int) Math.pow(10, j);
            num += cur;
            j++;
        }
        return num * reverse;
    }

    public double stringToDouble(String string){
        stringBuilder = new StringBuilder(string);
        double num = 0;
        int j = 0;
        int reverse = 1;

        if(stringBuilder.indexOf("-") == 0) {
            reverse = -1;
            stringBuilder.deleteCharAt(0);
        }
        int dot = stringBuilder.indexOf(".");
        if(dot == -1){
            dot = stringBuilder.length();
        }
        for(int i = dot - 1; i >= 0; i--) {
            int xD = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
            int cur = xD * (int) Math.pow(10, j);
            num += cur;
            j++;
        }
        j = -1;
        for(int i = dot + 1; i < stringBuilder.length(); i++) {
            double xD = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
            double cur = xD * Math.pow(10, j);
            num += cur;
            j--;
        }

        return num * reverse;
    }
}
