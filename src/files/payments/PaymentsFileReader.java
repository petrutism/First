package files.payments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PaymentsFileReader {
    private static final String COMMA_DELIMITER = ",";

    private static final int PAYMENT_ID_IDX = 0;
    private static final int PAYMENT_SUM_IDX = 1;
    private static final int PAYMENT_RECIPIENT_ID_IDX = 2;
    private static final int PAYMENT_SENDER_ID_IDX = 3;

    Map<Integer, Payment> payments = new HashMap<>();

    Map<Integer, Payment> getPayments() {
        return payments;
    }

    void readPayments() {
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader("payment.txt"))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] ids = line.split(COMMA_DELIMITER);
                if (ids.length > 0) {
                    Payment payment = new Payment(Integer.parseInt(ids[PAYMENT_ID_IDX].trim()), Double.parseDouble(ids[PAYMENT_SUM_IDX].trim()), Integer.parseInt(ids[PAYMENT_RECIPIENT_ID_IDX].trim()), Integer.parseInt(ids[PAYMENT_SENDER_ID_IDX].trim()));
                    payments.put(Integer.parseInt(ids[PAYMENT_ID_IDX].trim()), payment);
                }
            }
        } catch (IOException e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }
    }
}
