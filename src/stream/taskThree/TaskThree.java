package stream.taskThree;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class TaskThree {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("people.txt"))) {

            List<String> peoples = br.lines()
                    .filter(v -> !v.startsWith("id"))
                    .map(v -> v.substring(v.indexOf(", ") + 2, (v.length())))
                    .map(v -> v.substring(0, v.indexOf(", ")))
                    .distinct()
                    .sorted()
                    .toList();

            peoples.forEach(v -> System.out.println(v));

        } catch (IOException e) {
            System.out.println("Something's wrong... " + e.getMessage());
        }
    }
}
