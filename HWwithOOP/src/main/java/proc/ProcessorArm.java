package proc;

import java.util.Locale;

import static utils.Constants.*;

public class ProcessorArm extends Processor{

    public String architecture = ARM;

    public ProcessorArm(int frequency, int cache, int bitCapacity) {
        super(frequency, cache, bitCapacity);
    }

    @Override
    public String dataProcess(String data) {
        return data.toLowerCase(Locale.ROOT);
    }

    @Override
    public String dataProcess(long data) {
        return Long.toBinaryString(data);
    }
}
