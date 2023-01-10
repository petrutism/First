package repeating.two;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2000, 2, 30);
        Student student = new Student(date, "Jonas", "10");
        System.out.println(student);

        date.set(2001, 1, 1);
        student.setDateOfBirth(date);


        System.out.println(student);
        student.printID();
    }
}
