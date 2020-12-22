public class Params {
    private int min;
    private int count;
    private int rand;
    private int ftry;
    private int ntry;
    Commands comm = new Commands();

    public void setMin(int min) {
        if (min<1 || min>100){
            comm.exception();
            System.exit(0);
        }else{     this.min = min;}
    }

    public int getMin() {
        return min;
    }

    public void setCount(int count) {
        if(count>5){
            comm.exception();
            System.exit(0);
        }else{
        this.count = count;}
    }

    public int getCount() {
        return count;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public int getRand() {
        return rand;
    }

    public void setFtry(int ftry) {
        this.ftry = ftry;
    }

    public int getFtry() {
        return ftry;
    }

    public void setNtry(int ntry) {
        this.ntry = ntry;
    }

    public int getNtry() {
        return ntry;
    }

    public String getString(){
        return min+" ,"+count+" ,"+rand+" !";
    }
}
