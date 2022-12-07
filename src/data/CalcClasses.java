package data;

public class CalcClasses {
    private final double a;
    private final double b;

    public CalcClasses(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double statTrikampis() {
        return (a * b) / 2;
    }

    public double staciakampis() {
        return a * b;
    }

    public double kvadratas() {
        return Math.pow(a, 2) ;
    }

    public double rutulis() {
        return 3.1415 * (Math.pow(a,2));
    }

}
