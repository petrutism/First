package files.newPC;

import java.util.ArrayList;
import java.util.List;

public class NewPCMain {
    public static void main(String[] args) {
        NewPCMain newPCMain = new NewPCMain();
        ReadPayments readPayments = new ReadPayments();

        readPayments.readPayments();

        System.out.println("New PC cost is: " + readPayments.getNewPCCost());
        System.out.println("Total sum is: " + readPayments.getTotalSum());
        System.out.println("Biggest payment is: " + readPayments.getBiggestPayment());
        System.out.println("Smallest payment is: " + readPayments.getSmallestPayment());

        List<Record> recordsList = new ArrayList<>(readPayments.getPaymentsMap().values());
        newPCMain.printBiggestMonth(recordsList);
        newPCMain.printMonthPayments(recordsList);

    }

    void printBiggestMonth(List<Record> recordsList) {
        double biggest = Double.MIN_VALUE;
        Record biggestMonth = null;
        for (Record r : recordsList) {
            if (r.getTotalSum() > biggest) {
                biggest = r.getTotalSum();
                biggestMonth = r;
            }
        }
        System.out.println("Biggest month sum is month number: " + biggestMonth.getNumberOfPayments() + ", total month sum: " + biggestMonth.getTotalSum());
    }
    void printMonthPayments(List<Record> recordsList){
        System.out.println("Payment numbers by month number:");
        for (Record r : recordsList) {
            System.out.println("Month number: " + r.getMonthNumber() + ", number of payments: " + r.getNumberOfPayments());
        }
    }
}
