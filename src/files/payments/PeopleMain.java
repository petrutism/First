package files.payments;

import java.util.*;

public class PeopleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PeopleMain peopleMain = new PeopleMain();

        PeopleFileReader peopleFileReader = new PeopleFileReader();
        PaymentsFileReader paymentsFileReader = new PaymentsFileReader();

        peopleFileReader.readPeople();
        paymentsFileReader.readPayments();

        Map<Integer, Person> persons = peopleFileReader.getPersons();
        Map<Integer, Payment> payments = paymentsFileReader.getPayments();

        List<Person> personsList = new ArrayList<>(persons.values());
        List<Payment> paymentsList = new ArrayList<>(payments.values());

        peopleMain.addSums(persons, payments);

        CsvWrite csvWrite = new CsvWrite();
        csvWrite.writeCsvFile("file1.csv", peopleMain.sortByReceivedDescending(personsList));
        csvWrite.writeCsvFile("file2.csv", peopleMain.sortBySentAscending(personsList));

        peopleMain.selectAction(sc, personsList, paymentsList, persons);
    }

    void selectAction(Scanner sc, List<Person> personsList, List<Payment> paymentsList, Map<Integer, Person> persons) {

        String action;
        while (true) {
            menu();
            action = sc.nextLine();
            switch (action) {
                case "1" -> showBiggestSender(personsList);
                case "2" -> showBiggestReceiver(personsList);
                case "3" -> showBiggestTransaction(persons, paymentsList);
                case "4" -> showSmallestTransaction(persons, paymentsList);
                case "0" -> {
                    System.out.println("Finishing...");
                    return;
                }
                default -> System.out.println("There is no such action");
            }
        }
    }

    void showBiggestSender(List<Person> personsList) {
        int b = 0;
        Person biggest = null;

        for (Person p : personsList) {
            if (p.getSentNumber() > b) {
                b = p.getSentNumber();
                biggest = p;
            }
        }
        if (biggest != null) {
            System.out.println(biggest);
            System.out.println("This person did " + biggest.getSentNumber() + " transactions...");
        }
    }

    void showBiggestReceiver(List<Person> personsList) {
        int b = 0;
        Person biggest = null;

        for (Person p : personsList) {
            if (p.getReceivedNumber() > b) {
                b = p.getReceivedNumber();
                biggest = p;
            }
        }
        if (biggest != null) {
            System.out.println(biggest);
            System.out.println("This person receives " + biggest.getReceivedNumber() + " transactions...");
        }
    }

    void showBiggestTransaction(Map<Integer, Person> persons, List<Payment> paymentList) {

        Payment biggest = null;
        double b = paymentList.get(0).sum();
        for (Payment p : paymentList) {

            if (p.sum() > b) {
                b = p.sum();
                biggest = p;
            }
        }
        if(biggest != null){
        System.out.println("Biggest transaction is: " + biggest.sum());
        System.out.println("Sender is: " + persons.get(biggest.sender()));
        System.out.println("Receiver is: " + persons.get(biggest.recipient()));}
    }

    void showSmallestTransaction(Map<Integer, Person> persons, List<Payment> paymentList) {

        Payment smallest = null;
        double s = paymentList.get(0).sum();
        for (Payment p : paymentList) {

            if (p.sum() < s) {
                s = p.sum();
                smallest = p;
            }
        }
        if (smallest != null) {
            System.out.println("Smallest transaction is: " + smallest.sum());
            System.out.println("Sender is: " + persons.get(smallest.sender()));
            System.out.println("Receiver is: " + persons.get(smallest.recipient()));
        }
    }

    void menu() {
        String info = """
                             
                1 - show user who makes most transactions
                2 - show user who receives most transactions
                3 - show biggest transaction: who sent, how many and who receives
                4 - show smallest transaction: who sent, how many and who receives
                0 - END
                """;
        System.out.println(info);
    }

    void addSums(Map<Integer, Person> persons, Map<Integer, Payment> payments) {
        Person recipient;
        Person sender;
        double sum;
        double rSum;
        double sSum;
        Integer recipientKey;
        Integer senderKey;

        for (Integer key : payments.keySet()) {
            recipientKey = payments.get(key).recipient();
            recipient = persons.get(recipientKey);

            senderKey = payments.get(key).sender();
            sender = persons.get(senderKey);

            sum = payments.get(key).sum();

            rSum = recipient.getReceivedMoney();
            sSum = sender.getSentMoney();

            recipient.setReceivedMoney(rSum + sum);
            recipient.setReceivedNumber(recipient.getReceivedNumber() + 1);

            sender.setSentMoney(sSum + sum);
            sender.setSentNumber(sender.getSentNumber() + 1);
        }

    }

    private List<Person> sortByReceivedDescending(List<Person> persons) {
        persons.sort(SORT_BY_RECEIVED_MONEY_DEC);
        return persons;
    }

    private List<Person> sortBySentAscending(List<Person> persons) {
        persons.sort(SORT_BY_SENT_MONEY_ASC);
        return persons;
    }

    private final Comparator<Person> SORT_BY_RECEIVED_MONEY_DEC = (o1, o2) -> Double.compare(o2.getReceivedMoney(), o1.getReceivedMoney());
    private final Comparator<Person> SORT_BY_SENT_MONEY_ASC = Comparator.comparingDouble(Person::getSentMoney);

}
