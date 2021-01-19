package check;

public class Utils {
    public static StringBuilder stringBuilder;

    public StringBuilder sbToSeven(String string){
        stringBuilder = new StringBuilder(string);
        if(string.length() <= 7) {
            int length = 7 - string.length();
            for(int i = 0; i < length; i++)
                stringBuilder.insert(0, 0);
        }
        return stringBuilder;
    }
}
