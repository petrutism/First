package collections.Map;

import java.util.HashMap;
import java.util.Map;

public class TaskThree {
    public static void main(String[] args) {
        Map<Integer, String> numOne = new HashMap<>();
        Map<String, Integer>  numTwo= new HashMap<>();
        numOne.put(11, "Vienuolika");
        numOne.put(12, "Dvylika");
        numOne.put(100, "Simtas");

        System.out.println("MapOne: ");
        numOne.forEach((key, value) -> System.out.println("Raktas: " + key + ", Reiksme: " + value));

        for(Integer key: numOne.keySet()){
            numTwo.put(numOne.get(key), key);
        }

        System.out.println("MapTwo: ");
        numTwo.forEach((key, value) -> System.out.println("Raktas: " + key + ", Reiksme: " + value));

        System.out.println("KeysOnly: ");
        numTwo.forEach((key, value) -> System.out.println("Raktas: " + key));

    }
}
