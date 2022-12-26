package inheritance;



public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Mindaugas", "Petrutis", "D-1", "KU");
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getUniversity());
        System.out.println(student);

        Person person = new Person("Petras", "Petraitis");
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person);

        Person secondStudent = new Student("Jonas", "Jonaitis", "D-2", "KTU" );
        System.out.println(secondStudent.getName());
        System.out.println(secondStudent.getSurname());
        System.out.println(secondStudent);


        if(secondStudent instanceof Student st){
            System.out.println(st.getId());
            System.out.println(st.getUniversity());
        }
    }




}
