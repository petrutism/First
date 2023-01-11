package files.basketball;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWrite {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "nr, name surname, onePointers, twoPointers, threePointers, totalPoints, misses, percentage";

    void writeCsvFile(List<Player> list, String bestPointer, String bestThreePointer, String bestPercentage) {
        StringBuilder nameSurname = new StringBuilder();
        try (FileWriter fileWriter = new FileWriter("statistics.txt")) {
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Player p : list) {
                nameSurname.append(p.getName()).append(" ").append(p.getSurname());
                fileWriter.append(String.valueOf(p.getNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(nameSurname);
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getOnePointers()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getTwoPointers()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getThreePointers()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getTotalPoints()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getMisses()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(p.getPercentage()));
                fileWriter.append(NEW_LINE_SEPARATOR);
                nameSurname.setLength(0);
            }
            fileWriter.append(NEW_LINE_SEPARATOR);
            fileWriter.append(bestPointer);
            fileWriter.append(NEW_LINE_SEPARATOR);
            fileWriter.append(bestThreePointer);
            fileWriter.append(NEW_LINE_SEPARATOR);
            fileWriter.append(bestPercentage);

            System.out.println("CSV file " + "statistics.txt" + " created successfully...");
        } catch (IOException e) {
            System.out.println("Cannot write file..." + e.getMessage());
        }

    }
}
