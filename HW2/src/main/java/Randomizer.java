import java.util.Random;

public class Randomizer {
    Random random = new Random();

    public void random1(){
        System.out.println(random.nextInt());
    }

    public void random2(){
        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt());
        }
    }

    public void random3(){
        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt(10));
        }
    }

    public void random4(){
        for(int i = 0; i < 10; i++){
            int num = random.nextInt(30);
            System.out.println(num += 20);
        }
    }

    public void random5(){
        for(int i = 0; i < 10; i++){
            int num = random.nextInt(20);
            System.out.println(num -= 10);
        }
    }

    public void random6(){
        int length = random.nextInt(12);
        length += 3;
        for(int i = 0; i < length; i++){
            int num = random.nextInt(45);
            System.out.println(num -= 10);
        }
    }
}
