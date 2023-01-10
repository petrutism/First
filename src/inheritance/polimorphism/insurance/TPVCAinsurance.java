package inheritance.polimorphism.insurance;

class TPVCAinsurance extends CarInsurance{
    public TPVCAinsurance(String insuredPerson, Double sum, String country, String carnumber) {
        super(insuredPerson, sum, country, carnumber);
    }
}
