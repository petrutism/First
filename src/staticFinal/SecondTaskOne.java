package staticFinal;

import java.sql.SQLOutput;

public class SecondTaskOne {
    private final int studentID;
    private String name = "mama";
    private final int age;

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void printInfo() {
        System.out.println(getStudentID());
        System.out.println(getName());
        System.out.println(getAge());
    }
}
