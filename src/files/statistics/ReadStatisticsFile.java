package files.statistics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ReadStatisticsFile {
    private static final String SPACE_DELIMITER = " ";
    private final List<Statistics> males = new ArrayList<>();
    private final List<Statistics> females = new ArrayList<>();
    private final List<Statistics> workers = new ArrayList<>();

    public List<Statistics> getMales() {
        return males;
    }

    public List<Statistics> getFemales() {
        return females;
    }

    public List<Statistics> getWorkers() {
        return workers;
    }

    void readFile() {

        String line;

        try (BufferedReader br = new BufferedReader(new FileReader("statistics1.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] splits = line.split(SPACE_DELIMITER);
                if (splits.length < 5) {
                    continue;
                }
                Statistics record = new Statistics(splits[0] + " " + splits[1],
                        splits[2], splits[3], Integer.parseInt(splits[4].substring(0,
                        splits[4].length() - 2)), splits[5]);

                if (splits[2].equals("vyr.")) {
                    males.add(record);
                } else if (splits[2].equals("mot.")) {
                    females.add(record);
                }
                workers.add(record);
            }
        } catch (IOException e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }
        System.out.println("File successfully read...");
    }
}
