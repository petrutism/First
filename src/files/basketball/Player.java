package files.basketball;

class Player {
    private final int number;
    private final String name;
    private final String surname;
    private int onePointers;
    private int twoPointers;
    private int threePointers;
    private int totalPoints;
    private int misses;
    private int totalShots;
    private double percentage;

    public Player(int number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.onePointers = 0;
        this.twoPointers = 0;
        this.threePointers = 0;
        this.totalPoints = 0;
        this.misses = 0;
        this.totalShots = 0;
        this.percentage = 0;
    }

    public void setOnePointers(int onePointers) {
        this.onePointers = onePointers;
    }

    public void setTwoPointers(int twoPointers) {
        this.twoPointers = twoPointers;
    }

    public void setThreePointers(int threePointers) {
        this.threePointers = threePointers;
    }

    public void setMisses(int misses) {
        this.misses = misses;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getOnePointers() {
        return onePointers;
    }

    public int getTwoPointers() {
        return twoPointers;
    }

    public int getThreePointers() {
        return threePointers;
    }

    public int getMisses() {
        return misses;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getTotalShots() {
        return totalShots;
    }

    public void setTotalShots(int totalShots) {
        this.totalShots = totalShots;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", onePointers=" + onePointers +
                ", twoPointers=" + twoPointers +
                ", threePointers=" + threePointers +
                ", totalPoints=" + totalPoints +
                ", misses=" + misses +
                ", totalShots=" + totalShots +
                ", percentage=" + percentage +
                '}';
    }
}
