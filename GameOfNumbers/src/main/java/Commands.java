public class Commands {
    void exception(){
        System.out.println("You wrote incorrect value");
    }
    void hello(){
        System.out.printf("Hello There\nI prepared a Game for you!\n");
    }
    void diapazone(){
        System.out.println("Please enter minimal  ̶d̶i̶a̶p̶a̶z̶o̶n̶e̶ range of numbers");
    }
    void numberOfNumbers(){
        System.out.println("And!! number of tries");
    }
    void start(int a, int b, int c){
        System.out.printf("Привет, я загадал число от %d до %d вашего диапазона. Попробуй угадать это за %d попыток!\n", a, b, c);
    }
    void firstTry(){
        System.out.println("So your first try=) Youll really lucky if you guess");
    }
    void uTried(){
        System.out.println("You've Missed T_T");
    }
    void godLike(){
        System.out.println("Wait, WHAT?!?! How could you?");
        System.out.println("Your luck is beyond GODLIKE!");
        System.out.println("You've got it!! Good Job! |m/,");
    }
    void nTry(){
        System.out.println("C'mon, JUST DO IT!!! Enter your next number=)");
    }
    void tiLox(){
        System.out.println("It's getting colder =(");
    }
    void tiCrasava(){
        System.out.println("You're doing wright =)");
    }
    void holdOn(int i){
        System.out.println("Hold on!!! There " + i + " more tries left for you!");
    }
    void endGame(int rand){
        System.out.printf("So, this is it...\n " +
                "The Game is Over and You lost.\n" +
                "I know You tried, but its over...\n" +
                "So now, its time for say last goodbyes\n" +
                "It was really Fun, thank you\n" +
                "My time is.. over...\n" +
                "the..\n secr#t...\n n&mber..<.!$.#..\n is... \n" +
                "%d\n", rand);
    }

}
