package collections.Map;

public class Student {
    private final String name;
    private final String surname;
    private final String colledge;

    public Student(String name, String surname, String colledge) {
        this.name = name;
        this.surname = surname;
        this.colledge = colledge;
    }
    @Override
    public String toString() {
        return "Vardas: " + name +
                ", Pavarde: " + surname +
                ", universitetas: " + colledge ;
    }
}

