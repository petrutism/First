package studies;

public class EqualsExamples {
    public static void main(String[] args) {
        int x = 10, y = 10;
        System.out.println("x == y --> " + (x == y));
        System.out.println("Integer.compare(x, y)" + Integer.compare(x, y));
        String text = "Labas";
        String textOne = "Labas";
        String textTwo = new String("Labas");

        System.out.println(text.equals(textTwo));
    }
}
