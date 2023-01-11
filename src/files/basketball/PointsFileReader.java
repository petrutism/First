package files.basketball;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PointsFileReader {
    private static final String SPACE_DELIMITER = " ";
    private static final int PLAYER_NUMBER_IDX = 0;
    private static final int POINTS_IDX = 1;

    private final List<int[]> points = new ArrayList<>();

    public List<int[]> getPoints() {
        return points;
    }

    void readPoints() {
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader("points.txt"))) {
            while ((line = br.readLine()) != null) {

                String[] ids = line.split(SPACE_DELIMITER);
                if (ids.length < 2) {
                    continue;
                }
                int[] p = new int[2];
                p[0] = Integer.parseInt(ids[PLAYER_NUMBER_IDX]);
                p[1] = Integer.parseInt(ids[POINTS_IDX]);

                points.add(p);
            }
        } catch (IOException e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }
        System.out.println("Points successfully read...");
    }
}
