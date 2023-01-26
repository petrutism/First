package files.lightCost;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApartmentMain {
    public static void main(String[] args) {

        int totalCost = 1500;
        int totalPersons;
        int costPerOnePerson;

        int totalSize;
        int costPerOneSizeUnit;
        ApartmentMain apartmentMain = new ApartmentMain();
        ApartmentReader apartmentReader = new ApartmentReader();

        apartmentReader.readApartments();
        System.out.println();

        Map<Integer, Apartment> apartments = apartmentReader.getApartments();

        totalSize = apartmentMain.totalSize(apartments);
        costPerOneSizeUnit = totalCost / totalSize;
        System.out.println("Total size is: " + totalSize);
        System.out.println("Cost per one size unit is: " + costPerOneSizeUnit);
        System.out.println();

        totalPersons = apartmentMain.totalPersons(apartments);
        costPerOnePerson = totalCost / totalPersons;
        System.out.println("Total persons: " + totalPersons);
        System.out.println("Cost per one person is: " + costPerOnePerson);
        System.out.println();

        List<Apartment> apartmentsList = new ArrayList<>(apartments.values());
        apartmentMain.showCost(apartmentsList, costPerOnePerson, costPerOneSizeUnit);

    }

    int totalSize(Map<Integer, Apartment> apartments) {
        Apartment a;
        int size;
        int totalSize = 0;
        for (Integer nr : apartments.keySet()) {
            a = apartments.get(nr);
            size = a.size();
            totalSize += size;
        }
        return totalSize;
    }

    int totalPersons(Map<Integer, Apartment> apartments) {
        Apartment a;
        int persons;
        int totalPersons = 0;
        for (Integer nr : apartments.keySet()) {
            a = apartments.get(nr);
            persons = a.persons();
            totalPersons += persons;
        }
        return totalPersons;
    }

    void showCost(List<Apartment> apartmentsList, int costPerOnePerson, int costPerOneSizeUnit) {
        int biggest = 0;
        Apartment mostExpensive = null;
        for (Apartment a : apartmentsList) {
            if (biggest < costPerOnePerson * a.persons()) {
                mostExpensive = a;
                biggest = costPerOnePerson * a.persons();
            }
            System.out.println(a);
            System.out.println("Total cost for apartment by persons number: " + costPerOnePerson * a.persons());
            System.out.println("Total cost for apartment by size: " + costPerOneSizeUnit * a.size());

            if (costPerOnePerson * a.persons() < costPerOneSizeUnit * a.size()) {
                System.out.println("Better is to pay by persons...");
            } else {
                System.out.println("Better is to pay by size...");
            }
            System.out.println();
        }
        System.out.println("Most expensive apartment is: " + mostExpensive);
        System.out.println("They pay: " + biggest);
    }


}
