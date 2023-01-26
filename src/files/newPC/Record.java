package files.newPC;

import java.util.List;

class Record {
private final int monthNumber;
private final int numberOfPayments;
private final double totalSum;
private final List<Double> payments;

    public Record(int monthNumber, int numberOfPayments, double totalSum, List<Double> payments) {
        this.monthNumber = monthNumber;
        this.numberOfPayments = numberOfPayments;
        this.totalSum = totalSum;
        this.payments = payments;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getNumberOfPayments() {
        return numberOfPayments;
    }

    @Override
    public String toString() {
        return "Record{" +
                "monthNumber=" + monthNumber +
                ", numberOfPayments=" + numberOfPayments +
                ", totalSum=" + totalSum +
                ", payments=" + payments +
                '}';
    }
}
