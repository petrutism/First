package inheritance.abstractClass.person;

public class Teacher extends Person {
    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println("Teacher " + super.toString());
    }


}
