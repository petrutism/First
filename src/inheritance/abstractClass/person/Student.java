package inheritance.abstractClass.person;

public class Student extends Person {

    Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println("Studentas " + super.toString());
    }

}
