public class Start {
    Params params = new Params();
    Ranimizer rean = new Ranimizer();
    Commands comm = new Commands();
    TheGame game = new TheGame();

    public void theBegining(){



        comm.hello();
        comm.diapazone();
        params.setMin(rean.scanner());
        comm.numberOfNumbers();
        params.setCount(rean.scanner());
        params.setRand(rean.random(params.getMin()));
//        System.out.println(params.getString());
        comm.start(params.getMin(), params.getMin() + 100, params.getCount());
        System.out.println(params.getRand());

//        boolean boo = game.firstTry(ftry, rand);
//        rean.lier(boo);

    }

    public void theEnd(){
        comm.firstTry();
        params.setFtry(rean.scanner());

        if (game.firstTry(params.getFtry(), params.getRand()) == true){
            comm.uTried();
        }else {
            comm.godLike();
            System.exit(0);
        }
        comm.nTry();
        for(int i = 0; i < params.getCount(); i++) {
            comm.holdOn(params.getCount() - i - 1);
            params.setNtry(rean.scanner());
            game.nextTry(params.getFtry(), params.getRand(), params.getNtry());
            params.setFtry(params.getNtry());
            if (i == params.getCount()-1){
                comm.endGame(params.getRand());
            }
        }
    }
}
