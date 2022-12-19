package collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        MapExample mapExample = new MapExample();
        mapExample.hashMapExample();
        mapExample.linkedHashMapExample();

    }
    private void hashMapExample(){
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Namas");
        names.put(2, "Petras");
        names.put(4, "Namas");
        names.put(1, "Jokubas"); //atnaujina reiksme pagal key

        for(Integer key: names.keySet()){
            System.out.println(key + " - " + names.get(key));
        }

        System.out.println("---------------------");
        for(Map.Entry<Integer, String> entry: names.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


        System.out.println("---------------------");
        names.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    private void linkedHashMapExample(){
        Map<String, Double> prices = new LinkedHashMap<>();
        prices.put("Jogurtas", 4.5);
        prices.put("Duona", 2.5);
        prices.put("Pienas", 1.5);
        prices.put("Mandarinai", 0.99);
        prices.put("Karve", 2000d);
        prices.put("Dogas", 45d);
        prices.put("Jogurtas", 2d);

        prices.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
