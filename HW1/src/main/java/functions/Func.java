package functions;

public class Func {
    public String numbOfDay(int numb){
        switch (numb){
            case 1:
                return "mon";
            case 2:
                return "tue";
            case 3:
                return "wed";
            case 4:
                return "thur";
            case 5:
                return "fri";
            case 6:
                return "sat";
            case 7:
                return "sun";
            default:
                return null;
        }
    }
    public double dotsDistance(int[] first, int[] second){
        double xCord = Math.pow((second[0] - first[0]), 2);
        double yCord = Math.pow((second[1] - first[1]), 2);
        double dist = Math.sqrt(xCord + yCord);
        return dist;
    }
}
