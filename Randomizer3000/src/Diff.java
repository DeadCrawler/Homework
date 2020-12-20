import java.util.Scanner;
import java.util.Random;

public class Diff {
    int rand;
    String scann;

    int rand(int diff){
        Random random = new Random();
        int i =  random.nextInt(diff);
        return i;

    }

    String scan(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

     int scann(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    int getMin(){
        Introduce intro = new Introduce();
        int min = scann();
        if (min < 1) intro.exception();
        return min;
    }
    int getMax(){
        Introduce intro = new Introduce();
        int max = scann();
        if (max > 500) intro.exception();
        return max;

    }
    int getDiff(int min, int max) {
        Introduce intro = new Introduce();
        if (min > max) intro.exception();
        int diff = max - min + 1;
        return diff;
    }
    void array(int diff, int min){
        Introduce intro = new Introduce();
        Random random = new Random();
        int arr[] = new int[diff];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = random.nextInt(diff);  //
            arr[j] += min;                  //генер числа
            if (j > 0){
                int check = arr[j];         //создание проверочной переменной
                for(int i = j-1; i > -1; i --){
                    if (i == j){
                        continue;
                    }
                    else if (check == arr[i]) {
                        arr[j] = 0;
                        j--; }
                }
            }
            System.out.println(arr[j]+" !");
            intro.choise();
        }
        for (int i = 0;i< arr.length; i++ ){
            System.out.print(arr[i]+" :");
            intro.finale();
        }

    }
}
