package inheritance;

class MaksimosDarbuotojas extends Darbuotojas{
    private String xNr;

    MaksimosDarbuotojas(String vardas, String pavarde, String ak, String socDraudimoNr, String xNr) {
        super(vardas, pavarde, ak, socDraudimoNr);
        this.xNr = xNr;
    }

    String getxNr() {
        return xNr;
    }
    public String toString (){
        return String.format("xNr: %s %s", xNr, super.toString());
    }
}
