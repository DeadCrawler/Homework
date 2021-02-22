import interfaces.IList;
import interfaces.ITree;
import lists.LList1;
import lists.LList2;
import tree.BSTree;

import java.util.*;
import java.util.regex.Pattern;

public class Tasks{
    int counter = 0;
    int mem = Integer.MIN_VALUE;
    IList iList;
    ITree iTree;
    StringBuilder stringBuilder;
    private static String PATTERN = "\\s*(\\s&[&{&(&)&}&])\\s*";
    String string;


    public int[] quickSort(int[] array){
        if(array.length == 0){
            return new int[] {0};
        }else if(array.length == 1){
            return array;
        }
        int low = -1;
        int high = 0;
        int pivot = array.length - 1;
        array = arrayRunner(array, pivot, low, high);
        pivot /= 2;
        counter = pivot;
        do{
            array = arrayRunner(array, pivot++, low, high);
        }while (pivot == array.length-1);
        do{
            array = arrayRunner(array, counter--, low, high);
        }while (counter == 0);


        return array;
    }



    public int[] treeSort(int[] array){
        zeroCounter();

        iTree = new BSTree();
        iTree.init(array);

        return iTree.toArray();
    }

    public int[] linkedListTwoSidedDumbEdition(int[] array){
        zeroCounter();
        iList = new LList2(array);

        return treeSort(iList.toArray()); //это самый удобный способ
    }

    public int[] linkedListTwoSided(int[] array){
        zeroCounter();

        return bubbleSort(array, true);
    }



    public int[] linkedListSingle(int[] array){
        zeroCounter();
        return bubbleSort(array, false);
    }

    public int[] linkedListReverseTwoSided(int [] array){
        zeroCounter();
        return reverser(array, true);
    }

    public int[] linkedListReverseOneSided(int [] array){
        zeroCounter();
        return reverser(array, true);
    }

    public boolean scooba(String string){
//        Pattern pattern = Pattern.compile(PATTERN);
        boolean matches = Pattern.matches(PATTERN, string);
        this.string = string;
        if(matches){
//            stringSelector();
        }else return false;

        return true;
    }

    ////////////////////////////PRIVATE METHODS||||||||||||||||||||||||||||||||

    private boolean stringSelector(String string, int start, int end, char selector){
        switch (selector) {
            case '[' -> stringSelector(string.substring(start, end), start, end, ']');
//            case ']' -> stringSelector(this.string,
            case '{' -> stringSelector(string.substring(start, end), 0, 0, '}');
            case '(' -> stringSelector(string.substring(start, end), 0, 0, ')');
        }
        if(string.charAt(counter) == '['){
            stringSelector(string.substring(string.indexOf('['), string.indexOf(']')),
                    string.indexOf('['), string.indexOf(']'), ']');
        }else if(string.charAt(counter) == '{'){
//            stringSelector(string.substring(string.indexOf('{'), string.indexOf('}')), ))
        }
        return true;
    }

    private int[] reverser(int[] array, boolean two){
        if(two) iList = new LList2(array);
        else iList = new LList1(array);

        int length = iList.size() - 1;
        for(;counter <= length/2 + 1; counter++){
            mem = iList.get(counter);
            iList.set(counter, iList.get(length - counter));
            iList.set(length - counter, mem);
        }
        return iList.toArray();
    }

    private int[] arrayRunner(int[] array, int pivot, int low, int high){
        if(high == pivot){
            mem = array[pivot];
            array[pivot] = array[low];
            array[low] = mem;
            return array;
        }
        if(array[high] <= array[pivot]){
            low++;
            mem = array[high];
            array[high] = array[low];
            array[low] = mem;

        }
        high++;
        return arrayRunner(array, pivot, low, high);
    }

    private int[] bubbleSort(int [] array, boolean single){
        if(single){ iList = new LList2(array); }
        else{ iList = new LList1(array);  }
        int length = iList.size();

        if(iList == null){
            return new int[]{0};
        }

        for(int i = 0;i < length; i++){
            zeroCounter();
            for(; counter < length - i; counter++){
                if(iList.get(counter) > iList.get(counter+1)){
                    mem = iList.get(counter);
                    iList.set(counter, iList.get(counter+1));
                    iList.set(counter+1, mem);
                }
            }
        }
        return iList.toArray();
    }

    private void notNullArray(int[] arr){if(arr == null) throw new NullPointerException("Array is null");}

    private void zeroCounter(){this.counter = 0; this.mem = Integer.MIN_VALUE;}
}
