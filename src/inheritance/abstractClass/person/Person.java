package inheritance.abstractClass.person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class Person  {
    String name;
    String surname;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }



    @Override
    public String toString() {
        return "vardas ='" + name + '\'' +
                ", pavarde ='" + surname + '\'';
    }

    public abstract void printInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public boolean unicals(List<Person> persons) {
        List<Person> unicals = new ArrayList<>();

        for (Person p : persons) {
            if (!unicals.contains(p)) {
                unicals.add(p);
            } else return false;
        }
        return true;
    }
}
