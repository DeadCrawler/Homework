package lists;

import interfaces.IList;

import java.util.Arrays;

public class LList2 implements IList {


    private final Chain primeCell = new Chain(true);
    private final Chain finalCell = new Chain(false);

    private Chain cell;
    private Chain saveCell;


    private int counter;
    private int id = 0;
    private int valueSaver;
    private int[] xD;


    public LList2(int[] array){
        nullefier();
        notNullArray(array);
        primeCell.rightSide = finalCell;
        finalCell.leftSide = primeCell;

        for(; counter < array.length; counter++){
            add(array[counter]);
        }
    }




    @Override
    public void clear() {
        garbageDestroyer(primeCell.rightSide);
        primeCell.rightSide = finalCell;
        finalCell.leftSide = primeCell;
        id = 0;
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
        cellFinderFunc(index);
        return cell.value;
    }

    @Override
    public boolean add(int value) {
        try{
            cell = new Chain(value);


            if(primeCell.rightSide != finalCell && primeCell.rightSide != null){
                lastChain(primeCell);
                finalCell.leftSide = cell;
                cellConnector(saveCell, cell);
            }else{
                primeCellIsConnect();
                primeCell.rightSide = cell;
                finalCell.leftSide = cell;
            }
            id++;
            return true;
        }catch (Exception e){
            throw new IllegalArgumentException("Something goes wrong in add");
        }
    }

    @Override
    public boolean add(int index, int value) {  // almost same method lake in LList1
        nullefier();                            //only but with some upgrades =P
        Chain addCell;

        if(indexCrusher(index)){
            throw new IllegalArgumentException("Wrong index");
        }

        if(index == 0){
            addCell = primeCell.rightSide;
            primeCell.rightSide = null;
            cell = addInstantly(value);
            cellConnector(cell, addCell);
            return true;
        }else if(index == id - 1){
            addCell = finalCell.leftSide;
            cellDisconnector(addCell);
            cell = addInstantly(value);
            cellConnector(cell, addCell);
            return true;
        }else {
            cellFinderFunc(index);
            cellDisconnector(cell);
            addCell = cell;
            cell = addInstantly(value);
            cellConnector(cell, addCell);
            return true;
        }
    }

    @Override
    public int remove(int number) {
        nullefier();

        byValueFinder(number);
        if(valueSaver != Integer.MIN_VALUE){
            removeByIndex(valueSaver);
        }else{
            throw new IllegalArgumentException("No such value");
        }
        return 0;
    }

    @Override
    public int removeByIndex(int index) {
        nullefier();

        if(indexCrusher(index)){
            throw new IllegalArgumentException("Wrong index");
        }
        cellFinderFunc(index);
        if(cell.leftSide != null && cell.rightSide !=null){             //disconnecting all of address links of target cell
            cellDisconnector(cell);
            cell = cell.rightSide;
            cellDisconnector(cell);
            lastChain(primeCell);
            cellConnector(saveCell, cell);

        }else if(cell.rightSide == null){// for last index
            cellDisconnector(cell);
            lastChain(primeCell);
            finalCell.leftSide = saveCell;
        } else {                         //if it's 0 index
            cell = cell.rightSide;
            cellDisconnector(cell);
            primeCell.rightSide = cell;
        }
        return id--;
    }

    @Override
    public boolean contains(int value) {
        nullefier();
        byValueFinder(value);
        return valueSaver != Integer.MIN_VALUE;
    }

    @Override
    public boolean set(int index, int value) {
        nullefier();

        if(indexCrusher(index)){
            return false;
        }

        cellFinderFunc(index);
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
        if(id == 0){
            return false;
        }
        xD = new int[id];
        return true;
    }

    //////////////////////////////////////////PRIVATE METHODS|||||||||||||||||||||||||||||||||||||||||

    private void notNullArray(int[] array){
        if(array == null){
            throw new NullPointerException("Array is null");
        }
    }

    private void nullefier(){counter = 0;    valueSaver = Integer.MIN_VALUE;    xD = null;}

    private void primeCellIsConnect(){
        if(primeCell.rightSide != finalCell || finalCell.leftSide != primeCell){
            throw new IllegalArgumentException("Prime cells are not connected");
        }
    }

    private void cellConnector(Chain firstCell, Chain secondCell){
        firstCell.rightSide = secondCell;
        secondCell.leftSide = firstCell;
    }

    private void notNullList(){
        if(primeCell.rightSide == finalCell){
            throw new NullPointerException("List is null");
        }
    }

    private void arrayBuilder(Chain cell){
        try{
            xD[counter] = cell.value;
        }catch (NullPointerException e){
            throw new NullPointerException("Cell is null");
        }
    }
    private boolean indexCrusher(int index){
        return index > id - 1 || index < 0;
    }

    private void cellFinderFunc(int index){
        if(index < id/2){
            cellFinder(index, primeCell.rightSide, true);
        }else{
            cellFinder(index, finalCell.leftSide, false);
        }
    }

    private void cellFinder(int index, Chain cell, boolean prime){
        if(counter == index && prime){
            this.cell = cell;
            return;
        }else if(counter == (id - index)-1 && !prime) {
            this.cell = cell;
            return;
        }
        counter++;
        if(prime) {
            cellFinder(index, cell.rightSide, true);          //searching by index
        }else{
            cellFinder(index, cell.leftSide, false);
        }
    }

    private void byValueFinder(int value){
        Chain fromStart = primeCell.rightSide;
        Chain fromEnd = finalCell.leftSide;;

        try{
            for (; counter < (id / 2) + 1; counter++) {
                if (fromStart.value == value) {
                    valueSaver = counter;
                    return;
                } else if (fromEnd.value == value) {
                    valueSaver = id - counter - 1;
                    return;
                }
                fromStart = fromStart.rightSide;
                fromEnd = fromEnd.leftSide;
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }


    private void cellDisconnector(Chain cell){
        saveCell = cell.leftSide;
        saveCell.rightSide = null;
        cell.leftSide = null;
    }

    private void lastChain(Chain cell){
        if(cell.rightSide == null){
            saveCell = cell;
            return;
        }
        lastChain(cell.rightSide);
    }

    private void garbageDestroyer(Chain cell){
        if(cell == finalCell){
            return;
        }
        cell.value = null;
        cell.leftSide = null;
        if(cell.rightSide == null){
            return;
        }
        garbageDestroyer(cell.rightSide);
    }

    private Chain addInstantly(int value){
        Chain cell = new Chain(value);
        lastChain(primeCell);
        saveCell.rightSide = cell;
        cell.leftSide = saveCell;
        id++;
        return cell;
    }


//    private void lastChain(Chain cell){
//        if(cell == primeCell){
//            lastPrimeChain(cell);
//        }else if(cell == finalCell){
//            lastFinalChain(cell);
//        }else{
//            throw new IllegalArgumentException("Cell either prime or final");
//        }
//    }

//    private void lastFinalChain(Chain cell){
//        if(cell.leftSide != null){
//            saveCell = cell;
//            return;
//        }
//        lastFinalChain(cell.leftSide);
//    }
//
//    private void lastPrimeChain(Chain cell) {
//        if (cell.rightSide == null) {
//            saveCell = cell;
//            return;
//        }
//        lastPrimeChain(cell.rightSide);
//    }
}
