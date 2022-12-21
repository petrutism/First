package collections.Map;

import java.util.HashMap;
import java.util.Map;

public class TaskOneTwo {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        TaskOneTwo taskOne = new TaskOneTwo();

        numbers.put(11, "Vienuolika");
        numbers.put(12, "Dvylika");
        numbers.put(100, "Simtas");
        System.out.println(numbers);

        if(numbers.containsKey(11)){
            System.out.println("Contains 11: " + numbers.containsKey(11));
        }
        if(numbers.containsValue("Simtas")){
            System.out.println("Contains simtas");
        }

        numbers.forEach((key, value) -> System.out.println("Raktas: " + key + ", Reiksme: " + value));
        taskOne.printMap(numbers);

        numbers.remove(11);
        System.out.println("11 is removed: ");
        numbers.forEach((key, value) -> System.out.println("Raktas: " + key + ", Reiksme: " + value));

        numbers.clear();
        System.out.println("HashMap cleared: ");
        numbers.forEach((key, value) -> System.out.println("Raktas: " + key + ", Reiksme: " + value));
    }
    private void printMap (Map<Integer, String> numbers){
        System.out.println("Print for method: ");
        numbers.forEach((k, v) -> System.out.println("Raktas: " + k + ", Reiksme: " + v));
    }
}
