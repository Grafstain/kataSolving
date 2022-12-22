package fundamentals.kyu8;

/* Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
  y is not considered a vowel for this kata

        "hello"     -->  "hll"
         "codewars"  -->  "cdwrs"
         "goodbye"   -->  "gdby"
         "HELLO"     -->  "HELLO"

  */
public class Vowel_remover {
    public static void main(String[] args) {
        String result = "HELLO";
        System.out.println(result.replaceAll("[ieaou]",""));
    }

}
