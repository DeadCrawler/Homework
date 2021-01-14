package intarface;

import listeners.ScannerListenner;
import logic.Math;
import utils.Const;
import utils.Scan;

public class Biefshtakes {
    public Biefshtakes(){
        System.out.println(Const.WELCOME_TEXT);
        Scan scan1 = new Scan();
        Scan scan2 = new Scan();
        ScannerListenner obj = new ScannerListenner(scan1.Scan(), scan2.Scan(), new Math());
        System.out.println(Const.EXIT_TEXT + obj.heart());
    }
}
