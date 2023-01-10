package repeating.two;

public class Person {
    Date dateOfBirth;
    String name;

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(Date dateOfBirth, String name) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dateOfBirth=" + dateOfBirth +
                ", name='" + name + '\'' +
                '}';
    }
}
