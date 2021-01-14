package listeners;

import utils.Const;
import utils.Scan;
import logic.Math;

public class ScannerListenner {
    private int num;
    private int kor;
    private Math math;

    public ScannerListenner(int num, int kor, Math math){
        this.num = num;
        this.kor = kor;
        if (1 > num || kor > 1000) {
            System.out.println(Const.ERROR_MESSAGE);
            System.exit(0);
        }
        this.math = math;
    }

    public double heart(){

        double answer = math.neededTime(num, kor);
        return answer;
    }
}
