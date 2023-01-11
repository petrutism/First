package files.basketball;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class BasketballMain {
    public static void main(String[] args) {
        BasketballMain basketballMain = new BasketballMain();
        PlayersFileReader playersFileReader = new PlayersFileReader();
        PointsFileReader pointsFileReader = new PointsFileReader();
        CsvWrite csvWrite = new CsvWrite();

        playersFileReader.readPlayers();
        pointsFileReader.readPoints();

        Map<Integer, Player> players = playersFileReader.getPlayers();
        List<Player> playersList = new ArrayList<>(players.values());
        List<int[]> points = pointsFileReader.getPoints();

        basketballMain.addPoints(players, points);
        basketballMain.addPercentage(players);

        basketballMain.sortByNumberDescending(playersList);

        csvWrite.writeCsvFile(playersList, basketballMain.bestPointer(playersList), basketballMain.bestThreePointer(playersList), basketballMain.bestPercentage(playersList));
    }

    void addPoints(Map<Integer, Player> players, List<int[]> points) {
        Player pl;
        for (int[] p : points) {
            pl = players.get(p[0]);
            if (pl != null) {
                pl.setTotalShots(pl.getTotalShots() + 1);
                switch (p[1]) {
                    case 0 -> pl.setMisses(pl.getMisses() + 1);
                    case 1 -> {
                        pl.setOnePointers(pl.getOnePointers() + 1);
                        pl.setTotalPoints(pl.getTotalPoints() + 1);
                    }
                    case 2 -> {
                        pl.setTwoPointers(pl.getTwoPointers() + 1);
                        pl.setTotalPoints(pl.getTotalPoints() + 2);
                    }
                    case 3 -> {
                        pl.setThreePointers(pl.getThreePointers() + 1);
                        pl.setTotalPoints(pl.getTotalPoints() + 3);
                    }
                }

            }

        }
    }

    void addPercentage(Map<Integer, Player> players) {
        Player pl;
        for (Integer nr : players.keySet()) {
            pl = players.get(nr);
            try {
                pl.setPercentage((double) (pl.getTotalShots() - pl.getMisses()) * 100 / pl.getTotalShots());
            } catch (ArithmeticException a) {
                System.out.println("Player nr:" + nr + " did not shoot...");
            }
        }
    }

    private void sortByNumberDescending(List<Player> playerList) {
        playerList.sort(SORT_BY_NUMBER_DEC);
    }

    private String bestPointer(List<Player> playerList) {
        StringBuilder sb = new StringBuilder();
        int bestPoints = 0;
        Player bestPointer = null;
        for (Player p : playerList) {
            if (p.getTotalPoints() > bestPoints) {
                bestPoints = p.getTotalPoints();
                bestPointer = p;
            }
        }
        if (bestPointer != null) {
            sb.append("Best pointer is: number ")
                    .append(bestPointer.getNumber())
                    .append(" , ").append(bestPointer.getName())
                    .append(" ").append(bestPointer.getSurname());
        }
        return sb.toString();
    }

    private String bestThreePointer(List<Player> playerList) {
        StringBuilder sb = new StringBuilder();
        int bestThreePoints = 0;
        Player bestThreePointer = null;
        for (Player p : playerList) {
            if (p.getThreePointers() > bestThreePoints) {
                bestThreePoints = p.getThreePointers();
                bestThreePointer = p;
            }
        }
        if (bestThreePointer != null) {
            sb.append("Best threePointer is: number ")
                    .append(bestThreePointer.getNumber())
                    .append(" , ").append(bestThreePointer.getName())
                    .append(" ").append(bestThreePointer.getSurname());
        }

        return sb.toString();
    }


    private String bestPercentage(List<Player> playerList) {
        StringBuilder sb = new StringBuilder();
        double bestPercent = 0;
        Player bestPercentage = null;
        for (Player p : playerList) {
            if (p.getPercentage() > bestPercent) {
                bestPercent = p.getPercentage();
                bestPercentage = p;
            }
        }
        if (bestPercentage != null) {
            sb.append("Best percentage is: number ")
                    .append(bestPercentage.getNumber())
                    .append(" , ").append(bestPercentage.getName())
                    .append(" ").append(bestPercentage.getSurname());
        }

        return sb.toString();
    }

    private final Comparator<Player> SORT_BY_NUMBER_DEC = (o1, o2) -> Double.compare(o2.getNumber(), o1.getNumber());
}
