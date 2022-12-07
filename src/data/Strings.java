package data;

import javax.print.DocFlavor;

public class Strings {
    private String text;
    private int lenght;

    public static int Lenght (String text){
        return text.length();
    }

    public static String Replace (String text){
        return text.replace('s', '!');
    }

}
