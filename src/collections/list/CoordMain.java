package collections.list;

import java.util.ArrayList;
import java.util.List;

public class CoordMain {
    public static void main(String[] args) {
        CoordMain cm = new CoordMain();
        List<Koordinate> coords = new ArrayList<>();
        Koordinate kord = new Koordinate(0, 0);

        coords.add(new Koordinate(1, 5));
        coords.add(new Koordinate(5, 9));
        coords.add(new Koordinate(4, 0));
        coords.add(kord);
        coords.add(new Koordinate(9, 1));

        cm.printCoords(coords);

        cm.extracted(coords);
        System.out.println("After element change:");
        cm.printCoords(coords);

        cm.changeCoord(coords, kord);
    }

    private void extracted(List<Koordinate> coords) {
        for (Koordinate ko : coords) {
            if (ko.getX() == 0 && ko.getY() == 0) {
                System.out.println("0, 0 is coord number " + (coords.indexOf(ko) + 1) + " in the list.");
                ko.setX(1);
                ko.setY(1);
                //coords.set(coords.indexOf(ko), new Koordinate(1, 1));
                break;
            }
        }
    }

    private void printCoords(List<Koordinate> coords) {
        for (Koordinate ko : coords) {
            System.out.println(ko);
        }
    }

    private void changeCoord (List<Koordinate> coords, Koordinate kord) {
        System.out.println(coords.indexOf(kord));
    }

}
