
public class Body {
    public static int body() throws Exception{

        int min = Scann.scann();
        int max = Scann.scann();
        int diff  = max - min;
        if (diff < 0) throw new Exception("U vrote icorrect value");
        return diff;
    }

    public static void array() {

    }

//    public static String numb() throws Exception {
//        String res = "";
//        for (int i = 0; i < body() - 1; i++) {
//            res += "? " + Randimizer.randomizer() + " !";
//        }
//        return res;
//
//    }
}
