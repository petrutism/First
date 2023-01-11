package files.payments;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class CsvWrite {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "id,name,surname,received,sent";

    void writeCsvFile(String fileName, List<Person> list) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Person p : list) {
                fileWriter.append(String.valueOf(p.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(p.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(p.getSurname());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getReceivedMoney()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getSentMoney()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file "+ fileName + " created successfully...");
        } catch (IOException e) {
            System.out.println("Cannot write file..." + e.getMessage());
        }

    }
}
