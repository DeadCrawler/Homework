public class LibMath {
    public double canon(double a, double v){
        double angle = Math.sin(2*a);
        double g = 6.7d;

        return (Math.pow(v, 2)*angle)/g;
    }

    public double carVsCar(double v1, double v2, double distance, double time){
        double distance1 = v1 * time;
        double distance2 = v2 * time;
        return Math.abs(distance - (distance1 + distance2));
    }

    public boolean triancle(){
        return true;
    }

    public double expression(int x){
        double firstEx = (double)(Math.pow(Math.E, x) * Math.E + 2 * Math.pow(Math.E, x) * Math.cos(x));
        double secondEx = (double) (6 * Math.exp(firstEx));
        double thirdEx = (double) (secondEx / (Math.exp(x) + (Math.pow(Math.E, x) * Math.E * Math.sin(x))));
        double fourthEx = (double) (thirdEx + Math.abs(Math.cos(x) / Math.pow(Math.E, Math.sin(x)))) ;
        return fourthEx;
    }
}
