package inheritance.asmuo;

public class PersonMain {
    public static void main(String[] args) {
        Person mindaugas = new Person("Mindaugas", "Petrutis");
        Person jonas = new Person ("Jonas", "Meskauskis");

        System.out.println(mindaugas);
        System.out.println(jonas);
    }
}
