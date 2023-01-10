package files.taskTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CsvFileReader {
    private static final String COMMA_DELIMITER = ",";

    private static final int DRIVERS_NAME_ID = 0;
    private static final int DRIVERS_CAR_ID = 1;
    private static final int DRIVERS_NUMBER_ID = 2;
    private static final int DRIVERS_MILEAGE_ID = 3;

    void readCsvFile(String filename) {
        List<Driver> drivers = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] ids = line.split(COMMA_DELIMITER);
                if(ids.length > 0 ){
                    Driver driver = new Driver(ids[DRIVERS_NAME_ID], ids[DRIVERS_CAR_ID], ids[DRIVERS_NUMBER_ID], ids[DRIVERS_MILEAGE_ID]);
                    drivers.add(driver);
                }
            }
            for (Driver d : drivers){
                System.out.println(d);
            }
        } catch (IOException e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }

    }

}
