package repeating.one;

public class Armstrong {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        for (int i = 100; i <= 999; i++) {

            c = (i % 10);
            b = ((i - c) % 100) / 10;
            a = (i - (i % 100)) / 100;

            if ((Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) == i) {
                System.out.println(i);
            }
        }
    }
}
