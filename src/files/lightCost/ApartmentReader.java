package files.lightCost;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class ApartmentReader {
    private static final String SPACE_DELIMITER = " ";
    private static final int APARTMENT_NUMBER_IDX = 0;
    private static final int APARTMENT_SIZE_IDX = 1;
    private static final int APARTMENT_PERSONS_IDX = 2;
    private final Map<Integer, Apartment> apartments = new HashMap<>();

    public Map<Integer, Apartment> getApartments() {
        return apartments;
    }

    void readApartments(){
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("light.txt"))) {
        while ((line = br.readLine()) != null) {

            String[] ids = line.split(SPACE_DELIMITER);

            if (ids.length < 3) {
                continue;
            }
            apartments.put(Integer.parseInt(ids[APARTMENT_NUMBER_IDX]), new Apartment(Integer.parseInt(ids[APARTMENT_NUMBER_IDX]), Integer.parseInt(ids[APARTMENT_SIZE_IDX]), Integer.parseInt(ids[APARTMENT_PERSONS_IDX])));
        }
    } catch (IOException e) {
        System.out.println("Cannot read file..." + e.getMessage());
    }
    System.out.println("Apartments successfully read...");
}
}
