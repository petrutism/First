package stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Andrius", "Jonas", "Petras", "kliunkis");

        //1. Stream is kolekcijos
        Stream<String> streamOfNames = names.stream();

        //2. Stream naudojant Stream.of metoda
        Stream<Integer> integerStream = Stream.of(4, 4, 5, 6, 78, 65, 74, 2, 2, 2);

        //3. from Array
        int[] mas = {1, 2, 3, 4, 5, 6, 7};
        IntStream integerStream1 = Arrays.stream(mas);
        String[] mas2 = {"a", "b"};
        Stream<String> words = Arrays.stream(mas2);

        //4. naudojant buffered reader
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            Stream<String> lines = br.lines();
        } catch (IOException e) {

        }

        StreamExample example = new StreamExample();

        List<User> users = List.of(new User("Pirmas", "Pirmaitis"),
                new User("Antras", "Antraitis"));

        users.forEach(example.print());
        users.forEach(user -> System.out.printf("%s %s%n", user.name(), user.surname()));
    }

    private Consumer<User> print (){
        return user -> System.out.printf("%s %s%n", user.name(), user.surname());
    }
}
