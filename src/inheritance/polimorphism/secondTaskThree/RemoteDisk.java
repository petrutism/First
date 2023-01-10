package inheritance.polimorphism.secondTaskThree;

import java.util.ArrayList;

public class RemoteDisk implements Storage{

    ArrayList<Info> infos = new ArrayList<>();

    @Override
    public void saveinfo(Info info) {
        infos.add(info);
        System.out.println("Record saved to remote disk...");
    }

    @Override
    public Info findInfo(Integer id) {
        for (Info info: infos){
            if (id == info.getId()){
                System.out.println("Object by id from remote disk...");
                return info;
            }
        }
        return null;
    }

    @Override
    public Info findInfo(String word) {
        for (Info info : infos){
            if(info.textContains(word)){

                System.out.println("Object by word from remote disk");
                return info;
            }
        }
        System.out.println("Object by word from remote disk");
        return null;
    }
}
