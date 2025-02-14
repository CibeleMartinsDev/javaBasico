package dayFour;

import java.util.Arrays;

public class StringEspacos {

    public static String addEspacosString(String string){
        String letters = string.replace("", " ").trim();
        return letters;
    }
}
