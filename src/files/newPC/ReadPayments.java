package files.newPC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ReadPayments {
    private static final String SPACE_DELIMITER = " ";

    private int newPCCost;
    private double totalSum = 0;
    private double biggestPayment = Double.MIN_VALUE;
    private double smallestPayment = Double.MAX_VALUE;
    private final Map<Integer, Record> paymentsMap = new HashMap<>();

    public int getNewPCCost() {
        return newPCCost;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public double getBiggestPayment() {
        return biggestPayment;
    }

    public double getSmallestPayment() {
        return smallestPayment;
    }

    Map<Integer, Record> getPaymentsMap() {
        return paymentsMap;
    }

    void readPayments() {
        String line;
        int number = 0;
        double totalMonthSum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("newPC.txt"))) {
            while ((line = br.readLine()) != null) {
                String[] ids = line.split(SPACE_DELIMITER);

                if (ids.length > 1) {
                    List<Double> paymentsList = new ArrayList<>();
                    number++;

                    for (String id : ids) {

                        if (biggestPayment <= Double.parseDouble(id)) {
                            biggestPayment = Double.parseDouble(id);
                        }
                        if (smallestPayment >= Double.parseDouble(id)) {
                            smallestPayment = Double.parseDouble(id);
                        }
                        totalSum = totalSum + Double.parseDouble(id);

                        totalMonthSum = totalMonthSum + Double.parseDouble(id);
                        paymentsList.add(Double.parseDouble(id));
                    }
                    Record rec = new Record(number, ids.length, totalMonthSum, paymentsList);
                    paymentsMap.put(number, rec);

                    totalMonthSum = 0;

                } else if (ids.length == 1) {
                    newPCCost = Integer.parseInt(ids[0]);
                }
            }
        } catch (IOException e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }
        System.out.println("Payments successfully read...");
    }
}
