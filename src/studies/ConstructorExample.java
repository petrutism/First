package studies;

import data.Person;

public class ConstructorExample {

    public ConstructorExample() {
        this(10);
    }

    public ConstructorExample(int a) {
        this("tekstukas");
        System.out.println(a);
    }

    public ConstructorExample(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {

        //tipas kintamojo vardas = kintamojo reiksme --->> SVARBU
        //skliausteliuose pagal paduodama tipa kuriame konstruktoriu
        //ConstructorExample constructorExample = new ConstructorExample();

        Person person = new Person("Mindaugas", 78);
        person.setAge(46);
        person.setName("Mindaugas");

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

}
