package collections.list;

import java.util.ArrayList;
import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("labas");
        words.add("labass");
        words.add("pimpampim");
        words.add("oops");

        System.out.println(words);

        String max = words.get(0);

        for (String ch : words) {
            if (max.length() < ch.length()) {
                max = ch;
            }
        }
        System.out.println(max);
    }
}