package fundamentals.kyu8;

public class Remove_exclamation_marks {

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!","");
    }

    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("dsfsdf!!!dfsdf!!"));


    }
}
