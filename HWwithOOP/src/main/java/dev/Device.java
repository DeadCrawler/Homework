package dev;

import object.Memory;
import object.MemoryObject;
import proc.Processor;
import proc.ProcessorArm;
import proc.ProcessorX86;
import static utils.Constants.*;

public class Device {
    private Processor processor;
    private Memory memory;
    private int memoryCapacity;
    private MemoryObject info;


    public Device(int frequency, int cache, int bitCapacity, String type){
        try {
            if(type.equals(X86)) {
                processor = new ProcessorX86(frequency, cache, bitCapacity);
            }else if(type.equals(ARM)) {
                processor = new ProcessorArm(frequency, cache, bitCapacity);
            }else System.out.print("No such type does exist, existing types is ARM, X86\n" +
                            "X86 is type by default");

        } catch (NullPointerException e) {
            throw new NullPointerException("Processor type couldn't be null");
        }
    }

    public void save(String[] data){
        try{
            memory = new Memory(data);
            memoryCapacity = data.length;
            returnMemory(memory);
        }catch (NullPointerException e){
            throw new NullPointerException("Data array is null");
        }
    }
    private void returnMemory(Memory memory){
        this.memory = memory;
    }

    public String[] readAll(){
        if(memoryCapacity == 0){
            try {
                throw new Exception("Nothing to read");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        String[] reader = new String[memoryCapacity];
        for(int i = memoryCapacity - 1; i >= 0 ; i--){
            reader[i] = memory.readLast();
            memory.removeLast();
        }
        return reader;
    }

    public void dataProcessing(){
        try {
            for(int i = 0; i<memoryCapacity; i++){
                processor.dataProcess(memory.readLast());
            }
        }catch (NullPointerException e){
            throw new NullPointerException("Memory is null");
        }

    }

//    private Processor getProcessor(int frequency, int cache, int bitCapacity, String type) {
//        try {
//            switch (type) {
//                case "X86":
//                    return processor = new ProcessorX86(frequency, cache, bitCapacity);
//                case "ARM":
//                    return processor = new ProcessorArm(frequency, cache, bitCapacity);
//                default:
//                    System.out.print("No such type does exist, existing types is ARM, X86\n" +
//                            "X86 is type by default");
//            }
//
//        } catch (NullPointerException e) {
//            throw new NullPointerException("Processor type couldn't be null");
//
//
//        }
//        String type1 = "X86";
//        return getProcessor(frequency, cache, bitCapacity, type1);
//    }


    public String getSystemInfo(){
        info = getInfo();
        return processor.getDetails() + info.toString();
    }

    private MemoryObject getInfo(){
        info = new MemoryObject(memoryCapacity, memory.notNull(0));
        return info;
    }
}
