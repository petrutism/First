package inheritance;

public class MainMaksima {
    public static void main(String[] args) {
        Asmuo asmuo = new Asmuo("Mindaugas", "Petrutis", "123456");
        Studentas studentas = new Studentas("Petras", "Petraitis", "123654789", "KU-1");
        Darbuotojas darbuotojas = new Darbuotojas("Jonas", "Jonaitis", "741852", "soc123");
        MaksimosDarbuotojas maksimosDarbuotojas = new MaksimosDarbuotojas("Laima", "Laimaite", "96321478", "soc-2", "xNR1");

        System.out.println("Asmuo");
        System.out.println(asmuo);

        System.out.println("Studentas");
        System.out.println(studentas);

        System.out.println("Darbuotojas");
        System.out.println(darbuotojas);

        System.out.println("Maksimos darbuotojas");
        System.out.println(maksimosDarbuotojas);


    }
}
