package studies;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerExample scannerExample = new ScannerExample();

//        System.out.println("1 uzduotis");
//        System.out.print("Iveskite skaiciu: ");
//        int a = scanner.nextInt();
//        System.out.println("jus ivedete skaiciu " + a);
//        System.out.println("2 uzduotis");
//        System.out.print("Iveskite skaiciu a: ");
//        int a = scanner.nextInt();
//        System.out.print("Iveskite skaiciu b: ");
//        int b = scanner.nextInt();
//        ScannerExample scannerExample = new ScannerExample();
//        int sum = scannerExample.sum(a, b);
//        System.out.println("s = " + sum);
//        System.out.println("3 uzduotis");
//        System.out.print("Iveskite skaiciu a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Iveskite skaiciu b: ");
//        double b = scanner.nextDouble();
//        double average = scannerExample.average(a, b);
//        System.out.println("a ir b vidurkis = " + average);

//        System.out.println("4 uzduotis");
//        System.out.print("Iveskite skaiciu a: ");
//        int a = scanner.nextInt();
//        System.out.print("Iveskite skaiciu b: ");
//        int b = scanner.nextInt();
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println("Sukeistos reiksmes a = "+ a +" ir b = " + b);
//---------------4-----------------
////        System.out.println("Ïveskite Y");
//        int b = scanner.nextInt();
//        ScannerExample scannerExample = new ScannerExample();
//        int result = scannerExample.multiply(a, b);
//        System.out.println("X * Y = " + result);
        String cow = scannerExample.house("Namas");
        scannerExample.twoA(cow);

    }

    //metodas sumai
    private int sum(int x, int y) {
        return x + y;
    }

    //metodas vidurkiui
    private double average(double x, double y) {
        return (x + y) / 2;
    }

    //metodas keturzenkliam
    private void fourdigits(int a) {
        String b = String.valueOf(a);
        int c = 0;
        while (c < 4) {
            System.out.println(b.charAt(c));
            c++;
        }
        //metodas namas
    }

    private String house(String house) {
        String houses = house.replace('s', 'i');
        System.out.println(houses);
        System.out.println(houses.toUpperCase());
        System.out.println(houses.substring(2, 4).toUpperCase());
        System.out.println(houses.substring(2, 4).toUpperCase() + houses.substring(2, 4).toLowerCase());
        System.out.println(houses.substring(2, 4).toUpperCase() + houses.substring(2, 4).toLowerCase().replace('m', 'n'));
        return houses.substring(2, 4).toUpperCase() + houses.substring(2, 4).toLowerCase().replace('m', 'n');
            }

    private void twoA(String a) {
        int c = 0;
        int d = 0;
        String west = a.toUpperCase();
        while (c < 4) {
            String b = String.valueOf(west.charAt(c));

            if (b.equals("A")) {
                d++;
            }
            c++;
        }
        System.out.println(d);
    }
}
