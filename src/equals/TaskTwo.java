package equals;

public class TaskTwo {
    public static void main(String[] args) {
        String tankas = new String("Tankas");
        String tankas1 = new String("Tankas1");
        System.out.println(tankas);
        System.out.println(System.identityHashCode(tankas));
        System.out.println(tankas1);
        System.out.println(System.identityHashCode(tankas1));
        System.out.println("--------------");
        String temp = tankas;
        tankas = tankas1;
        tankas1 = temp;
        System.out.println(tankas);
        System.out.println(System.identityHashCode(tankas));
        System.out.println(tankas1);
        System.out.println(System.identityHashCode(tankas1));
    }
}
