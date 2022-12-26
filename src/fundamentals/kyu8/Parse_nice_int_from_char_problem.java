package fundamentals.kyu8;

public class Parse_nice_int_from_char_problem {


    public static int howOld(final String herOld) {

        //your code here, return correct age as int ; )
        return Integer.parseInt(herOld.substring(0,1));

    }

    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
        System.out.println(howOld("9 years old"));
    }
}
