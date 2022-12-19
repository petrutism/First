package collections.set;

import java.util.HashSet;
import java.util.Set;

public class TaskOne {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Kola");
        names.add("Faina");
        names.add("Juockis");
        names.add("Bubis");
        System.out.println("Elementai " + names);
        System.out.println("Dydis " + names.size());

        names.add("Faina");
        System.out.println("Elementai " + names);
        System.out.println("Dydis " + names.size());

        System.out.println("Is Bubis removed: " + names.remove("Bubis"));

        System.out.println("Elementai " + names);
        System.out.println("Dydis " + names.size());

        names.clear();

        System.out.println("Elementai " + names);
        System.out.println("Dydis " + names.size());
    }
}
