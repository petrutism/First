package studies;

public class RunFromCMD {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        System.out.println("plotas1 -> " + areaOne(a, b));
        System.out.println("plotas2 -> " + areaTwo(a, b));
        System.out.println("plotas3 -> " + areaThree(a));
        System.out.println("plotas4 -> " + areaFour(a));
    }

    public static double areaOne(double a, double b) {
        return (a * b) / 2;
    }

    public static double areaTwo(double a, double b) {
        return a * b;
    }

    public static double areaThree(double a) {
        return a * a;
    }

    public static double areaFour(double a) {
        return 3.1415 * (a * a);
    }
}

