package collections.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        SetExample example = new SetExample();
        //example.hashSetExample();
        //example.linkedHashSet();
        example.treeSet();

    }

    private void hashSetExample() {
        Set<String> names = new HashSet<>();
        names.add("Kola");
        names.add("Faina");
        names.add("Juockis");
        names.add("Faina");
        names.add("Bubis");

        names.forEach(System.out::println);

        System.out.println(names.contains("Bubis"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Rainis", 18));
        cats.add(new Cat("Pukis", 5));
        cats.add(new Cat("Debeselis", 22));
        cats.add(new Cat("Debeselis", 2));
        cats.add(new Cat("Rainis", 18));
        cats.forEach(System.out::println);
    }

    private void linkedHashSet() {
        Set<String> cars = new LinkedHashSet<>();
        cars.add("Audi");
        cars.add("Opel");
        cars.add("BMW");
        cars.add("Aston Martin");
        cars.add("Audi");
        cars.forEach(System.out::println);

    }

    private void treeSet() {
        //reversintas rikiavimas apacioj
        TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        //TreeSet<Integer> numbers2 = new TreeSet<>();

        //TreeSet<Integer> reverse = (TreeSet<Integer>)numbers.descendingSet();
        numbers.add(1);
        numbers.add(8);
        numbers.add(6);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);

        numbers.forEach(System.out::println);
        //reverse.forEach(System.out::println);
        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Rainis", 18));
        cats.add(new Cat("Pukis", 5));
        cats.add(new Cat("Debeselis", 22));
        cats.add(new Cat("Debeselis", 2));
        cats.add(new Cat("Rainis", 18));
cats.forEach(System.out::println);
    }

}
