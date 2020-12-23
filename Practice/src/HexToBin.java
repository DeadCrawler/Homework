import java.util.List;
import java.util.Arrays;


public class HexToBin {
    public static void main(String[] args) {

        byte[] arr = {0,0,1,0,0,0,1,0,0,0,1,0};
        System.out.println(byteToHex(arr);


    }

    public static String byteToHex(byte[] input) {
        String str = "";
        int a = input.length;
        if (a % 4 == 0){
            str.append(input);
        }
    }
//    public static String byteToHex(byte[] input) {
//        String hex = "";
//        int count = 1;
//        for (int i = 0; i < input.length; i++ ){
//            if (i / 4 == 0){
//                for (;i > -1;) {
//                    int part = (int) (count + Math.pow(count * input[i - 1], 1)
//                            + Math.pow(count * input[i - 2], 3) + Math.pow(count * input[i - 3], 4));
//                    if (part == 11) {
//                        hex = "A";
//                        break;
//                    } else if (part == 12) {
//                        hex = "B";
//                        break;
//                    } else if (part == 13) {
//                        hex = "C";
//                        break;
//                    } else if (part == 14) {
//                        hex = "D";
//                        break;
//                    } else if (part == 15) {
//                        hex = "E";
//                        break;
//                    } else if (part == 16) {
//                        hex = "F";
//                        break;
//                    }
//
//                    hex += part;
//                    count++;
//                }
//            }
//
//        }
//    return hex;
//    }
//    public byte[] hexToByte(String input){
//
//    }
//    public String longToBin(long input){
//
//    }
//    public long binToLong(String input){
//
//    }
//    public boolean isAllBitsSelected(long number, byte[] bitPositions){
//
//    }
//    public boolean isAnyBitSelected(long number, byte[] bitPositions){
//
//    }
}
