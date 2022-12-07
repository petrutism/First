package studies;

public class MethodsQuest {
    public static void main(String[] args) {
        m1();
        print ("Mindaugas", "Petrutis", "Java", 7);
        print ("Mindaugas", "Petrutis", "Java");
    }

    public static void m1() {
        System.out.println("Pirmas metodas");
        m2();
    }

    public static void m2() {
        System.out.println("Antras metodas");
        m3();
    }

    public static void m3() {
        System.out.println("Trecias metodas");
    }
    public static void print(String name, String surname, String language, int weeksNumber){
        System.out.printf("As %s %s, tikrai ismoksiu programuoti %s kalba per %s savaites%n", name, surname, language, weeksNumber);
    }
    public static void print(String name, String surname, String language){
        System.out.printf("As %s %s, tikrai ismoksiu programuoti %s kalba", name, surname, language);
    }
}
