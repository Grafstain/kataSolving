package fundamentals.kyu8;

import java.util.Locale;

public class ALTerNAtiNG_CaSe {


    public static String toAlternativeString(String string) {
        String result = "";
        for (char c : string.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("mr Spooke"));
        System.out.println(toAlternativeString("altERnaTIng cAsE"));

    }
}
