package studies;

public class NonPrimitiveTypes {

    //konstantos rasomos virsuje, reiksme nekeiciama
    public static final double KONSTANTA = 100;

    public static void main(String[] args) {
        int a = 10; //default 0
        Integer intA = Integer.parseInt("50");//default null

        float b = 10.0f;
        Float floatB = Float.max(50.f, 1500f);

        double c = 50;
        Double doubleC = Double.parseDouble("123.5");


    }
}
