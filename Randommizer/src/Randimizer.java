import java.util.Random;

public class Randimizer {
    public static int randomizer() throws Exception {
        Random rand = new Random();
        int diff = Body.body();
        int numb = rand.nextInt(diff + 1);
        return numb;

    }
}
