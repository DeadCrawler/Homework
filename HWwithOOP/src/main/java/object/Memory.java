package object;

import java.util.Arrays;

public abstract class Memory {
    private String[] memoryCell;

    public Memory(String[] memoryCell){
        this.memoryCell = memoryCell;
    }

    public void setMemoryCell(String cell, int id) {
        if(cell == null){
            System.exit(0);
        }
        memoryCell[id] = cell;
    }

    public String getMemoryCell(int i) {
        return memoryCell[i];
    }

    @Override
    public String toString() {
        return "Memory{" +
                "memoryCell=" + Arrays.toString(memoryCell) +
                '}';
    }


    public abstract String readLast();

    public abstract String removeLast();

    public abstract boolean save();

    public abstract void getMemoryInfo();
    }
}
