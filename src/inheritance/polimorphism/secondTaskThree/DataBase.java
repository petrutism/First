package inheritance.polimorphism.secondTaskThree;

import java.util.HashMap;
import java.util.Map;

class DataBase implements Storage {

    HashMap<Integer, Info> infos = new HashMap<>();

    @Override
    public void saveinfo(Info info) {
        infos.put(info.getId(), info);
        System.out.println("Record saved to database...");
    }

    @Override
    public Info findInfo(Integer id) {
        System.out.println("Object by id from database...");
        return infos.get(id);
    }

    @Override
    public Info findInfo(String word) {
       for (Map.Entry<Integer, Info> set : infos.entrySet()){
           if(set.getValue().textContains(word)){
               System.out.println("Object by word from database...");
               return infos.get(set.getKey());
           }
       }
        System.out.println("Object by word from database is empty...");
        return null;
    }
}
