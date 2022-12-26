package inheritance;

class Darbuotojas extends Asmuo {
    private final String socDraudimoNr;

    Darbuotojas(String vardas, String pavarde, String ak, String socDraudimoNr) {
        super(vardas, pavarde, ak);
        this.socDraudimoNr = socDraudimoNr;
    }

    String getSocDraudimoNr() {
        return socDraudimoNr;
    }

    @Override
    public String toString (){
        return String.format("socDraudimoNr: %s %s", socDraudimoNr, super.toString());
    }
}
