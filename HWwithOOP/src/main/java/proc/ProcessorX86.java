package proc;

import java.util.Locale;
import static utils.Constants.*;


public class ProcessorX86 extends Processor{

    public final String architecture = X86;

    public ProcessorX86(int frequency, int cache, int bitCapacity) {
        super(frequency, cache, bitCapacity);
    }

    @Override
    public String dataProcess(String data) {
        return data.toUpperCase(Locale.ROOT);
    }

    @Override
    public String dataProcess(long data) {
        return Long.toString(data);
    }
}
