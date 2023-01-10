package files.taskTwo;

public class TaskTwoMain {
    public static void main(String[] args) {
        String filename = "drivers.csv";

        CsvFileWriter csvFileWriter = new CsvFileWriter();
        csvFileWriter.writeCsvFile(filename);

        CsvFileReader csvFileReader = new CsvFileReader();
        csvFileReader.readCsvFile(filename);
    }
}
