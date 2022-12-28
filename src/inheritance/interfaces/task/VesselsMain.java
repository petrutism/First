package inheritance.interfaces.task;

import java.util.ArrayList;
import java.util.List;

public class VesselsMain {
    public static void main(String[] args) {

        Vehicle jeep1 = new Jeep("Jeep1", 4, 5, 100);
        Vehicle jeep2 = new Jeep("Jeep2", 4, 4, 200);
        Vehicle hovercraft1 = new Hovercraft(4, 5, "Hover1", 10, 200);
        Vehicle frigate1 = new Frigate("Frigate1", 1000, 100, 10);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(jeep1);
        vehicles.add(jeep2);
        vehicles.add(hovercraft1);
        vehicles.add(frigate1);
        System.out.println(vehicles);
        Jeep jeep = jeep1 instanceof Vehicle ? (Jeep) jeep1 : null;
        jeep.drive();
    }
}
