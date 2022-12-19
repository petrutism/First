package equals;

public class TaskOne {
    String aa;
    String bb;

    public static void main(String[] args) {
        String a = "Zodis";
        String b = "Zodis";
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------");

        String aa = new String("Zodis");
        String bb = new String("Zodis");

        aa = bb;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(aa.equals(bb));
        System.out.println(aa == bb);

    }

}
