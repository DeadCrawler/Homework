import check.Exceptions;
import check.Utils;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import static check.Utils.*;
import static check.Const.*;




public class Methods {
    public Utils utils;

    public Methods(){
        this.utils = new Utils();
    }

    public String bubbleSort(int[] arr)throws Exception{
        if (Arrays.toString(arr) == null) throw new Exception(NULL);
        
        for (int i = 0; i < arr.length; i++){
            for( int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j+1]){
                    int box  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = box;
                } } }
        String str = Arrays.toString(arr);
        return str;
    }

    public int binarySearch(int[] sortedArr, int num){
        int indexOfNum = -1;
        for(int i= 0;i < sortedArr.length - 1; i++){
            if(sortedArr[i]>sortedArr[i+1]) return indexOfNum;
        }
        for (int i = (sortedArr.length / 2)-1; i >= 0; i--){
            if(num == sortedArr[i]){
                return i;
            }
            for (int j = sortedArr.length/2; j > sortedArr.length - 1; j++){
                if(num == sortedArr[j]){
                    return j;
                }
            } }
        for(int i = 0; i < sortedArr.length -1; i++){
            if(sortedArr[i] == num + 1){
                return i;
            }else if(sortedArr[i] == num - 1){
                return i;
            } }
        return indexOfNum;
    }

    public boolean isAllBitsSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        stringBuilder = utils.sbToSeven(str);
        for(int i = 0; i<bitPositions.length; i++){
            if (stringBuilder.charAt(bitPositions[i]) != 49) {
                return false;
            }
        }
        return true;
    }
    public boolean isAnyBitSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        stringBuilder = utils.sbToSeven(str);
        for(int i = 0; i<bitPositions.length; i++){
            if (stringBuilder.charAt(bitPositions[i]) == 49) {
                return true;
            }
        }
        return false;
    }
    public String selectAnyBitSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        stringBuilder = utils.sbToSeven(str);
        for(int i = 0; i< bitPositions.length - 1; i++){
            for(int j = 0; j < stringBuilder.length() - 1; j++){
                if(stringBuilder.charAt(bitPositions[i]) != 49){
                    stringBuilder.insert(bitPositions[i], 1).deleteCharAt(bitPositions[i]+1);
                }
            }

        }
        return stringBuilder.toString();
    }
    public String deselectAnyBitSelected(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        stringBuilder = utils.sbToSeven(str);
        for(int i = 0; i< bitPositions.length - 1; i++){
            for(int j = 0; j < stringBuilder.length() - 1; j++){
                if(stringBuilder.charAt(bitPositions[i]) != 49){
                    stringBuilder.insert(bitPositions[i], 0).deleteCharAt(bitPositions[i]+1);
                }
            }
        }
        return stringBuilder.toString();
    }

    public String bitReversePositions(long number, byte[] bitPositions){
        String str = Long.toBinaryString(number);
        stringBuilder = utils.sbToSeven(str);

        for(int i = 0; i < bitPositions.length; i++){

            for(int j = 0; j < stringBuilder.length() - 1; j++){
                if(stringBuilder.charAt(bitPositions[i]) != 49){
                    if(bitPositions[i] == stringBuilder.length() - 1){
                        stringBuilder.append("1").deleteCharAt(bitPositions[i]);
                        break;
                    }else{
                    stringBuilder.insert(bitPositions[i], 1).deleteCharAt(bitPositions[i]+1);
                    break;
                    }
                }else if(stringBuilder.charAt(bitPositions[i]) != 48){
                    if(bitPositions[i] == stringBuilder.length() - 1){
                        stringBuilder.append("0").deleteCharAt(bitPositions[i]);
                        break;
                    }else{
                    stringBuilder.insert(bitPositions[i], 0).deleteCharAt(bitPositions[i]+1);
                    break;
                    } } } }
        return stringBuilder.toString();
    }
}
