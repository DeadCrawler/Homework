import java.util.Random;
import java.util.Scanner;

public class Ranimizer {

    public int scanner(){
        Scanner scann = new Scanner(System.in);
        int x = scann.nextInt();
        return x;
    }

    public int random(int min){
        int diff = (min+100)-min;
        Random rand = new Random();
        int x = rand.nextInt(diff+1);
        return x;
    }


}
