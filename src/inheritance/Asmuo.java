package inheritance;

class Asmuo {
    private final String vardas;
    private final String pavarde;
    private final String ak;

    Asmuo(String vardas, String pavarde, String ak) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.ak = ak;
    }

    String getVardas() {
        return vardas;
    }

    String getPavarde() {
        return pavarde;
    }

    String getAk() {
        return ak;
    }

    public String toString() {
        return String.format("Vardas: %s Pavarde: %s, AK: %s", vardas, pavarde, ak);
    }
}
