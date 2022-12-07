package studies;

import java.util.Scanner;

public class FirstWeekendCalc {
    public static void main(String[] args) {

        //pabaigos markeris
        boolean end = false;
        //teisingo pasirinkimo markeris
        boolean ifRight;
        //kintamieji skaiciams
        double a, b;

        //kol nera pabaigos darome stai ka
        while (!end) {
            ifRight = false;
            String choose = fromList();
            //ziurim ka pasirinko
            switch (choose) {
                //pasirinkimas A
                case "A" -> {
                    System.out.println("Pasirinkote suma");
                    a = enterA();
                    b = enterB();
                    System.out.println("a + b = " + calcA(a, b));
                    System.out.println("Rinkis kita veiksma");
                    ifRight = true;
                }
                //pasirinkimas B
                case "B" -> {
                    System.out.println("Pasirinkote skirtuma");
                    a = enterA();
                    b = enterB();
                    System.out.println("a - b = " + calcB(a, b));
                    System.out.println("Rinkis kita veiksma");
                    ifRight = true;
                }
                //pasirinkimas C
                case "C" -> {
                    System.out.println("Pasirinkote dalyba");
                    a = enterA();
                    b = enterB();
                    //jei b nulis
                    while (b == 0) {
                        System.out.print("Dalinti is nulio negalime. ");
                        b = enterB();
                    }
                    System.out.println("a / b = " + calcC(a, b));
                    System.out.println("Rinkis kita veiksma");
                    ifRight = true;
                }
                //pasirinkimas D
                case "D" -> {
                    System.out.println("Pasirinkote daugyba");
                    a = enterA();
                    b = enterB();
                    System.out.println("a * b = " + calcD(a, b));
                    System.out.println("Rinkis kita veiksma");
                    ifRight = true;
                }
                //pasirinkimas E
                case "E" -> {
                    System.out.println("Pasirinkote kelima laipsniu");
                    a = enterA();
                    b = enterB();
                    System.out.println("a ^ b = " + calcE(a, b));
                    System.out.println("Rinkis kita veiksma");
                    ifRight = true;
                }
                //X pabaiga
                case "X" -> {
                    System.out.println("PABAIGA");
                    ifRight = true;
                    end = true;
                }
            }
            //kai neteisingas pasirinkimas
            if (!ifRight) {
                System.out.println("Tokio pasirinkimo nera, rinkis is naujo:");
            }
        }
    }

    //atspausdiname funkciju meniu
    public static String fromList() {
        System.out.println("A -> a + b");
        System.out.println("B -> a - b");
        System.out.println("C -> a / b");
        System.out.println("D -> a * b");
        System.out.println("E -> a ^ b");
        System.out.println("X -> baigti");
        System.out.print("PASIRINKITE: ");
        return readData();
    }

    public static Double calcA(Double a, Double b) {
        return a + b;
    }

    public static Double calcB(Double a, Double b) {
        return a - b;
    }

    public static Double calcC(Double a, Double b) {
        return a / b;
    }

    public static Double calcD(Double a, Double b) {
        return a * b;
    }

    public static Double calcE(Double a, Double b) {
        return Math.pow(a, b);
    }

    //ivedame duomenis
    public static String readData() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().toUpperCase();
    }

    //ar ivestas stringas yra skaitmenys
    public static boolean isNumeric(String line) {
        if (line == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(line);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    //ivedame skaiciu a
    public static double enterA() {
        System.out.print("Iveskite skaiciu a: ");
        String skaiciusA = readData();

        while (!isNumeric(skaiciusA)) {
            System.out.print("Nevedinek nesamoniu, ivesk SKAICIU a: ");
            skaiciusA = readData();
        }
        return Double.parseDouble(skaiciusA);
    }

    //ivedame skaiciu b
    public static double enterB() {
        System.out.print("Iveskite skaiciu b: ");
        String skaiciusB = readData();

        while (!isNumeric(skaiciusB)) {
            System.out.print("Nevedinek nesamoniu, ivesk SKAICIU b: ");
            skaiciusB = readData();
        }
        return Double.parseDouble(skaiciusB);
    }
}
