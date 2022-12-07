package data;

public class Person {
    //private final String name: negalesime ateityje pakeisti reiksmes
    private String name;
    private int age;

    //kai skliausteliai ne tusti, negalesime sukurti tuscio objekto
    //nebereikia seteriu
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
