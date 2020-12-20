public class Introduce {
    void hello(){
        System.out.println("Hello There");
        System.out.println("");
    }

    void minVal(){
        System.out.println("Enter min value" + System.lineSeparator() + "Min value must be > 1");
    }

    void maxVal(){
        System.out.println("Enter max value" + System.lineSeparator() + "Max value must be < 500");
    }

    void exception(){
        System.out.println("You entered wrong values, please try again");
    }

    void comm(){
        System.out.println("GENERATE EXIT HELP");
    }

    void help(){
        System.out.println("This program randomize unrepeatable numbers from your Min value to Max, till exclusive numbers left no more" + System.lineSeparator() + "Enter command in command line" + System.lineSeparator() + "GENERATE will generate you new number" + System.lineSeparator() + "EXIT will end up program, you never enjoyed it at all:D");
    }
    void exit(){
        System.out.println("Are you sure?" + System.lineSeparator() + "Y / N ?");
    }


    boolean choise(){

        String ans = "";
        do {
            Diff diff = new Diff();
            String ch = diff.scan();
            if (ch.equalsIgnoreCase("generate")) {
                return false;
            } else if (ch.equalsIgnoreCase("help")) {
                help();
                System.out.println("");
                comm();
            } else if (ch.equalsIgnoreCase("exit")) {
                exit();
                ans = diff.scan();
                if (ans.equalsIgnoreCase("n")) {
                    comm();     }
                else if(ans.equalsIgnoreCase("y")){
                    System.exit(0);
                }else System.out.println("You wrote incorrect command");
            }else System.out.println("You wrote incorrect command");    comm();
        }while(true);
    }

    void finale(){
        System.out.println("You are out of numbers =(" + System.lineSeparator() + "Good Bye" + System.lineSeparator() + "I'm too lazy to cycle it (づ ◕‿◕ )づ" + System.lineSeparator() + "и да, если вам показалось что програма отдает одинаковые значения, вам показалось=)");
    }

}
