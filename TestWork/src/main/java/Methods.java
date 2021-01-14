import java.nio.ByteBuffer;
import java.util.Arrays;

public class Methods {

    public String bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int box  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = box;
                }
            }
        }
        String str = Arrays.toString(arr);
        return str;
    }

    public int binarySearch(int[] arr, int num){
        int indexOfNum = -1;
        for(int i= 0;i < arr.length - 1; i++){
            if(arr[i]>arr[i+1]) return indexOfNum;
        }
        for (int i = (arr.length / 2)-1; i >= 0; i--){
            if(num == arr[i]){
                return i;
            }
            for (int j = arr.length/2; j > arr.length - 1; j++){
                if(num == arr[j]){
                    return j;
                }
            }
        }
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] == num + 1){
                return i;
            }else if(arr[i] == num - 1){
                return i;
            }
        }
        return indexOfNum;
    }

    public boolean isAllBitsSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        StringBuilder sb = new StringBuilder(str);
        if(str.length() <= 7) {
            int length = 7 - str.length();
            for(int i = 0; i < length; i++)
                sb.insert(0, 0);
        }
        for(int i = 0; i<bitPositions.length; i++){
            if (sb.charAt(bitPositions[i]) != 49) {
                return false;
            }
        }
        return true;
    }
    public boolean isAnyBitSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        StringBuilder sb = new StringBuilder(str);
        if(str.length() <= 7) {
            int length = 7 - str.length();
            for(int i = 0; i < length; i++)
                sb.insert(0, 0);
        }
        for(int i = 0; i<bitPositions.length; i++){
            if (sb.charAt(bitPositions[i]) == 49) {
                return true;
            }
        }
        return false;
    }
    public String selectAnyBitSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        StringBuilder sb = new StringBuilder(str);
        if(str.length() <= 7) {
            int length = 7 - str.length();
            for(int i = 0; i < length; i++)
                sb.insert(0, 0);
        }
        for(int i = 0; i< bitPositions.length - 1; i++){
            for(int j = 0; j < sb.length() - 1; j++){
                if(sb.charAt(bitPositions[i]) != 49){
                    sb.insert(bitPositions[i], 1).deleteCharAt(bitPositions[i]+1);
                }
            }

        }
        return sb.toString();
    }
    public String deselectAnyBitSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        StringBuilder sb = new StringBuilder(str);
        if(str.length() <= 7) {
            int length = 7 - str.length();
            for(int i = 0; i < length; i++)
                sb.insert(0, 0);
        }
        for(int i = 0; i< bitPositions.length - 1; i++){
            for(int j = 0; j < sb.length() - 1; j++){
                if(sb.charAt(bitPositions[i]) != 49){
                    sb.insert(bitPositions[i], 0).deleteCharAt(bitPositions[i]+1);
                }
            }

        }
        return sb.toString();
    }
}
