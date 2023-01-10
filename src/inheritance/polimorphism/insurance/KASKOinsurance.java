package inheritance.polimorphism.insurance;

class KASKOinsurance extends CarInsurance{

    private final Double franchise;

    public KASKOinsurance(String insuredPerson, Double sum, String country, String carnumber, Double franchise) {
        super(insuredPerson, sum, country, carnumber);
        this.franchise = franchise;
    }

    public Double getFranchise() {
        return franchise;
    }
}
