package studies;

public class LeapOrCommonYear {
    public static void main(String[] args) {
        int year = 2022;
        String leap;
        if (year % 4 != 0) {
            leap = "common";
        } else if (year % 100 != 0) {
            leap = "leap";
        } else if (year % 400 != 0) {
            leap = "common";
        } else {
            leap = "leap";
        }
        System.out.printf("Year %s is a %s year %n", year, leap);
    }
}
