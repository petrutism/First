package inheritance;

class Studentas extends Asmuo {
    private final String studentoPazymejimoID;

    Studentas(String vardas, String pavarde, String ak, String studentoPazymejimoID) {
        super(vardas, pavarde, ak);
        this.studentoPazymejimoID = studentoPazymejimoID;
    }

    String getStudentoPazymejimoID() {
        return studentoPazymejimoID;
    }
    @Override
    public String toString (){
        return String.format("pazymejimo id: %s %s", studentoPazymejimoID, super.toString());
    }
}
