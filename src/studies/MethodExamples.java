package studies;

public class MethodExamples {
    public static void main(String[] args) {
        noReturn();
        second("Pupki");
        System.out.println(sum(10, 20));

    }

    public static void noReturn() {
        System.out.println("XX");
    }

    public static void second(String name) {
        System.out.printf("Labas %s %s, malonu%n", name, 2 + 2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
