package proc;

public abstract class Processor {
    private final int frequency;
    private final int cache;
    private final int bitCapacity;

    public Processor(int frequency, int cache, int bitCapacity){
        this.frequency = frequency;
        this.cache = cache;
        this.bitCapacity = bitCapacity;
    }

    public String getDetails() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cache=" + cache +
                ", bitCapacity=" + bitCapacity +
                '}';
    }

    public abstract String dataProcess(String data);

    public abstract String dataProcess(long data);
}
