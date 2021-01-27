package object;

public class Memory {
    private String[] memoryCell;
    private int initialCapacity;
    private int count = 0;

    public Memory(){
//        memoryCell = null;
        initialCapacity = 10;
        memoryCell = new String[initialCapacity];
    }

    public Memory(String[] memoryCell){
//        if(memoryCell == null){
//            throw new NullPointerException("FUCK YOU");
//        }
        try {
            initialCapacity = memoryCell.length + 10;
            this.memoryCell = new String[initialCapacity];
            for (int i = 0; i < memoryCell.length; i++) {
                this.memoryCell[i] = memoryCell[i];
            }
            count = notNull(0) + 1;

        }catch (NullPointerException e){
            e.getMessage();
        }

    }


    public String readLast (){
//        try {
            return memoryCell[notNull(0)];
//        }catch (NullPointerException e){
//            throw new NullPointerException("NullPoint");
//        }
    }

    public String removeLast(){
        if(count >= 0) {
            memoryCell[notNull(0)] = null;
            count--;
            return "Element #" + (count) + " is null";
        }
     return "There is nothing to remove";
    }

    public boolean save(String xD){
        try{
            if(notNull(0) == -1){
                return false;
            }
            memoryCell[notNull(0)+1] = xD;
            count++;
            return true;
        }catch (NullPointerException | StackOverflowError | ArrayIndexOutOfBoundsException e){
            return false;
        }
    }

    public MemoryObject getMemoryInfo(){
        if(notNull(0) == -1){
            return new MemoryObject(initialCapacity);
        }
        return new MemoryObject(initialCapacity, notNull(0) + 1);
    }


    public int notNull(int count){
        if(count == initialCapacity){
            return -1;
//            throw new ArrayIndexOutOfBoundsException("You are xD");
        }
        if(initialCapacity != 10){
            return memoryCell[count] == null? count - 1: notNull(count+1) ;
        } else return 0;
    }
}
