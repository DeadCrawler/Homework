public class TheGame {
    Commands comm = new Commands();
    public boolean firstTry(int ftry, int rand){
        if (ftry != rand){
            return true;
        }else {
            return false; }
    }

    public void nextTry(int ftry, int rand, int ntry){
        int inc = Math.abs(rand - ftry);
        int decr = Math.abs(rand - ntry);
        if(decr == 0){
            comm.godLike();
        }
        else if (inc > decr) {
            comm.tiCrasava();
        } else if (inc < decr) {
            comm.tiLox();
        }
    }
}
