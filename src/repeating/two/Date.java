package repeating.two;


import java.time.DateTimeException;
import java.time.LocalDate;

public class Date {
    int year;
    int month;
    int day;

    public Date() {
    }

    public Date(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
            this.year = year;
            this.month = month;
            this.day = day;

        } catch (DateTimeException e) {
            System.out.println("Date is invalid... Student birth date ois set to invalid...");
            this.year = 0;
            this.month = 1;
            this.day = 1;
        }
    }

    void set(int year, int month, int day) {

        try {
            LocalDate.of(year, month, day);
            this.year = year;
            this.month = month;
            this.day = day;

        } catch (DateTimeException e) {
            System.out.println("Date is invalid... Student birth date ois set to invalid...");
        }
    }

    public void print() {
        try {
            System.out.println(LocalDate.of(year, month, day));
        } catch (DateTimeException e) {
            System.out.println("Date is invalid...");
        }
    }

    @Override
    public String toString() {
        return LocalDate.of(year, month, day).toString();
    }
}
