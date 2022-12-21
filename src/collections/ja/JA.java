package collections.ja;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JA {
    private static final String CODES = "32 tarpas;65 A;82 R;105 i;33 !;66 B;83 S;106 j;44 ,;67 C;84 T;" +
            "107 k;46 .;68 D;85 U;108 l;48 0;69 E;86 V;109 m;49 1;70 F;87 W;110 n;50 2;71 G;88 X;111 o;" +
            "51 3;72 H;89 Y;112 p;52 4;73 I;90 Z;113 q;53 5;74 J;97 a;114 r;54 6;75 K;98 b;115 s;55 7;76 L;" +
            "99 c;116 t;56 8;77 M;100 d;117 u;57 9;78 N;101 e;118 v;63 ?;79 O;102 f;119 w;80 P;103 g;120 x;" +
            "81 Q;104 h;121 y;122 z";
    private Map<String, String> codeMap;
    private Map<String, String> reversedCodeMap;
    StringBuilder text = new StringBuilder();

    public static void main(String[] args) {
        JA ja = new JA();
        Scanner sc = new Scanner(System.in);

        ja.doTheAction(sc);
    }

    private void doTheAction(Scanner sc) {

        String action;

        while (true) {
            printMenu();
            action = sc.nextLine();
            switch (action) {
                case "0" -> checkNewCoding(sc);
                case "1" -> jaToLetter(sc);
                case "2" -> letterToJa(sc);
                case "3" -> {
                    System.out.println("FINISHING...");
                    return;
                }
                default -> System.out.println("There is no such action...\n");
            }
        }
    }

    private void printMenu() {
        String info = """
                                
                0 - Check if coding is right
                1 - JA to letter
                2 - Letter to JA
                3 - END
                """;
        System.out.println(info);
    }

    private void codeTableToMap() {
        codeMap = new HashMap<>();

        String[] codeArray = JA.CODES.split(";");

        for (String s : codeArray) {

            String[] code = s.split(" ");

            if (code[1].equals("tarpas")) {
                codeMap.put(code[0], " ");

            } else {
                codeMap.put(code[0], code[1]);
            }
        }
    }

    private void reversedCodeTableToMap() {
        reversedCodeMap = new HashMap<>();
        codeMap.forEach((key, value) -> reversedCodeMap.put(value, key));
    }

    private void checkNewCoding(Scanner sc) {
        if (codeMap == null) {
            codeTableToMap();
        }
        System.out.println("Input text to check for right coding to JA: ");
        String[] codedLetter = sc.nextLine().split(" ");
        boolean isRight = true;

        for (String s : codedLetter) {
            if (!containsJA(s)) {
                System.out.println(s + " - Wrong code symbol.");
                isRight = false;
            }
        }
        if (isRight) {
            System.out.println("Code is right.");
        }
    }

    private boolean containsJA(String k) {

        return codeMap.containsKey(k);
    }

    private void jaToLetter(Scanner sc) {
        if (codeMap == null) {
            codeTableToMap();
        }
        System.out.println("Input letter to decode from JA: ");
        String[] codedLetter = sc.nextLine().split(" ");

        for (String s : codedLetter) {

            text.append(codeMap.get(s));
        }

        System.out.println(text);
        text.setLength(0);
    }

    private void letterToJa(Scanner sc) {
        if (reversedCodeMap == null) {
            codeTableToMap();
            reversedCodeTableToMap();
        }
        System.out.println("Input letter for code to JA: ");
        String letterToBeCoded = sc.nextLine();

        for (int i = 0; i < letterToBeCoded.length(); i++) {
            text.append(reversedCodeMap.get(String.valueOf(letterToBeCoded.charAt(i)))).append(" ");
        }
        text.deleteCharAt(text.length() - 1);

        System.out.println(text);
        text.setLength(0);
    }
}
