package lists;


import java.util.Arrays;

public class AList1 implements IList {
    private int capacity = 10;
    private int[] array;
    private int currID = 0;

    public AList1(){
        array = new int[capacity];
    }

    public AList1(int capacity){
        if(capacity > 10){
            this.capacity = capacity;
        }
        array = new int[this.capacity];
        currID = this.capacity;
    }

    public AList1(int[] array){
        try {
            if(array.length > capacity) {
                capacity = array.length;
            }
            this.array = new int[capacity];
            for (int i = 0;i < array.length; i++) {
                this.array[i] = array[i];
            }
            currID = capacity;
        }catch (NullPointerException e){
            e.getMessage();
        }
    }


    @Override
    public void clear() {
        notNull();
        currID = 0;
        array = null;
    }

    @Override
    public int size() {
        return currID;
    }

    @Override
    public int get(int index) {
        if(array == null){
            try {
                throw new Exception("Current array is null");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return array[index];
    }

    @Override
    public boolean add(int value) {
        notNull();
        array = extend();
        array[currID] = value;
        currID++;
        return true;
    }

    @Override
    public boolean add(int index, int value) {
        notNull();
        array = extend();
        for (int i = currID; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = value;
        currID++;
        return true;
    }

    @Override
    public int remove(int number) {
        notNull();
        if(contains(number)){
            removeByIndex(numOfCell(number));
        }
        return currID--;
    }

    @Override
    public int removeByIndex(int index) {
        notNull();
        removeForward(index);
        return currID--;
    }

    private void removeForward(int index){
        for( ; index < currID; index++){
            array[index] = array[index + 1];
        }
    }

    private void removeBackward(int index){
        if(currID == capacity){
            extend();
        }
        for(int i = currID ; i> index; i--){
            array[index] = array[index + 1];
        }
    }


    @Override
    public boolean contains(int value) {
        for (int i:array) {
            return array[i] == value;
        }
        return false;
    }

    private int numOfCell(int value) {
        for (int i:array) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean set(int index, int value) {
        if(index >= capacity){
            extend();
        }
        removeBackward(index);
        array[index] = value;
        return true;
    }

    @Override
    public void print() {
        notNull();
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public boolean removeAll(int[] ar) {
        return false;
    }

    private void notNull(){
        if(array == null){
            throw new NullPointerException("Array is null");
        }
    }

    private int[] extend(){
        int[] array1;
        if(currID == capacity){
            capacity += 5;
            array1 = new int[capacity];
            for (int i : array) {
                array1[i] = array[i];
            }
            return array1;
        }
        return array;
    }
}
