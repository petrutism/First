package repeating.one;

import java.util.Scanner;

public class StringMix {
    public static void main(String[] args) {
        StringMix stringMix = new StringMix();
        Scanner sc = new Scanner(System.in);

        System.out.print("Iveskite pirma zodi: ");
        String w1 = sc.nextLine();
        System.out.print("Iveskite antra zodi: ");
        String w2 = sc.nextLine();

        System.out.println(stringMix.mix(w1, w2));

    }

    private StringBuilder mix(String w1, String w2) {

        StringBuilder mix = new StringBuilder();

        String first = w1;
        String second = w2;

        if (first.length() > w2.length()) {
            first = w2;
            second = w1;
        }

        for (int i = 0; i < first.length(); i++) {
            mix.append(first.charAt(i)).append(second.charAt(i));
        }

        mix.append(second.substring(first.length(), second.length()));
        return mix;
    }
}
