package stream.taskOne;


import java.util.*;
import java.util.function.BiFunction;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ArrayList<String> text1 = new ArrayList<>();
        ArrayList<String> text2 = new ArrayList<>();

        text1.add("Mama");
        text1.add("Obuolys");
        text1.add("Jonas");
        text1.add("Katinas");
        text1.add("Pupa");

        text2.add("PupaPupa");
        text2.add("Antras");
        text2.add("Lovatiese");
        text2.add("lydeka");
        text2.add("Spiningas");

        BiFunction<ArrayList<String>, ArrayList<String>, ArrayList<String>> sorted = main::sorted;

        ArrayList<String> sorted1 = sorted.apply(text1, text2);

        sorted1.forEach(System.out::println);
    }
    private ArrayList<String> sorted(ArrayList<String> text1, ArrayList<String> text2) {

        ArrayList<String> joined = new ArrayList<>(text1);

        joined.addAll(text2);
        Collections.sort(joined);

        return joined;
    }


}
