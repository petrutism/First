package files.payments;

record Payment(int id, double sum, Integer recipient, Integer sender) {

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", sum=" + sum +
                ", recipient=" + recipient +
                ", sender=" + sender +
                '}';
    }
}
