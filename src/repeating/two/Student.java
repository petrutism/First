package repeating.two;

public class Student extends Person{
    String id;

    public Student() {
    }

    public Student(Date dateOfBirth, String name, String id) {
        super(dateOfBirth, name);
        this.id = id;
    }

    void printID(){
        System.out.println("ID is: " + id);
    }
}
