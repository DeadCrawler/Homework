package lists.LList;

import lists.IList;

import java.util.Arrays;

public class LList1 implements IList {
    private final Chain primeCell = new Chain();
    private Chain cell;
    private Chain saveCell;

    private int capacity = 10;
    private int counter;
    private int id = 0;
    private int valueSaver;
    private int[] xD;

    public LList1(int capacity){
        nullefier();
        if(capacity >= this.capacity)  this.capacity = capacity;

        Chain prevCell;

        for(; counter < this.capacity; counter++){
            add(-666);
        }
    }
    public LList1(int[] array){
        nullefier();
        notNullArray(array);

        Chain prevCell;

        for(; counter < array.length; counter++){
            add(array[counter]);
        }
    }

    public class Chain{
        Chain leftSide;
        Chain rightSide;
        Integer value;

        private Chain(){
            rightSide = null;
        }

        private Chain(Integer value){
            leftSide = null;
            rightSide = null;
            this.value = value;
        }
    }

    @Override
    public void clear() {
        try{
            primeCell.rightSide = null;
        }catch (NullPointerException e){
            throw new NullPointerException("LList is already null");
        }
    }

    @Override
    public int size() {
        return id;
    }

    @Override
    public int get(int index) {
        nullefier();
        if(indexCrusher(index)){
            throw new IllegalArgumentException("Wrong index");
        }
        finder(index, primeCell, false);
        return valueSaver;
    }

    @Override
    public boolean add(int value) {
        cell = new Chain(null);
        try {
            if (primeCell.rightSide != null) {
                lastChain(primeCell);
                saveCell.rightSide = cell;
                cell.leftSide = saveCell;
            } else {
                primeCell.rightSide = cell;
            }
            cell.value = value;
            id++;
            return true;
        }catch (IllegalArgumentException e){
            return false;
        }
    }

    @Override
    public boolean add(int index, int value) {
        nullefier();

        Chain addCell;
        if(indexCrusher(index)){
            throw new IllegalArgumentException("Wrong index");
        }

        if(index == 0){
            addCell = primeCell.rightSide;
            primeCell.rightSide = null;
            add(value);
            cellConnector(cell, addCell);
            return true;
        }

        cellFinder(index, primeCell.rightSide);
        cellDisconnector(cell);
        addCell = cell; //trying to save access to cell
        add(value);
        cellConnector(cell, addCell); // cell we get from add() method

        return true;
    }



    @Override
    public int remove(int number) {
        nullefier();

        finder(number, primeCell.rightSide, true);  //getting valSaver to buffer
        removeByIndex(valueSaver);
        return 0;
    }

    @Override
    public int removeByIndex(int index) {
        nullefier();

        if(indexCrusher(index)){
            throw new IllegalArgumentException("Wrong index");
        }
        cellFinder(index, primeCell.rightSide);

        if(cell.leftSide != null && cell.rightSide !=null){       //disconnecting all of address links of target cell
            cellDisconnector(cell);


            cell = cell.rightSide;
            cellDisconnector(cell);

            lastChain(primeCell);       // we got saveCell in buffer now

            cellConnector(saveCell, cell);

        }else if(cell.rightSide == null){// for last index
            cellDisconnector(cell);

        } else {                         //if it's 0 index
            cell = cell.rightSide;
            primeCell.rightSide = cell;
        }

        return id--;
    }

    @Override
    public boolean contains(int value) {  // it's my finder  :D
        nullefier();

        finder(value, primeCell.rightSide, true);
        return valueSaver != Integer.MIN_VALUE;
    }

    @Override
    public boolean set(int index, int value) {
        nullefier();

        if(indexCrusher(index)){
            return false;
        }

        cellFinder(index, primeCell.rightSide);

        cell.value = value;
        return true;
    }

    @Override
    public void print() {
        notNullList();
        nullefier();

        toArray();
        System.out.println(Arrays.toString(xD));
    }

    @Override
    public int[] toArray() {
        notNullList();
        nullefier();

        xD = new int[id];

        for(; counter < id; counter++){

            if(counter != 0) {
                cell = cell.rightSide;
            }else cell = primeCell.rightSide;

            arrayBuilder(cell);
            if(cell == null){
                return xD;
            }
        }
        return xD;
    }

    @Override
    public boolean removeAll(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = 0;
            xD[i] = ar[i];
        }
        return false;
    }
    /////////////////////////////////////////PRIVATE METHODS|||||||||||||||||||||||||||||

    private void notNullArray(int[] array){
        if(array == null){
            throw new NullPointerException("Array is null");
        }
    }

    private void notNullList(){
        if(primeCell.rightSide == null){
            throw new NullPointerException("List is null");
        }
    }

    private boolean indexCrusher(int index){
        return index > id || index < 0;
    }

    private void nullefier(){counter = 0;    valueSaver = Integer.MIN_VALUE;    xD = null;}

    private void cellDisconnector(Chain cell){
        saveCell = cell.leftSide;
        saveCell.rightSide = null;
        cell.leftSide = null;
    }

    private void cellConnector(Chain firstCell, Chain secondCell){
        firstCell.rightSide = secondCell;
        secondCell.leftSide = firstCell;
    }

    private void lastChain(Chain cell){
        if(cell.rightSide == null){
            saveCell = cell;
            return;
        }
        lastChain(cell.rightSide);
    }

    private void finder(int value, Chain cell, boolean switcher){
        if (!switcher){              //by index finder
            if (counter == value) {
                valueSaver = cell.value;
                return;
            }
            counter++;
            finder(value, cell.rightSide, false);
        }else{                      //by value finder
            if(cell == null){
                throw new IllegalArgumentException("No such value in list");
            }
            if(value == cell.value){
                valueSaver = counter;
                return;
            }
            counter++;
            finder(value, cell.rightSide, true);
        }
    }


    private void cellFinder(int index, Chain cell){
        if(counter == index){
            this.cell = cell;
            return;
        }
        counter++;
        cellFinder(index, cell.rightSide);          //searching by index
    }

    private void arrayBuilder(Chain cell){
        try{
            xD[counter] = cell.value;
        }catch (NullPointerException e){
            throw new NullPointerException("Cell is null");
        }
    }
}
