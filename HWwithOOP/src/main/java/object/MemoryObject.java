package object;

public class MemoryObject extends Memory{
    private int numOfFreeCells;
    private int percentOfUsage;
    private String noCell;

    public MemoryObject(int initialCapacity, int count){
        numOfFreeCells = initialCapacity - count;
        percentOfUsage = (count * 100) / initialCapacity;
    }

    public MemoryObject(int initialCapability){
        noCell = " The number of used cells is " + initialCapability + ", no memory cells left to use";
    }

    @Override
    public String toString() {
        if(noCell == null){
            return "MemoryObject{" +
                    "numOfFreeCells=" + numOfFreeCells +
                    ", percentOfUsage=" + percentOfUsage +
                    '}';
        }
        return "MemoryObject{" +
                "numOfFreeCells=" + numOfFreeCells +
                ", percentOfUsage=" + percentOfUsage +
                '}' + noCell;
    }
}
