package inheritance.polimorphism.insurance;

class CarInsurance extends Insurance{
    private final String carnumber;

    public CarInsurance(String insuredPerson, Double sum, String country, String carnumber) {
        super(insuredPerson, sum, country);
        this.carnumber = carnumber;
    }

    public String getCarnumber() {
        return carnumber;
    }
}
