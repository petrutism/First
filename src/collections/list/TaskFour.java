package collections.list;

import java.util.ArrayList;
import java.util.List;

public class TaskFour {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        TaskFour tf = new TaskFour();

        words.add("labas");
        words.add("labass");
        words.add("labas");
        words.add("pimpampim");
        words.add("oops");
        words.add("pimpampim");
        words.add("labas");
        words.add("pimpampim");

        System.out.println(tf.dublicates(words));
    }

    List<String> dublicates (List<String> words){
        List<String> dublicates = new ArrayList<>();
        for(String word : words){
            if (!dublicates.contains(word)) {
                dublicates.add(word);
            }
        }
        return dublicates;
    }
}
