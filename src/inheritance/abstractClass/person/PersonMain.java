package inheritance.abstractClass.person;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {


        List<Person> persons = new ArrayList<>();
        Person student = new Student("Mindaugas", "Petrutis");
        Person teacher = new Teacher("Andrius", "Baltrunas");
        Person student1 = new Student("Mindaugas", "Petrutis");
        Person teacher1 = new Teacher("Faina", "Pepsikola");

        persons.add(student);
        persons.add(teacher);
        persons.add(student1);
        persons.add(teacher1);

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.unicals(persons));
    }


}
