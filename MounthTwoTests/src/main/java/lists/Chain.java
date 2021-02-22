package lists;

public class Chain {

    Chain leftSide;
    Chain rightSide;
    Integer value;

    protected Chain(boolean prime){
        if(prime) {
            rightSide = null;
        }else leftSide = null;
    }

    protected Chain(Integer value){
        leftSide = null;
        rightSide = null;
        this.value = value;
    }
}
