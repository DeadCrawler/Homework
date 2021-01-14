package executable;
import static utils.Utils.*;
import java.util.Arrays;

public class ExeThree {
    public int stringToLength(String string){
        stringBuilder = new StringBuilder(string);
        int index;
        int length;
        int preLength = stringBuilder.length();
        do {
            index = stringBuilder.indexOf(" ");
            if(index == -1){
                break;
            }
            length = stringBuilder.substring(0, index).length();
            if(length < preLength) {
                preLength = length;
            }
            stringBuilder.delete(0, index+1);
        }while(index != -1);
        return preLength;
    }

    public String stringToPieces(String string, boolean boo){
        stringBuilder = new StringBuilder(string);
        int index;
        index = stringBuilder.indexOf(" ");
        if(index == -1){
            return null;
        }
        return stringBuilder.substring(0, index);
    }

    public String makeMoneyFromWords(String[] string, int num){
        stringBuilder =  new StringBuilder(Arrays.toString(string));
        int index;
        System.out.println(stringBuilder);
        for(int i = 0; i < string.length; i++){
            index = stringBuilder.indexOf(" ");
            if(index == -1){
                return null;
            }
            if(string[i].length() == num){
                stringBuilder.substring(0, index);
                stringBuilder.delete(num - 3, num).append("$$$");

            }
        }
        return stringBuilder.toString();
    }
    public String jumpIfSeeComa(String string){
        stringBuilder = new StringBuilder(string);

        int index;
        int fromIndex = 0;
        do{
            index = stringBuilder.indexOf(",", fromIndex);
            if(index == -1){
                break;
            }
            stringBuilder.insert(index+1," ");
            fromIndex = index + 1;
        }while (index != -1);
        return stringBuilder.toString();
    }

    public String noDuplicate(String string){
        stringBuilder = new StringBuilder(string);



        for(int i = 0; i<stringBuilder.length(); i++){
            int index;
            String charmander = String.valueOf(stringBuilder.charAt(i));
            do{

                index = stringBuilder.indexOf(charmander, i+1);

                if(index == -1){
                    continue;
                }

                stringBuilder.deleteCharAt(index);
            }while (index != -1);
        }
        return stringBuilder.toString();
    }
    public int wordCounter(String string){
        stringBuilder = new StringBuilder(string);
        int index;
        int count = 1;
        do {
            index = stringBuilder.indexOf(" ");
            if(index == -1){
                break;
            }

            stringBuilder.delete(0, index+1);
            count++;
        }while(index != -1);
        return count;
    }
    public String cutTheCord(String string, int position, int length){
        stringBuilder = new StringBuilder(string);
        if(position>length){
            return null;
        }else if(position > string.length()){
            return null;
        }

        stringBuilder.delete(position, length);
        return stringBuilder.toString();
    }

}
