package repeating.one;

public class Average {
    public static void main(String[] args) {
        Average average = new Average();
        double[] mas = {2d, 34d, 65d, 70d};
        System.out.printf("%.5f", average.average(mas));

    }
    private double average (double[] mas){
        double sum=  0;
        for (int i = 0; i < mas.length; i++){
            sum += mas[i];
        }
        return sum / mas.length;
    }
}
