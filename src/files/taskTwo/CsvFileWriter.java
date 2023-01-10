package files.taskTwo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CsvFileWriter {

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "name,car,number,mileage";

    void writeCsvFile(String fileName) {

        Driver driver1 = new Driver("Petras", "Volvo", "ABC123", "190000");
        Driver driver2 = new Driver("John", "Audi", "ABC321", "25000");
        Driver driver3 = new Driver("Lydeka", "BMW", "ABC444", "90000");
        Driver driver4 = new Driver("Mindaugas", "Volga", "ABB111", "10000");

        List<Driver> drivers = new ArrayList<>();

        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        drivers.add(driver4);

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Driver d : drivers) {
                fileWriter.append(d.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(d.getCar());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(d.getNumber());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(d.getMileage());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file created successfully...");
        } catch (IOException e) {
            System.out.println("Cannot write file..." + e.getMessage());
        }
    }
}
