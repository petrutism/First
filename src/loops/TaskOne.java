package loops;

/*Jonukas mokykloje gavo užduotį patikrinti ar duoti terminai yra polindromai. Jam sunku
pačiam tai padaryti todėl jis prašo Jūsų pagalbos. Parašykite metodą kuris patikrintų ar duotas
žodis yra polindromas (žodis ar sakinys kurį skaitant nuo galo gaunamas tas pats žodis ar
sakinys, pvz. “KOL EINU ŠUNIE LOK”, “ARGI TEN NE TIGRA” , “SĖDĖK UŽU KĖDĖS”).
Užuomina: pašalinti tarpus ir tuomet keliauti per pusę žodžio iš abiejų pusių tikrinant ar sutampa
raidės.*/

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        //source phrase
        System.out.println("Iveskite fraze, kuria tikrinsime, ar tai palindromas: ");
        Scanner scanner = new Scanner(System.in);
        //taskOne.isPalindrome(scanner.nextLine());

        if (taskOne.isPalindrome(scanner.nextLine())) {
            System.out.println("Ivesta fraze yra palindromas");
        } else {
            System.out.println("Ivesta fraze nera palindromas");
        }
    }

    private boolean isPalindrome(String string) {
        string = string.replaceAll(" ", "").toUpperCase();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
