package object.opera;


import object.Memory;

public class Operations extends Memory {


    public Operations(String[] memoryCell) {
        super(memoryCell);
    }

    @Override
    public String readLast() {
        return getMemoryCell(memoryCell.length);
    }

    @Override
    public String removeLast() {
        return null;
    }

    @Override
    public boolean save() {
        return false;
    }

    @Override
    public void getMemoryInfo() {

    }
}
