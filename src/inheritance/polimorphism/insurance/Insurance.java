package inheritance.polimorphism.insurance;

class Insurance {
    private final String insuredPerson;
    private final Double sum;

    private final String country;

    public Insurance(String insuredPerson, Double sum, String country) {
        this.insuredPerson = insuredPerson;
        this.sum = sum;
        this.country = country;
    }

    public String getInsuredPerson() {
        return insuredPerson;
    }

    public Double getSum() {
        return sum;
    }

    public String getCountry() {
        return country;
    }
}
