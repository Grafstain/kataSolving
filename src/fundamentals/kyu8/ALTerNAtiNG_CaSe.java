package fundamentals.kyu8;

import java.util.Locale;

public class ALTerNAtiNG_CaSe {


    public static String toAlternativeString(String string) {
        // your code here!
        String newString = "";
        for(int i=0; i<string.length();i++){
            if(string.substring(i,i+1).equals(string.substring(i,i+1).toUpperCase())){
                 newString += string.substring(i,i+1).toLowerCase();
            }else {
                 newString += string.substring(i, i+1).toUpperCase();
            }
        }
        return newString;

    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("mr Spooke"));
        System.out.println(toAlternativeString("altERnaTIng cAsE"));

    }
}
