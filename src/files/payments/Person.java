package files.payments;

class Person {
    private final int id;
    private final String name;
    private final String surname;
    private double receivedMoney;
    private double sentMoney;
    private int sentNumber;
    private int receivedNumber;

    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.receivedMoney = 0d;
        this.sentMoney = 0d;
        this.sentNumber = 0;
        this.receivedNumber = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setReceivedMoney(double receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public void setSentMoney(double sentMoney) {
        this.sentMoney = sentMoney;
    }

    public double getReceivedMoney() {
        return receivedMoney;
    }

    public double getSentMoney() {
        return sentMoney;
    }

    public int getSentNumber() {
        return sentNumber;
    }

    public void setSentNumber(int sentNumber) {
        this.sentNumber = sentNumber;
    }

    public int getReceivedNumber() {
        return receivedNumber;
    }

    public void setReceivedNumber(int receivedNumber) {
        this.receivedNumber = receivedNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", receivedMoney=" + receivedMoney +
                ", sentMoney=" + sentMoney +
                '}';
    }
}
