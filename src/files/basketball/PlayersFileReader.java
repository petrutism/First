package files.basketball;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class PlayersFileReader {
    private static final String SPACE_DELIMITER = " ";
    private static final int PLAYER_NUMBER_IDX = 0;
    private static final int PLAYER_NAME_IDX = 1;
    private static final int PLAYER_SURNAME_IDX = 2;
    private final Map<Integer, Player> players = new HashMap<>();

    public Map<Integer, Player> getPlayers() {
        return players;
    }

    void readPlayers() {
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader("players.txt"))) {
            while ((line = br.readLine()) != null) {

                String[] ids = line.split(SPACE_DELIMITER);

                if (ids.length < 3) {
                    continue;
                }
                players.put(Integer.parseInt(ids[PLAYER_NUMBER_IDX]), new Player(Integer.parseInt(ids[PLAYER_NUMBER_IDX]), ids[PLAYER_NAME_IDX], ids[PLAYER_SURNAME_IDX]));
            }
        } catch (IOException e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }
        System.out.println("Players successfully read...");
    }
}
