package stringFormat;

public class Example {
    public static void main(String[] args) {
        String name = "Petras";
        String surname = "Petraitis";
        int age = 65;
        float height = 1.9333f;

        String line = String.format("Asmens %s %s, amzius %s m., ugis %.3f m", name, surname, age, height);
        System.out.println(line);

        line = String.format("|%20s|%n|%20s|", "As", "Trumulis");
        System.out.println(line);
    }
}
